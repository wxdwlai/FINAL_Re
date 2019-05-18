package com.example.dell.recipebywx.search;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.CommonModel;
import com.example.dell.recipebywx.model.RecipeDetailModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.CommentExpandableListView;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.GlideRoundTransform;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeCommentActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private SmartRefreshLayout refreshLayout;
    private LinearLayout back;
    private TextView emptyTv;

    private CommentBottomSheetDialog dialog;
    private CommentExpandableListView commentLv;
    private CommentExpandAdapter commentAdapter;
    private List<RecipeDetailModel.DataBean.CommentsBean> commentsBeans = new ArrayList<>();
    private RecipeDetailModel recipeDetailModel;
    private String reid;//默认为1
    private LinearLayout commentLl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_comment);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        reid = getIntent().getStringExtra("reid");
        initView();
        this.changeStatusBarTextColor(true);
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    public void initView() {
        getRecipeDetail();
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        emptyTv = (TextView)findViewById(R.id.empty_tv);
        refreshLayout = (SmartRefreshLayout)findViewById(R.id.comment_refresh);
        commentLv = (CommentExpandableListView) findViewById(R.id.comment_lv);
        commentLl = (LinearLayout)findViewById(R.id.comment_ll);
        if (!"0".equals(localUserInfo.getUserInfo().getUid())) {
            commentLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showCommentDialog();
                }
            });
        }
        else {
            commentLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(RecipeCommentActivity.this,"登录后才能操作哦~", Toast.LENGTH_SHORT);
                }
            });
        }

        refreshLayout.setRefreshHeader(new ClassicsHeader(getApplicationContext()));
        refreshLayout.setRefreshFooter(new BallPulseFooter(getApplicationContext()).setSpinnerStyle(SpinnerStyle.Scale));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(1000);
                getRecipeDetail();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(1000);
                getRecipeDetail();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initComment() {
        commentLv = (CommentExpandableListView)findViewById(R.id.comment_lv);
        commentLv.setGroupIndicator(null);
        commentAdapter = new CommentExpandAdapter(RecipeCommentActivity.this,recipeDetailModel.getData());
        commentLv.setAdapter(commentAdapter);
        //默认展开所有回复
        for (int i = 0; i < commentsBeans.size(); i++) {
            commentLv.expandGroup(i);
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
                    Toast.makeText(RecipeCommentActivity.this, "评论内容不能为空", Toast.LENGTH_SHORT).show();
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
                        commentsBeans = recipeDetailModel.getData().getComments();

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
                        if (commentsBeans.size() != 0) {
                            initComment();
                            refreshLayout.setVisibility(View.VISIBLE);
                            emptyTv.setVisibility(View.GONE);
                        }
                        else {
                            refreshLayout.setVisibility(View.GONE);
                            emptyTv.setVisibility(View.VISIBLE);
                        }
                        RecipeDetailModel.DataBean.UserInfoBean userInfo = recipeDetailModel.getData().getUserInfo();
//                        XutilsHttp.getInstance().bindCircularImage(userIconIv,userInfo.getImage());
//                        Glide.with(getApplicationContext()).load(userInfo.getImage())
//                                .transform(new GlideCircleTransform(getApplicationContext())).into(userIconIv);
//                        Glide.with(getApplicationContext()).load(userInfo.getImage())
//                                .transform(new GlideCircleTransform(getApplicationContext())).into(toolBarRightIv);
//                        userNameTv.setText(recipeDetailModel.getData().getUserInfo().getUserName());
//                        if (userInfo.getSex() != 0) {
//                            userSexIv.setVisibility(View.VISIBLE);
//                            if (userInfo.getSex() == 1) {
//                                userSexIv.setImageResource(R.drawable.boy2);
//                            }
//                            else {
//                                userSexIv.setImageResource(R.drawable.girl2);
//                            }
//                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

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
                            Toast.makeText(RecipeCommentActivity.this,commonModel.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(RecipeCommentActivity.this,commonModel.getMessage(),Toast.LENGTH_SHORT).show();
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
