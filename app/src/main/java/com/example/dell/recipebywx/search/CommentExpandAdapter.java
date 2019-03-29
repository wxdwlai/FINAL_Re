package com.example.dell.recipebywx.search;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.BottomSheetBehavior;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.CollectResponseModel;
import com.example.dell.recipebywx.model.CommonModel;
import com.example.dell.recipebywx.model.RecipeDetailModel;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.my.UserInfoActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentExpandAdapter extends BaseExpandableListAdapter {
    private static final String TAG = "CommentExpandAdapter";
    private List<RecipeDetailModel.DataBean.CommentsBean> commentBeanList;//一级评论list
    private List<RecipeDetailModel.DataBean.CommentsBean.CommentRepliesBean> replyBeanList;//回复评论list
    private Context context;
    private LocalUserInfo localUserInfo;//本地用户信息
    private int pageIndex = 1;//分页加载
    private RecipeDetailModel.DataBean dataBean;

    private CommentBottomSheetDialog dialog;//发表评论提示框
    private String parentId;

    private List<RecipeDetailModel.DataBean.CommentsBean.CommentRepliesBean> replyBean;

    private UserInforModel userInforModel;

    public CommentExpandAdapter(Context context, List<RecipeDetailModel.DataBean.CommentsBean> commentBeanList, String postId) {
        this.context = context;
        localUserInfo = new LocalUserInfo(context);
        this.commentBeanList = commentBeanList;
    }

    public CommentExpandAdapter(Context context, RecipeDetailModel.DataBean dataBean) {
        this.context = context;
        localUserInfo = new LocalUserInfo(context);
        this.dataBean = dataBean;
        commentBeanList = dataBean.getComments();
    }

    @Override
    public int getGroupCount() {
        return commentBeanList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return commentBeanList.get(i).getCommentReplies().size();
//        if(commentBeanList.get(i).getComments() == null){
//            return 0;
//        }else{
//            return commentBeanList.get(i).getComments().size()>0 ? commentBeanList.get(i).getComments().size():0;
//        }
//        if(commentBeanList.get(i).getComments() == null && commentBeanList.get(i).getComments().size()<0){
//            return 0;
//        }else if (commentBeanList.get(i).getComments().size()>0 && commentBeanList.get(i).getComments().size()<=3){
//            return commentBeanList.get(i).getComments().size();
//        } else {
//            return 3;
//        }
    }

    @Override
    public Object getGroup(int i) {
        return commentBeanList.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return commentBeanList.get(i).getCommentReplies().get(i1);
//        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return getCombinedChildId(groupPosition, childPosition);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
    boolean isLike = false;

    @Override
    public View getGroupView(final int groupPosition, boolean isExpand, View convertView, final ViewGroup viewGroup) {
        final GroupHolder groupHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.comment_item_layout, viewGroup, false);
            groupHolder = new GroupHolder(convertView,groupPosition);
            convertView.setTag(groupHolder);
        }else {
            groupHolder = (GroupHolder) convertView.getTag();
        }
        //设置用户信息：头像、昵称、性别等
        groupHolder.tv_name.setText(commentBeanList.get(groupPosition).getUserInfo().getUserName());
        if (commentBeanList.get(groupPosition).getUserInfo().getSex() == 1) {
            groupHolder.iv_sex.setImageResource(R.drawable.boy2);
        }
        else {
            groupHolder.iv_sex.setImageResource(R.drawable.girl2);
        }
        Glide.with(context)
                .load(commentBeanList.get(groupPosition).getUserInfo().getImage())
                .transform(new GlideCircleTransform(context))
                .into(groupHolder.logo);
        groupHolder.tv_content.setText(commentBeanList.get(groupPosition).getContext());
        //显示时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Long time = commentBeanList.get(groupPosition).getCreateTime();
        String d = dateFormat.format(time);
        try {
            Date date = dateFormat.parse(d);
            groupHolder.tv_time.setText(d);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        //显示评论数量
        if (commentBeanList.get(groupPosition).getCommentReplies().size() != 0) {
            groupHolder.tv_comment_count.setText(String.valueOf(commentBeanList.get(groupPosition).getCommentReplies().size()));
        }
//        groupHolder.tv_name.setText(commentBeanList.get(groupPosition).getPuid());
//        Glide.with(context).load(R.drawable.fishpond)
//                .diskCacheStrategy(DiskCacheStrategy.RESULT)
//                .error(R.mipmap.ic_launcher)
//                .centerCrop()
//                .into(groupHolder.logo);
//        XutilsHttp.getInstance().bindCircularImage3(groupHolder.logo,commentBeanList.get(groupPosition).getRuser().getImage() , 0);
//        groupHolder.tv_name.setText(commentBeanList.get(groupPosition).getRuser().getName());
//        groupHolder.tv_time.setText(commentBeanList.get(groupPosition).getCreatedttm());
//        groupHolder.tv_content.setText(commentBeanList.get(groupPosition).getContent());
//        groupHolder.tv_ups_count.setText(commentBeanList.get(groupPosition).getUpNumber());
//        if (commentBeanList.get(groupPosition).isUpped()){
//            groupHolder.iv_like.setImageResource(R.drawable.zan2);
//        }
//        else {
//            groupHolder.iv_like.setImageResource(R.drawable.zan);
//        }
//        //逻辑处理
//        if (localUserInfo.getUserInfo().getUserId().equals(commentBeanList.get(groupPosition).getRuser().getId())) {
//            groupHolder.deleteCommentLl.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    groupHolder.deleteCommentLl.setVisibility(View.VISIBLE);
//                    showBottomDialog(groupPosition);
//                }
//            });
//        } else {
//            groupHolder.deleteCommentLl.setVisibility(View.GONE);
//        }
//
//        groupHolder.groupPosition = groupPosition;
//
//        //点击用户头像、昵称进入到用户主页
//        groupHolder.commentItemIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(viewGroup.getContext(),UserInformationActivity.class);
//                intent.putExtra("userId",commentBeanList.get(groupPosition).getRuser().getId());
//                context.startActivity(intent);
//            }
//        });
//        groupHolder.commentItemLl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(viewGroup.getContext(),UserInformationActivity.class);
//                intent.putExtra("userId",commentBeanList.get(groupPosition).getRuser().getId());
//                context.startActivity(intent);
//            }
//        });
//
//        groupHolder.tv_comment_count.setText(String.valueOf(commentBeanList.get(groupPosition).getComments().size()));
//        groupHolder.iv_like.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(isLike){
//                    isLike = false;
//                    groupHolder.iv_like.setImageResource(R.drawable.zan);
//                }else {
//                    isLike = true;
//                    groupHolder.iv_like.setImageResource(R.drawable.zan2);
//                }
//            }
//        });

        //跳转评论详情页
//        if (commentBeanList.get(groupPosition).getComments().size() <= 3) {
//            groupHolder.moreTv.setVisibility(View.GONE);
//        } else {
//            groupHolder.moreTv.setVisibility(View.VISIBLE);
//            groupHolder.moreTv.setText("共"+commentBeanList.get(groupPosition).getComments().size()+"条回复>");
//            groupHolder.moreTv.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(viewGroup.getContext(),ReviewDetailActivity.class);
//                    intent.putExtra("postId",postId);
//                    intent.putExtra("commentId",commentBeanList.get(groupPosition).getId());
//                    viewGroup.getContext().startActivity(intent);
////                    Toast.makeText(viewGroup.getContext(),"评论详情页",Toast.LENGTH_SHORT).show();
//
//                }
//            });
//        }
//        if (commentBeanList.get(groupPosition).getRuser().getSex() == 0){
//            groupHolder.iv_sex.setVisibility(View.GONE);
//        }
//        else if(commentBeanList.get(groupPosition).getRuser().getSex() == 1){
//            groupHolder.iv_sex.setVisibility(View.VISIBLE);
//            groupHolder.iv_sex.setImageResource(R.drawable.boy);
//
//        }
//        else {
//            groupHolder.iv_sex.setVisibility(View.VISIBLE);
//            groupHolder.iv_sex.setImageResource(R.drawable.girl);
//        }

        groupHolder.upsLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
//                    postUps(commentBeanList.get(groupPosition).getId(),groupPosition);
//                } else {
//                    TieziContentActivity.instance.startActivity (new Intent(context, LoginActivity.class));
//                }
            }
        });

        //二级评论逻辑入口
        if (localUserInfo.getUserInfo().getUid() != "0") {
            groupHolder.commentsLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
                        //二级评论逻辑处理
                        showCommentDialog(groupPosition);

                    } else {
//                    TieziContentActivity.instance.startActivity (new Intent(context, LoginActivity.class));
                    }
                }
            });
        }
        else {
            groupHolder.commentsLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
                        Toast.makeText(context,"登录后才能操作哦~",Toast.LENGTH_SHORT).show();
                    } else {
                    }
                }
            });
        }


        //进入评论人信息详情页
        groupHolder.logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,UserInfoActivity.class);
                intent.putExtra("userId",String.valueOf(commentBeanList.get(groupPosition).getPuid()));
                context.startActivity(intent);
            }
        });
//        groupHolder.commentsLl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
////                    //二级评论逻辑处理
////                    showCommentDialog(groupPosition);
////
////                } else {
//////                    TieziContentActivity.instance.startActivity (new Intent(context, LoginActivity.class));
////                }
//            }
//        });


        return convertView;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean b, View convertView, ViewGroup viewGroup) {
        final ChildHolder childHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.comment_reply_item_layout,viewGroup, false);
            childHolder = new ChildHolder(convertView);
            convertView.setTag(childHolder);
        }
        else {
            childHolder = (ChildHolder) convertView.getTag();
        }
        childHolder.groupPosition = groupPosition;
        replyBean = commentBeanList.get(groupPosition).getCommentReplies();
//        childHolder.fromUserTv.setText(replyBean.get(childPosition).getUserInfo().getUserName());
        childHolder.tv_name.setText(replyBean.get(childPosition).getUserInfo().getUserName()+":");//commentBeanList.get(groupPosition).getUserInfo().getUserName()+":");
        childHolder.tv_content.setText(replyBean.get(childPosition).getContext());
//        Glide.with(context).load(replyBean.get(childPosition).getUserInfo().getImage())
//                .transform(new GlideCircleTransform(context))
//                .into(childHolder.userIconIv);
//        childHolder.fromUserTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context,UserInfoActivity.class);
//                intent.putExtra("userId",String.valueOf(replyBean.get(childPosition).getUserInfo().getUid()));
//                context.startActivity(intent);
//            }
//        });
//        replyBean = commentBeanList.get(groupPosition).getComments();
//        if (replyBean.size() <= 3) {
//            String replyUser = commentBeanList.get(groupPosition).getComments().get(childPosition).getRuserX().getName();
//            if(!TextUtils.isEmpty(replyUser)){
//                childHolder.tv_name.setText(replyUser +" 回复 "+commentBeanList.get(groupPosition).getComments().get(childPosition).getPuser().getName() + ":");
//            }else {
//                childHolder.tv_name.setText("无名"+":");
//            }
////        childHolder.tv_content.setText("测试评论");
//            childHolder.tv_content.setText(commentBeanList.get(groupPosition).getComments().get(childPosition).getContentX());
//        } else {
//            for (int i=0;i<3;i++) {
//                String replyUser = commentBeanList.get(groupPosition).getComments().get(childPosition).getRuserX().getName();
//                if(!TextUtils.isEmpty(replyUser)){
//                    childHolder.tv_name.setText(replyUser +" 回复 "+commentBeanList.get(groupPosition).getComments().get(childPosition).getPuser().getName() + ":");
//                }else {
//                    childHolder.tv_name.setText("无名"+":");
//                }
//                childHolder.tv_content.setText(commentBeanList.get(groupPosition).getComments().get(childPosition).getContentX());
//
//            }
//        }

//        String replyUser = commentBeanList.get(groupPosition).getComments().get(childPosition).getRuserX().getName();
//        if(!TextUtils.isEmpty(replyUser)){
//            childHolder.tv_name.setText(replyUser +" 回复 "+commentBeanList.get(groupPosition).getComments().get(childPosition).getPuser().getName() + ":");
//        }else {
//            childHolder.tv_name.setText("无名"+":");
//        }
////        childHolder.tv_content.setText("测试评论");
//        childHolder.tv_content.setText(commentBeanList.get(groupPosition).getComments().get(childPosition).getContentX());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }

    public class GroupHolder{
        public LinearLayout upsLl;
        private ImageView logo;
        private TextView tv_name, tv_content, tv_time,tv_ups_count;
        private ImageView iv_like,iv_sex;
        private LinearLayout deleteCommentLl;
        private ImageView commentItemIcon;
        private LinearLayout commentItemLl;

        private LinearLayout commentsLl;
        private ImageView commentIv;
        private TextView tv_comment_count;
        private int groupPosition;
        private TextView moreTv;
        public GroupHolder(View view, final int groupPosition) {
            this.groupPosition = groupPosition;
            logo = (ImageView) view.findViewById(R.id.comment_item_logo);
            tv_content = (TextView) view.findViewById(R.id.comment_item_content);
            tv_name = (TextView) view.findViewById(R.id.comment_item_userName);
            tv_time = (TextView) view.findViewById(R.id.comment_item_time);
            iv_like = (ImageView) view.findViewById(R.id.comment_item_like);
            tv_ups_count = (TextView)view.findViewById(R.id.id_comment_up_count_tv);
            iv_sex = (ImageView)view.findViewById(R.id.id_user_sex_iv);
            upsLl = (LinearLayout)view.findViewById(R.id.id_ups_ll);
            deleteCommentLl = (LinearLayout)view.findViewById(R.id.delete_comment_ll);
            commentItemIcon = (ImageView)view.findViewById(R.id.comment_item_logo);
            commentItemLl = (LinearLayout)view.findViewById(R.id.comment_item_ll);

            commentsLl = (LinearLayout)view.findViewById(R.id.id_comment_ll);
            commentIv = (ImageView)view.findViewById(R.id.id_comment_iv);
            tv_comment_count = (TextView)view.findViewById(R.id.id_comment_count_tv);

            moreTv = (TextView)view.findViewById(R.id.more_review_tv);
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(context.getApplicationContext(),UserInfoActivity.class);
//                    intent.putExtra("userId",String.valueOf(commentBeanList.get(groupPosition).getPuid()));
//                    context.startActivity(intent);
//                }
//            });

        }
    }

    private class ChildHolder{
        private int groupPosition;
        private TextView tv_name, tv_content;
        private TextView fromUserTv;
        private TextView moreTv;
        private ImageView userIconIv;
        public ChildHolder(View view) {
            tv_name = (TextView) view.findViewById(R.id.reply_item_user);
            tv_content = (TextView) view.findViewById(R.id.reply_item_content);
//            fromUserTv = (TextView)view.findViewById(R.id.from_user);
            moreTv = (TextView)view.findViewById(R.id.more_tv);
//            userIconIv = (ImageView)view.findViewById(R.id.user_icon_iv);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    showCommentDialog(groupPosition);
                    //跳转评论详情页
//                    if (commentBeanList.get(groupPosition).getComments().size() <= 3) {
////                        groupHolder.moreTv.setVisibility(View.GONE);
//                    } else {
//                        Intent intent = new Intent(v.getContext(),ReviewDetailActivity.class);
//                        intent.putExtra("postId",postId);
//                        intent.putExtra("commentId",commentBeanList.get(groupPosition).getId());
//                        v.getContext().startActivity(intent);
////                        Toast.makeText(v.getContext(),"评论详情页",Toast.LENGTH_SHORT).show();
//                    }
                }
            });
        }
    }


    /**
     * by moos on 2018/04/20
     * func:评论成功后插入一条数据
     * @param commentDetailBean 新的评论数据
     */
    public void addTheCommentData(RecipeDetailModel.DataBean.CommentsBean commentDetailBean){
        if(commentDetailBean!=null){
            commentBeanList.add(commentDetailBean);
            notifyDataSetChanged();
        }else {
            throw new IllegalArgumentException("评论数据为空!");
        }

    }

    /**
     * by moos on 2018/04/20
     * func:回复成功后插入一条数据
     * @param replyDetailBean 新的回复数据
     */
//    public void addTheReplyData(PostDetailModel.DataBean.RcommentBean.CommentsBean replyDetailBean, int groupPosition){
//        if(replyDetailBean!=null){
//            Log.e(TAG, "addTheReplyData: >>>>该刷新回复列表了:"+replyDetailBean.toString() );
//            if(commentBeanList.get(groupPosition).getComments() != null ){
//                commentBeanList.get(groupPosition).getComments().add(replyDetailBean);
//            }else {
//                List<PostDetailModel.DataBean.RcommentBean.CommentsBean> replyList = new ArrayList<>();
//                replyList.add(replyDetailBean);
//                commentBeanList.get(groupPosition).setComments(replyList);
//            }
//            notifyDataSetChanged();
//        }else {
//            throw new IllegalArgumentException("回复数据为空!");
//        }
//
//    }

    /**
     * by moos on 2018/04/20
     * func:添加和展示所有回复
     * @param replyBeanList 所有回复数据
     * @param groupPosition 当前的评论
     */
//    private void addReplyList(List<PostDetailModel.DataBean.RcommentBean.CommentsBean> replyBeanList, int groupPosition){
//        if(commentBeanList.get(groupPosition).getComments() != null ){
//            commentBeanList.get(groupPosition).getComments().clear();
//            commentBeanList.get(groupPosition).getComments().addAll(replyBeanList);
//        }else {
//
//            commentBeanList.get(groupPosition).setComments(replyBeanList);
//        }
//
//        notifyDataSetChanged();
//    }
//    private void postUps(String id, final int position){
//        Map<String, Object> map = new HashMap<>();
//        map.put("id",id);
//        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
//            map.put("x-auth-token", localUserInfo.getUserInfo().getToken());
//        }
//        XutilsHttp.getInstance().post(ServiceAPI.PostCommentUpsUrl, null, map, new XutilsHttp.XCallBack() {
//            @Override
//            public void onResponse(String result) {
//                if (result.length() != 0){
//                    Gson gson = new Gson();
//                    RequestResultModel requestResultModel = gson.fromJson(result,RequestResultModel.class);
//                    if (requestResultModel.isSuccess()){
//                        commentBeanList.get(position).setUpped(!commentBeanList.get(position).isUpped());
//                        if (commentBeanList.get(position).isUpped()){
//                            commentBeanList.get(position).setUpNumber(Integer.parseInt(commentBeanList.get(position).getUpNumber())+1+"");
//                        }
//                        else {
//                            commentBeanList.get(position).setUpNumber(Integer.parseInt(commentBeanList.get(position).getUpNumber())-1+"");
//                        }
//                        notifyDataSetChanged();
//                    }
//                    else {
//                        if ("900002".equals(requestResultModel.getErrorCode())) {//
//                            localUserInfo.clear();
//                            TieziContentActivity.instance.startActivity(new Intent(context, LoginActivity.class));
//                        }
//                    }
//                }
//
//
//            }
//
//            @Override
//            public void onError(String result) {
//
//            }
//        });
//    }

    /**
     * 删除评论
     */
//    public void deleteComment(final int position) {
//        Map<String,String> map = new HashMap<>();
//        map.put("commentId",commentBeanList.get(position).getId());
//        if ("0" != localUserInfo.getUserInfo().getToken()) {
//            map.put("x-auth-token",localUserInfo.getUserInfo().getToken());
//        }
//        XutilsHttp.getInstance().delete(ServiceAPI.UserDeleteCommetUrl, map, null, new XutilsHttp.XCallBack() {
//            @Override
//            public void onResponse(String result) {
//                Gson gson = new Gson();
//                if (result != null) {
//                    CommonResultModel commonResultModel = gson.fromJson(result,CommonResultModel.class);
//                    if (commonResultModel.isSuccess()) {
//                        commentBeanList.remove(position);
//                        notifyDataSetChanged();
//                    }
//                    else {
//                        //删除失败
//                    }
//                }
//            }
//
//            @Override
//            public void onError(String result) {
//
//            }
//        });
//    }

    /**
     * 删除评论弹出框
     */
    private void showBottomDialog(final int groupPosition){
        //1、使用Dialog、设置style
        final Dialog dialog = new Dialog(context);
        //2、设置布局
        View view = View.inflate(context,R.layout.layout_delete_post_dialog,null);
        dialog.setContentView(view);

        Window window = dialog.getWindow();
        //设置弹出位置
        window.setGravity(Gravity.BOTTOM);
        //设置弹出动画
        //设置对话框大小
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.show();

        dialog.findViewById(R.id.choice_delete_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                deleteUserPost();
//                new NDialog(context)
//                        .setTitleSize(16)
//                        .setTitle("确认删除此评论")
//                        .setNegativeButtonText("取消")
//                        .setPositiveTextColor(Color.parseColor("#FC6882"))
//                        .setPositiveButtonText("确认")
//                        .setCancleable(true)
//                        .setOnConfirmListener(new NDialog.OnConfirmListener() {
//                            @Override
//                            public void onClick(int which) {
//                                if (which == 1) {
//                                    deleteComment(groupPosition);
//                                }
//                            }
//                        }).create(NDialog.CONFIRM).show();
                dialog.dismiss();
            }
        });

        dialog.findViewById(R.id.choice_cancle_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }

    /**
     * func:弹出评论输入框
     */
    private void showCommentDialog(final int groupPosition) {
        dialog = new CommentBottomSheetDialog(context,R.style.BottomSheetEdit);
        View commentView = LayoutInflater.from(context).inflate(R.layout.comment_dialog_layout, null);
        final EditText commentText = (EditText) commentView.findViewById(R.id.dialog_comment_et);
        final Button bt_comment = (Button) commentView.findViewById(R.id.dialog_comment_bt);
        dialog.setContentView(commentView);
        /**
         * 解决bsd显示不全的情况
         */
        View parent = (View) commentView.getParent();
        BottomSheetBehavior behavior = BottomSheetBehavior.from(parent);
        commentView.measure(0, 0);
        behavior.setPeekHeight(commentView.getMeasuredHeight());

        bt_comment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String commentContent = commentText.getText().toString().trim();
                if (!TextUtils.isEmpty(commentContent)) {
                    postComment(commentContent,groupPosition);
                } else {
                    Toast.makeText(context, "评论内容不能为空", Toast.LENGTH_SHORT).show();
                }
            }
        });
        commentText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!TextUtils.isEmpty(charSequence)) {
                    bt_comment.setBackgroundColor(Color.parseColor("#FC6882"));
                } else {
                    bt_comment.setBackgroundColor(Color.parseColor("#D8D8D8"));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        dialog.show();
    }

    /**
     *
     * 获取用户信息
     * @param id
     */
    public void getUser(final int id, final GroupHolder holder) {
        Map<String, String> map = new HashMap<>();
        map.put("uid",String.valueOf(id));
        XutilsHttp.getInstance().get(ServiceAPI.GetUser, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    userInforModel = gson.fromJson(result,UserInforModel.class);
                    if (userInforModel.isSuccess()) {
                        holder.tv_name.setText(userInforModel.getData().getUserName());
                        if (userInforModel.getData().getSex()==1) {
                            holder.iv_sex.setImageResource(R.drawable.boy2);
                        }
                        else {
                            holder.iv_sex.setImageResource(R.drawable.girl2);
                        }
                        Glide.with(context).load(userInforModel.getData().getImage())
                                .transform(new GlideCircleTransform(context))
                                .into(holder.logo);
                    }
//                    if (userInforModel.isSuccess()) {
//                        userNameEtv.setText(userInforModel.getData().getUserName());
//                        if (userInforModel.getData().getSex() == 1) {
//                            userSexTv.setText("男");
//                        } else {
//                            userSexTv.setText("女");
//                        }
//                        Glide.with(getApplicationContext())
//                                .load(userInforModel.getData().getImage())
//                                .transform(new CenterCrop(getApplicationContext()),new GlideCircleTransform(getApplicationContext()))
//                                .into(headIconIv);
////                        XutilsHttp.getInstance().bindCircularImage(headIconIv, userInforModel.getData().getImage());
//                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

//        发二级评论
    public void postComment(final String comment, final int groupPosition) {
        int mmid = commentBeanList.get(groupPosition).getMid();
        int ruid = commentBeanList.get(groupPosition).getPuid();
        String puid = localUserInfo.getUserInfo().getUid();
        Map<String, Object> map = new HashMap<>();
        map.put("context", comment);
        map.put("mmid", mmid);
        map.put("puid", puid);
        map.put("ruid",ruid);
        map.put("type",2);
        map.put("reid",commentBeanList.get(groupPosition).getReid());
//        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
//            map.put("x-auth-token", localUserInfo.getUserInfo().getToken());
//        }
        XutilsHttp.getInstance().put(ServiceAPI.addComment, null, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    Gson gson = new Gson();
                    CommonModel commonModel = gson.fromJson(result,CommonModel.class);
                    if (commonModel.isSuccess()) {
                        if (commonModel.getErrorCode() == 0) {
                            dialog.dismiss();
//                            getRecipeDetail();
                            Toast.makeText(context,commonModel.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(context,commonModel.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
//                    Gson gson = new Gson();
//                    RequestResultModel requestResultModel = gson.fromJson(result, RequestResultModel.class);
//                    if (requestResultModel.isSuccess()) {
//                        dialog.dismiss();
////                        addReplyList(replyBean,groupPosition);
////                        emptyTv.setVisibility(View.GONE);
//
//                        Toast.makeText(context, "评论成功", Toast.LENGTH_SHORT).show();
//                    } else {
////                        if ("900002".equals(postDetailModel.getErrorCode())) {//
////                            localUserInfo.clear();
////                            startActivity(new Intent(getApplication(), LoginActivity.class));
////                        }
//                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

//    private void getRecipeDetail() {
//        final Map<String, String> map = new HashMap<>();
//        map.put("reid",reid);
//        XutilsHttp.getInstance().get(ServiceAPI.RecipeDetail, map, new XutilsHttp.XCallBack() {
//            @Override
//            public void onResponse(String result) {
//                if (result != null) {
//                    Gson gson = new Gson();
//                    recipeDetailModel = gson.fromJson(result,RecipeDetailModel.class);
//                    if (recipeDetailModel.isSuccess()) {
//                        stepsList = recipeDetailModel.getData().getData().getStepsList();
//                        commentsBeans = recipeDetailModel.getData().getData().getComments();
//                        if (recyclerView == null) {
//                            initRecyclerView();
//                        }
//                        else {
//                            recipeAdapter.notifyDataSetChanged();
//                        }
//                        //封面图片
//                        XutilsHttp.getInstance().bindCircularImage2(cookingImgIv,recipeDetailModel.getData().getData().getImage());
//                        //菜名
//                        cookingNameTv.setText(recipeDetailModel.getData().getData().getTitle());
//                        cookingMateriaTv.setText(recipeDetailModel.getData().getData().getIngs());
//
//                        //判断当前用户是否收藏菜谱
//                        boolean isCollect = false;
//                        List<RecipeDetailModel.DataBeanX.DataBean.UserCollectsBean> collectsBeanList = recipeDetailModel.getData().getData().getUserCollects();
//                        for (int i=0;i<collectsBeanList.size();i++) {
//                            if (map.get("reid").equals(String.valueOf(collectsBeanList.get(i).getReid()))) {
//                                isCollect = true;
//                                break;
//                            }
//                        }
//                        if (isCollect) {
//                            collectIv.setImageResource(R.drawable.heart);
//                            int num = recipeDetailModel.getData().getData().getUserCollects().size();
//                            if (num != 0) {
//                                collectTv.setText(num + "·收藏");
//                            }
//                            else {
//                                collectTv.setText("收藏");
//                            }
//
//                        }
//                        else {
//                            collectIv.setImageResource(R.drawable.heart_blank);
//                            int num = recipeDetailModel.getData().getData().getUserCollects().size();
//                            if (num != 0) {
//                                collectTv.setText(num + "·收藏");
//                            }
//                            else {
//                                collectTv.setText("收藏");
//                            }
//                        }
//                        if (commentsBeans.size() != 0) {
//                            initComment();
//                        }
//
//                    }
//                }
//            }
//
//            @Override
//            public void onError(String result) {
//
//            }
//        });
//    }
}
