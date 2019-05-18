package com.example.dell.recipebywx.search;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.example.dell.recipebywx.model.RecipeModel;
import com.example.dell.recipebywx.my.UserActivity;
import com.example.dell.recipebywx.my.UserInfoActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.CommentExpandableListView;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.GlideRoundTransform;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 菜谱展示详情页面
 */

public class RecipeDetailActivity extends AppCompatActivity{

    private LocalUserInfo localUserInfo;
    private LinearLayout back;
    private TextView title;
    private TextView toolbarTitle;
    private ImageView cookingImgIv;
    private TextView cookingNameTv;
    private TextView cookingMateriaTv;
    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    private RecipeDetailModel recipeDetailModel;
    private ImageView toolBarRightIv;
    private List<RecipeDetailModel.DataBean.StepsListBean> stepsList = new ArrayList<>();

    private LinearLayout userLl;
    private ImageView userIconIv;
    private TextView userNameTv;
    private ImageView userSexIv;
    private TextView commentDetailTv;
    private TextView emptyCommentTv;


    private LinearLayout commentLl;
    private TextView commentTv;
    private LinearLayout likeLl;
    private ImageView likeIv;
    private TextView likeTv;
    private LinearLayout collectLl;
    private ImageView collectIv;
    private TextView collectTv;

    private String reid = "1";//默认为1

    private CommentBottomSheetDialog dialog;
    private CommentExpandableListView commentLv;
    private CommentExpandAdapter commentAdapter;
    private List<RecipeDetailModel.DataBean.CommentsBean> commentsBeans = new ArrayList<>();
    private List<RecipeDetailModel.DataBean.CommentsBean.CommentRepliesBean> commentRepliesBeans = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        reid = getIntent().getStringExtra("reid");
        this.changeStatusBarTextColor(true);
        initView();
    }

    private void initView() {
        initData();
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        title = (TextView)findViewById(R.id.toolbar_center_tv);
        toolbarTitle = (TextView)findViewById(R.id.toolbar_center_tv);
        toolBarRightIv = (ImageView)findViewById(R.id.toolbar_right_image);
        cookingImgIv = (ImageView)findViewById(R.id.cooking_iv);
        cookingNameTv = (TextView)findViewById(R.id.cooking_name_tv);
//        userLl = (LinearLayout)findViewById(R.id.user_ll);
        userIconIv = (ImageView)findViewById(R.id.user_icon_iv);
        userNameTv = (TextView)findViewById(R.id.user_name_tv);
        userSexIv = (ImageView)findViewById(R.id.user_sex_iv);
        cookingMateriaTv = (TextView)findViewById(R.id.cooking_materia_tv);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        commentDetailTv = (TextView)findViewById(R.id.comment_detail_tv);
        emptyCommentTv = (TextView)findViewById(R.id.empty_tv);
        likeLl = (LinearLayout)findViewById(R.id.like_ll);
        likeIv = (ImageView)findViewById(R.id.like_iv);
        likeTv = (TextView)findViewById(R.id.like_tv);
        collectLl = (LinearLayout)findViewById(R.id.collect_ll);
        collectIv = (ImageView)findViewById(R.id.collect_iv);
        collectTv = (TextView)findViewById(R.id.collect_tv);
        if (localUserInfo.getUserInfo().getUid() != "0") {
            collectLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    postCollect();
                }
            });
        }
        else {
            collectLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(RecipeDetailActivity.this,"登录后才能操作哦~",Toast.LENGTH_SHORT).show();
                }
            });
        }
        if (localUserInfo.getUserInfo().getUid() != "0") {
            likeLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    postLike();
                }
            });
        }
        else {
            likeLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(RecipeDetailActivity.this,"登录后才能操作哦~",Toast.LENGTH_SHORT).show();
                }
            });
        }
        commentTv = (TextView)findViewById(R.id.comment_tv);
        commentLl = (LinearLayout)findViewById(R.id.comment_ll);
        commentLv = (CommentExpandableListView)findViewById(R.id.comment_lv);

        commentDetailTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipeDetailActivity.this,RecipeCommentActivity.class);
                intent.putExtra("reid",reid);
                startActivity(intent);
            }
        });

        if (localUserInfo.getUserInfo().getUid() != "0") {
            commentLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    showCommentDialog();
                    Intent intent = new Intent(RecipeDetailActivity.this,RecipeCommentActivity.class);
                    intent.putExtra("reid",String.valueOf(recipeDetailModel.getData().getReid()));
                    startActivity(intent);
                }
            });
        }
        else {
            commentLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(RecipeDetailActivity.this,"登录后才能操作哦~", Toast.LENGTH_SHORT);
                }
            });
        }

        userNameTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipeDetailActivity.this, UserActivity.class);
                intent.putExtra("userId",String.valueOf(recipeDetailModel.getData().getUid()));
                startActivity(intent);
            }
        });
        userIconIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipeDetailActivity.this, UserActivity.class);
                intent.putExtra("userId",String.valueOf(recipeDetailModel.getData().getUid()));
                startActivity(intent);
            }
        });
        toolBarRightIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipeDetailActivity.this, UserActivity.class);
                intent.putExtra("userId",String.valueOf(recipeDetailModel.getData().getUid()));
                startActivity(intent);
            }
        });
    }

    private void initData() {
        getRecipeDetail();
    }

    private void initRecyclerView() {
        recyclerView = (RecyclerView)findViewById(R.id.recipe_detail_rcy);
        LinearLayoutManager manager = new LinearLayoutManager(RecipeDetailActivity.this,LinearLayoutManager.VERTICAL,false);
        manager.setSmoothScrollbarEnabled(true);
        manager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(manager);
        recipeAdapter = new RecipeAdapter(RecipeDetailActivity.this, stepsList);
        recyclerView.setAdapter(recipeAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new SpaceItemDecoration(DensityUtils.dp2px(RecipeDetailActivity.this,0),DensityUtils.dp2px(RecipeDetailActivity.this,20)));
    }

    /**
     * 底部评论显示
     */
    private void initComment() {
        commentLv = (CommentExpandableListView)findViewById(R.id.comment_lv);
        commentLv.setGroupIndicator(null);
        commentAdapter = new CommentExpandAdapter(RecipeDetailActivity.this,recipeDetailModel.getData());
        commentLv.setAdapter(commentAdapter);
        //默认展开所有回复
        for (int i = 0; i < commentsBeans.size(); i++) {
            commentLv.expandGroup(i);
        }
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    public class RecipeAdapter extends RecyclerView.Adapter<Holder>{

        private Context context;
        private List<RecipeDetailModel.DataBean.StepsListBean> stepsList;

        public RecipeAdapter(Context context,List<RecipeDetailModel.DataBean.StepsListBean> stepsList) {
            this.context = context;
            this.stepsList = stepsList;
        }

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Holder holder = null;
            View view = LayoutInflater.from(context).inflate(R.layout.layout_recipe_step,parent,false);
            holder = new Holder(view);
            return holder;
        }

        /**
         * 数据绑定
         * @param holder
         * @param position
         */
        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.stepTv.setText("步骤 "+stepsList.get(position).getStepId());
            holder.stepDetailTv.setText(stepsList.get(position).getSteps());
            if (stepsList.get(position).getStepImgs() != null) {
                holder.stepIv.setVisibility(View.VISIBLE);
                Glide.with(getApplicationContext())
                        .load(stepsList.get(position).getStepImgs())
                        .transform(new CenterCrop(getApplicationContext()),new GlideRoundTransform(getApplicationContext(),5))
                        .into(holder.stepIv);
//                XutilsHttp.getInstance().bindCircularImage3(holder.stepIv,stepsList.get(position).getStepImgs(),10);
            }
            else {
                holder.stepIv.setVisibility(View.GONE);
            }
        }

        @Override
        public int getItemCount() {
            return stepsList.size();
        }
    }

    public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView stepTv;
        private ImageView stepIv;
        private TextView stepDetailTv;

        public Holder(final View itemView) {
            super(itemView);
            stepTv = (TextView)itemView.findViewById(R.id.step_tv);
            stepIv = (ImageView)itemView.findViewById(R.id.step_iv);
            stepDetailTv = (TextView)itemView.findViewById(R.id.step_detail_tv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(itemView.getContext(),"点击了一下",Toast.LENGTH_LONG).show();
                }
            });
        }

        @Override
        public void onClick(View v) {
//            Toast.makeText(v.getContext(),"点击了一下",Toast.LENGTH_SHORT);
        }
    }

    /**
     * func:弹出评论框
     */
    private void showCommentDialog() {
        dialog = new CommentBottomSheetDialog(this,R.style.BottomSheetEdit);
        View commentView = LayoutInflater.from(this).inflate(R.layout.comment_dialog_layout, null);
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
                    postComment(commentContent);
                } else {
                    Toast.makeText(RecipeDetailActivity.this, "评论内容不能为空", Toast.LENGTH_SHORT).show();
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
     * 获取菜谱详情
     * 3.1日更新：评论展示
     */
    private void getRecipeDetail() {
        final Map<String, String> map = new HashMap<>();
        map.put("reid",reid);
        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
            map.put("x-auth-token",localUserInfo.getUserInfo().getToken());
            map.put("uid",localUserInfo.getUserInfo().getUid());
        }
        else {
            map.put("x-auth-token",localUserInfo.getUserInfo().getToken());
            map.put("uid","0");
        }
        XutilsHttp.getInstance().get(ServiceAPI.RecipeDetail, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    recipeDetailModel = new RecipeDetailModel();
                    recipeDetailModel = new Gson().fromJson(result,RecipeDetailModel.class);
                    if (recipeDetailModel.isSuccess()) {
                        stepsList = recipeDetailModel.getData().getStepsList();
                        commentsBeans = recipeDetailModel.getData().getComments();
                        if (recyclerView == null) {
                            initRecyclerView();
                        }
                        else {
                            recipeAdapter.notifyDataSetChanged();
                        }
                        //封面图片
                        Glide.with(getApplicationContext()).load(recipeDetailModel.getData().getImage())
                                .transform(new GlideRoundTransform(getApplicationContext()))
                                .into(cookingImgIv);
//                        XutilsHttp.getInstance().bindCircularImage2(cookingImgIv,recipeDetailModel.getData().getImage());
                        //菜名
                        title.setText(recipeDetailModel.getData().getTitle());
                        cookingNameTv.setText(recipeDetailModel.getData().getTitle());
                        cookingMateriaTv.setText(recipeDetailModel.getData().getIngs());
                        commentTv.setText(String.valueOf(recipeDetailModel.getData().getComments().size()));
//                        likeTv.setText(String.valueOf(recipeDetailModel.getData().getData().getLikes()));
                        //判断当前用户是否收藏菜谱
                        boolean isCollect = false;
                        List<RecipeDetailModel.DataBean.UserCollectsBean> collectsBeanList = recipeDetailModel.getData().getUserCollects();
                        List<RecipeDetailModel.DataBean.UserCollectsBean> collects = new ArrayList<>();
                        List<RecipeDetailModel.DataBean.UserCollectsBean> likes = new ArrayList<>();
                        for (int i=0;i<collectsBeanList.size();i++) {
                            if (collectsBeanList.get(i).isType()) {
                                likes.add(collectsBeanList.get(i));
                            }
                            else {
                                collects.add(collectsBeanList.get(i));
                            }
                        }
                        for (int i=0;i<collects.size();i++) {
                            if (localUserInfo.getUserInfo().getUid().equals(String.valueOf(collects.get(i).getUid()))
                                    && !collects.get(i).isType()) {
                                isCollect = true;
                                break;
                            }
                        }
                        if (isCollect) {
                            collectIv.setImageResource(R.drawable.heart);
                            int num = collects.size();//recipeDetailModel.getData().getData().getUserCollects().size();
                            if (num != 0) {
                                collectTv.setText(num + "·收藏");
                            }
                            else {
                                collectTv.setText("收藏");
                            }

                        }
                        else {
                            collectIv.setImageResource(R.drawable.heart_blank);
                            int num = collects.size();//recipeDetailModel.getData().getData().getUserCollects().size();
                            if (num != 0) {
                                collectTv.setText(num + "·收藏");
                            }
                            else {
                                collectTv.setText("收藏");
                            }
                        }
                        Boolean isLike = false;
                        for (int i=0;i<likes.size();i++) {
                            if (localUserInfo.getUserInfo().getUid().equals(String.valueOf(likes.get(i).getUid()))
                                    && likes.get(i).isType()) {
                                isLike = true;
                                break;
                            }
                        }
                        if (isLike) {
                            likeIv.setImageResource(R.drawable.like);
                            int num = likes.size();//recipeDetailModel.getData().getData().getUserCollects().size();
                            if (num != 0) {
                                likeTv.setText(num + "·点赞");
                            }
                            else {
                                likeTv.setText("点赞");
                            }
                        }
                        else {
                            likeIv.setImageResource(R.drawable.like_blank);
                            int num = likes.size();//recipeDetailModel.getData().getData().getUserCollects().size();
                            if (num != 0) {
                                likeTv.setText(num + "·点赞");
                            }
                            else {
                                likeTv.setText("点赞");
                            }
                        }
                        if (commentsBeans.size() != 0) {
//                            initComment();
                            commentDetailTv.setText("查看全部评论");
                            emptyCommentTv.setVisibility(View.GONE);
                        }
                        else {
                            emptyCommentTv.setVisibility(View.VISIBLE);
                        }
                        RecipeDetailModel.DataBean.UserInfoBean userInfo = recipeDetailModel.getData().getUserInfo();
//                        XutilsHttp.getInstance().bindCircularImage(userIconIv,userInfo.getImage());
                        Glide.with(getApplicationContext()).load(userInfo.getImage())
                                .transform(new GlideCircleTransform(getApplicationContext())).into(userIconIv);
                        Glide.with(getApplicationContext()).load(userInfo.getImage())
                                .transform(new GlideCircleTransform(getApplicationContext())).into(toolBarRightIv);
                        userNameTv.setText(recipeDetailModel.getData().getUserInfo().getUserName());
                        if (userInfo.getSex() != 0) {
                            userSexIv.setVisibility(View.VISIBLE);
                            if (userInfo.getSex() == 1) {
                                userSexIv.setImageResource(R.drawable.boy2);
                            }
                            else {
                                userSexIv.setImageResource(R.drawable.girl2);
                            }
                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    /**
     * 收藏接口
     */
    private void postCollect() {
        Map<String, String> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        map.put("reid",reid);
        XutilsHttp.getInstance().post(ServiceAPI.CollectRecipe, map, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    CollectResponseModel response = gson.fromJson(result,CollectResponseModel.class);
                    if (response.isSuccess()) {
                        if (response.getMessage().equals("收藏菜谱")) {
                            collectIv.setImageResource(R.drawable.heart);
                            collectTv.setText(response.getData().size()+"·收藏");
                        }
                        else {
                            collectIv.setImageResource(R.drawable.heart_blank);
                            int num = response.getData().size();
                            if (num != 0) {
                                collectTv.setText(num+"·收藏");
                            }
                            else {
                                collectTv.setText("收藏");
                            }
                        }
//                        if (num != 0) {
//                            collectTv.setText(num+"·收藏");
//                        }
//                        else {
//                            collectTv.setText("收藏");
//                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    /**
     * 发布评论接口
     */
    void postComment(final String context) {
        Map<String, Object> map = new HashMap<>();
        map.put("reid",recipeDetailModel.getData().getReid());
        map.put("puid",localUserInfo.getUserInfo().getUid());
        map.put("type",1);
        map.put("context",context);
        XutilsHttp.getInstance().put(ServiceAPI.addComment, null, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    Gson gson = new Gson();
                    CommonModel commonModel = gson.fromJson(result,CommonModel.class);
                    if (commonModel.isSuccess()) {
                        if (commonModel.getErrorCode() == 0) {
                            dialog.dismiss();
                            getRecipeDetail();
                            Toast.makeText(RecipeDetailActivity.this,commonModel.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(RecipeDetailActivity.this,commonModel.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    /**
     * 点赞菜谱接口
     */
    private void postLike() {
        Map map = new HashMap();
        map.put("reid",reid);
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().post(ServiceAPI.likeRecipe, map, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    CollectResponseModel response = new Gson().fromJson(result,CollectResponseModel.class);
                    if (response.isSuccess()) {
                        if (response.getMessage().equals("点赞菜谱")) {
                            likeIv.setImageResource(R.drawable.like);
                            likeTv.setText(response.getData().size()+"·点赞");
                        }
                        else {
                            likeIv.setImageResource(R.drawable.like_blank);
                            int num = response.getData().size();
                            if (num != 0) {
                                likeTv.setText(num+ "·点赞");
                            }
                            else {
                                likeTv.setText("点赞");
                            }
                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }
}
