package com.example.dell.recipebywx.my;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.GlideRoundTransform;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private String uid;
    private LinearLayout back;
    private ImageView backgrondIv;
    private ImageView iconIv;
    private ImageView sexIv;
    private TextView introTv;
    private TextView nameTv;

    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    private UserInforModel userInforModel;
    private List<UserInforModel.DataBean.RecipesBean> recipeList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        this.changeStatusBarTextColor(true);
        uid = getIntent().getStringExtra("userId");
        initView();
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    void initView() {
        back = (LinearLayout)findViewById(R.id.id_back_iv);
        backgrondIv = (ImageView)findViewById(R.id.id_bg_iv);
        iconIv = (ImageView)findViewById(R.id.id_user_icon_iv);
        introTv = (TextView)findViewById(R.id.id_user_des_tv);
        sexIv = (ImageView)findViewById(R.id.id_user_sex_iv);
        nameTv = (TextView)findViewById(R.id.id_user_name_tv);
        getUser();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    void initRecipeView() {
        recyclerView = (RecyclerView)findViewById(R.id.recipe_rcy);
        LinearLayoutManager manager = new LinearLayoutManager(UserActivity.this,LinearLayoutManager.VERTICAL,false);
        manager.setAutoMeasureEnabled(true);
        manager.setSmoothScrollbarEnabled(true);
        recyclerView.setLayoutManager(manager);
        recipeAdapter = new RecipeAdapter(UserActivity.this,recipeList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(recipeAdapter);
        recyclerView.addItemDecoration(new SpaceItemDecoration(0,15));
    }

    class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.Holder> {

        private Context context;
        private List<UserInforModel.DataBean.RecipesBean> list;

        public RecipeAdapter(Context context,List<UserInforModel.DataBean.RecipesBean> list) {
            this.context = context;
            this.list = list;
        }

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Holder holder = null;
            View view = LayoutInflater.from(context).inflate(R.layout.layout_recipe_item,parent,false);
            holder = new Holder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.position = position;
//            XutilsHttp.getInstance().bindCircularImage3(holder.recipeIv,list.get(position).getImage(),5);
            Glide.with(context).load(list.get(position).getImage())
                    .transform(new CenterCrop(context),new GlideRoundTransform(context,5))
                    .into(holder.recipeIv);
            holder.recipeTv.setText(list.get(position).getTitle());
            Glide.with(context).load(userInforModel.getData().getImage())
                    .transform(new GlideCircleTransform(context))
                    .into(holder.creatorIv);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {

            private ImageView recipeIv;
            private TextView recipeTv;
            private int position;
            private ImageView creatorIv;
            public Holder(View itemView) {
                super(itemView);
                recipeIv = (ImageView)itemView.findViewById(R.id.recipe_image_iv);
                recipeTv = (TextView)itemView.findViewById(R.id.recipe_name_tv);
                creatorIv = (ImageView)itemView.findViewById(R.id.creator_iv);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), RecipeDetailActivity.class);
                        intent.putExtra("reid",String.valueOf(list.get(position).getReid()));
                        startActivity(intent);
                    }
                });
            }
        }
    }

    public void getUser() {
        Map<String, String> map = new HashMap<>();
        map.put("uid",uid);
        XutilsHttp.getInstance().get(ServiceAPI.GetUser, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    userInforModel = gson.fromJson(result,UserInforModel.class);
                    if (userInforModel.isSuccess()) {
//                        initRecyclerView();
                        recipeList.clear();
                        recipeList.addAll(userInforModel.getData().getRecipes());
                        if (recipeList.size() != 0) {
                            if (recyclerView == null)
                                initRecipeView();
                            else recipeAdapter.notifyDataSetChanged();
                        }
                        else {

                        }
                        nameTv.setText(userInforModel.getData().getUserName());
                        if (userInforModel.getData().getSex() == 1) {
                            sexIv.setImageResource(R.drawable.boy2);
                        } else {
                            sexIv.setImageResource(R.drawable.girl2);
                        }
                        if (userInforModel.getData().getIntro() == null || userInforModel.getData().getIntro().length() == 0) {
                            introTv.setText("这家伙比较懒，啥都没有写~");
                        }
                        else {
                            introTv.setText(userInforModel.getData().getIntro());
                        }
//                        Glide.with(UserActivity.this)
//                                .load(userInforModel.getData().getImage())
//                                .transform(new CenterCrop(UserActivity.this),new GlideCircleTransform(UserActivity.this))
//                                .into(iconIv);
                        XutilsHttp.getInstance().bindCircularImage3(backgrondIv,userInforModel.getData().getImage(),0);
                        XutilsHttp.getInstance().bindCircularImage(iconIv, userInforModel.getData().getImage());
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }
}
