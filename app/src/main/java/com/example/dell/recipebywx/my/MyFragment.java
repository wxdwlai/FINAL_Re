package com.example.dell.recipebywx.my;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.dell.recipebywx.LoginActivity;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.collect.CollectFragment;
import com.example.dell.recipebywx.model.TasteModel;
import com.example.dell.recipebywx.model.UserCollectsModel;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.model.ViewLogsModel;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.GlideRoundTransform;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFragment extends Fragment {

    private LocalUserInfo localUserInfo;

    private String userId;//跳转到当前界面的userId
    public MyFragment() {
        // Required empty public constructor
    }

    private View view;
    private LinearLayout noUserLl;
    private TextView wxLoginTv;
    private TextView otherLoginTv;
    private TextView registerTv;
    private TextView userIdTv;
    private LinearLayout userLl;
    private LinearLayout settingLl;

    private LinearLayout userInfoLl;
    private ImageView userIconIv;
    private TextView userNameTv;
    private ImageView userSextIv;
    private TextView userIntroTv;
    private LinearLayout viewLogsLl;
    private LinearLayout tasetLikeLl;
    private RecyclerView tasetRcy;
    private List<UserInforModel.DataBean.UserTastesBean> tasteList  = new ArrayList<>();
    private TasteAdapter adapter;

    private ViewLogsModel model;

    private List<ViewLogsModel.DataBean> list = new ArrayList<>();

    //创建菜谱功能入口
    private LinearLayout addRecipe;

    private LinearLayout recipeLl;
    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    private List<UserInforModel.DataBean.RecipesBean> recipeList = new ArrayList<>();
    private TextView allTv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            userId = getArguments().toString();
        }
    }

    void initRecyclerView() {
        tasetRcy = (RecyclerView)view.findViewById(R.id.taset_rcv);
        GridLayoutManager manager = new GridLayoutManager(getContext(),4);
        tasetRcy.setLayoutManager(manager);
        adapter = new TasteAdapter(getContext(),tasteList);
        tasetRcy.setAdapter(adapter);
    }

    void initRecipeView() {
        recyclerView = (RecyclerView)view.findViewById(R.id.recipe_rcy);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        manager.setAutoMeasureEnabled(true);
        manager.setSmoothScrollbarEnabled(true);
        recyclerView.setLayoutManager(manager);
        recipeAdapter = new RecipeAdapter(getContext(),recipeList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(recipeAdapter);
        recyclerView.addItemDecoration(new SpaceItemDecoration(0,15));
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        userId = getUserId();
//        userId = localUserInfo.getUserInfo().getUid();
        view = inflater.inflate(R.layout.fragment_my,null);
        localUserInfo = new LocalUserInfo(getContext());
        userId = localUserInfo.getUserInfo().getUid();
        userInfoLl = (LinearLayout)view.findViewById(R.id.user_info_ll);
        userIconIv = (ImageView)view.findViewById(R.id.user_icon_iv);
        userNameTv = (TextView)view.findViewById(R.id.user_name_tv);
        userSextIv = (ImageView)view.findViewById(R.id.user_sex_iv);
        userIntroTv = (TextView)view.findViewById(R.id.user_intro_tv);
        userIdTv = (TextView)view.findViewById(R.id.user_id_tv);
        userLl = (LinearLayout)view.findViewById(R.id.user_ll);
        noUserLl = (LinearLayout)view.findViewById(R.id.no_user_ll);
        wxLoginTv = (TextView)view.findViewById(R.id.wx_login_tv);
        otherLoginTv = (TextView)view.findViewById(R.id.other_login_tv);
        registerTv = (TextView)view.findViewById(R.id.register_tv);
        settingLl = (LinearLayout)view.findViewById(R.id.toolbar_right_btn);
        viewLogsLl = (LinearLayout)view.findViewById(R.id.views_ll);
        tasetLikeLl = (LinearLayout)view.findViewById(R.id.taset_like_ll);
        addRecipe = (LinearLayout)view.findViewById(R.id.toolbar_left_button);
        recipeLl = (LinearLayout)view.findViewById(R.id.recipe_ll);
        allTv = (TextView)view.findViewById(R.id.all_tv);

        if (userId == null || userId.length() == 0) {
            noUserLl.setVisibility(View.VISIBLE);
            userIdTv.setVisibility(View.GONE);
            userLl.setVisibility(View.GONE);
        } else {
            noUserLl.setVisibility(View.GONE);
            userLl.setVisibility(View.VISIBLE);
        }
        if (userId == null) {
            otherLoginTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    intent.putExtra("fragmentId",4);
                    startActivity(intent);
                }
            });
            registerTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    intent.putExtra("fragmentId", 4);
                    startActivity(intent);
                }
            });
        }
        //编辑用户个人资料
        userInfoLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),UserInfoActivity.class);
                intent.putExtra("userId",localUserInfo.getUserInfo().getUid());
                startActivity(intent);
            }
        });
        settingLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),UserInfoActivity.class);
                startActivity(intent);
            }
        });
        viewLogsLl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                getViewLogs();
                Intent intent = new Intent(getActivity(),ViewLogsActivity.class);
//                intent.putExtra("uid",localUserInfo.getUserInfo().getUid());
                startActivity(intent);
            }
        });

        tasetLikeLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),TasteSettingActivity.class);
                startActivity(intent);
            }
        });

        addRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PostRecipeActivity.class);
                intent.putExtra("uid",localUserInfo.getUserInfo().getUid());
                startActivity(intent);
            }
        });

        allTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ViewLogsActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    /**
     * 从其他fragment跳转到当前的fragment中
     * @param transit
     * @param enter
     * @param nextAnim
     * @return
     */
    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if (enter) {
            localUserInfo = new LocalUserInfo(getContext());
            if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
                noUserLl.setVisibility(View.GONE);
                userLl.setVisibility(View.VISIBLE);
                getUser();
            } else {
                noUserLl.setVisibility(View.VISIBLE);
                userIdTv.setVisibility(View.GONE);
                userLl.setVisibility(View.GONE);
                otherLoginTv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), LoginActivity.class);
                        intent.putExtra("fragmentId",4);
                        startActivity(intent);
                    }
                });
                registerTv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), LoginActivity.class);
                        intent.putExtra("fragmentId", 4);
                        startActivity(intent);
                    }
                });
//                startActivityForResult(new Intent(getActivity(), LoginActivity.class), 200);
            }
//            localUserInfo = new LocalUserInfo(getContext());

//            userId = localUserInfo.getUserInfo().getUid();
        }
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    /**
     * 从其他activity跳转到当前fragment
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        localUserInfo = new LocalUserInfo(getActivity());
        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
            noUserLl.setVisibility(View.GONE);
            userLl.setVisibility(View.VISIBLE);
            getUser();
        } else {
            noUserLl.setVisibility(View.VISIBLE);
            userIdTv.setVisibility(View.GONE);
            userLl.setVisibility(View.VISIBLE);
            otherLoginTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    intent.putExtra("fragmentId",4);
                    startActivity(intent);
                }
            });
            registerTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    intent.putExtra("fragmentId", 4);
                    startActivity(intent);
                }
            });
        }
        super.onActivityCreated(savedInstanceState);
    }

    /**
     * 从其他activity跳转到当前fragment
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        localUserInfo = new LocalUserInfo(getActivity());
        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
            noUserLl.setVisibility(View.GONE);
            userLl.setVisibility(View.VISIBLE);
            getUser();
        } else {
            noUserLl.setVisibility(View.VISIBLE);
            userIdTv.setVisibility(View.GONE);
            userLl.setVisibility(View.GONE);
            otherLoginTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    intent.putExtra("fragmentId",4);
                    startActivity(intent);
                }
            });
            registerTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), LoginActivity.class);
                    intent.putExtra("fragmentId", 4);
                    startActivity(intent);
                }
            });
        }
    }

    public class TasteAdapter extends RecyclerView.Adapter<TasteAdapter.Holder>{
        private Context context;
        private List<UserInforModel.DataBean.UserTastesBean> list;

        public TasteAdapter(Context context, List<UserInforModel.DataBean.UserTastesBean> list) {
            this.context = context;
            this.list = list;
        }
        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Holder holder;
            View view = LayoutInflater.from(context).inflate(R.layout.layout_simple_text,parent,false);
            holder = new Holder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.tasetTv.setText(list.get(position).getTags().getTagName());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {

            private TextView tasetTv;
            public Holder(View itemView) {
                super(itemView);
                tasetTv = (TextView)itemView.findViewById(R.id.text_tv);
            }
        }
    }

    public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.Holder> {

        private Context context;
        private List<UserInforModel.DataBean.RecipesBean> list;

        public RecipeAdapter(Context context, List<UserInforModel.DataBean.RecipesBean> list) {
            this.context = context;
            this.list = list;
        }

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Holder holder = null;
            View view = LayoutInflater.from(context).inflate(R.layout.layout_common_image,parent,false);
            holder = new Holder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(Holder holder, final int position) {
            Glide.with(context).load(list.get(position).getImage())
            .transform(new CenterCrop(context),new GlideRoundTransform(context,5))
            .into(holder.imageView);
            holder.position = position;
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

            private ImageView imageView;
            private int position;
            public Holder(View itemView) {
                super(itemView);
                imageView = (ImageView)itemView.findViewById(R.id.image_iv);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(),RecipeDetailActivity.class);
                        intent.putExtra("reid",String.valueOf(list.get(position).getReid()));
                        startActivity(intent);
                    }
                });
            }

            @Override
            public void onClick(View v) {

            }
        }
    }

    public void getUser() {
        Map<String, String> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.GetUser, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    UserInforModel userInforModel = gson.fromJson(result,UserInforModel.class);
                    if (userInforModel.isSuccess()) {
                        tasteList.clear();
                        tasteList = userInforModel.getData().getUserTastes();
//                        initRecyclerView();
                        recipeList.clear();
                        recipeList.addAll(userInforModel.getData().getRecipes());
                        if (recipeList.size() != 0) {
                            if (recyclerView == null)
                                initRecipeView();
                            else recipeAdapter.notifyDataSetChanged();
//                            if (recipeList.size()>1) allTv.setText(View.VISIBLE);
                        }
                        else {

                        }
                        userNameTv.setText(userInforModel.getData().getUserName());
                        if (userInforModel.getData().getSex() == 1) {
                            userSextIv.setImageResource(R.drawable.boy2);
                        } else {
                            userSextIv.setImageResource(R.drawable.girl2);
                        }
                        userIntroTv.setText(userInforModel.getData().getIntro());
                        Glide.with(getContext())
                                .load(userInforModel.getData().getImage())
                                .transform(new CenterCrop(getContext()),new GlideCircleTransform(getContext()))
                                .into(userIconIv);
//                        XutilsHttp.getInstance().bindCircularImage(userIconIv, userInforModel.getData().getImage());
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        if (Local.userId != null) {
            return Local.userId;
        } else {
            return userId;
        }
    }

}
