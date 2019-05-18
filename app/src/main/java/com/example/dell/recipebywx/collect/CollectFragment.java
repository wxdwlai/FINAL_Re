package com.example.dell.recipebywx.collect;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.dell.recipebywx.LoginActivity;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.home.CookingListFragment;
import com.example.dell.recipebywx.model.CollectResponseModel;
import com.example.dell.recipebywx.model.CookingModel;
import com.example.dell.recipebywx.model.RecipeModel;
import com.example.dell.recipebywx.model.SearchResultModel;
import com.example.dell.recipebywx.model.UserCollectsModel;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.GlideRoundTransform;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
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

public class CollectFragment extends Fragment {

    private LocalUserInfo localUserInfo;
    private View view;
    private SmartRefreshLayout refreshLayout;
    private EditText searchEtv;
    private TextView searchTv;
    private RecyclerView collectRyv;
    private CookingRecyclerViewAdapter collectAdapter;
    private List<UserCollectsModel.DataBean> list = new ArrayList<>();

    //空白提示页面
    private LinearLayout emptyLl;
    private TextView emptyTv;

    public CollectFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_collect,null);
        initData();
        localUserInfo = new LocalUserInfo(getContext());
        getUserCollects();
        refreshLayout = (SmartRefreshLayout)view.findViewById(R.id.collect_refresh);
        refreshLayout.setRefreshHeader(new ClassicsHeader(getContext()));
        refreshLayout.setRefreshFooter(new BallPulseFooter(getContext()).setSpinnerStyle(SpinnerStyle.Scale));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(1000);
                getUserCollects();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(1000);
                getUserCollects();
            }
        });
        searchEtv = (EditText)view.findViewById(R.id.toolbar_search_etv);
        searchTv = (TextView)view.findViewById(R.id.toolbar_right_tv);
        searchEtv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() == 0) {
                    getUserCollects();
                }
                else {
                    searchCollects();
                }
                if (searchEtv.getText().toString().length() != 0) {
                    searchCollects();
                }
                else {
                    getUserCollects();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (searchEtv.getText().toString().length() != 0) {
                    searchCollects();
                }
                else {
                    getUserCollects();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (searchEtv.getText().toString().length() != 0) {
                    searchCollects();
                }
                else {
                    getUserCollects();
                }
            }
        });
        searchTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchCollects();
            }
        });

        emptyLl = (LinearLayout)view.findViewById(R.id.empty_ll);
        emptyTv = (TextView)view.findViewById(R.id.empty_tv);
        return view;
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if (enter) {
            if (!"0".equals(localUserInfo.getUserInfo().getUid())) {
                getUserCollects();
            } else {
                emptyLl.setVisibility(View.VISIBLE);
                if (collectAdapter != null) {
                    list.clear();
                    collectAdapter.notifyDataSetChanged();
                }
                startActivityForResult(new Intent(getActivity(), LoginActivity.class), 200);
            }
        }
//        getUserCollects();
        return super.onCreateAnimation(transit, enter, nextAnim);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        if (!"0".equals(localUserInfo.getUserInfo().getUid())) {
            getUserCollects();
        } else {
            emptyLl.setVisibility(View.VISIBLE);
            if (collectAdapter != null) {
                list.clear();
                collectAdapter.notifyDataSetChanged();
            }
            startActivityForResult(new Intent(getActivity(), LoginActivity.class), 200);
        }
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        getUserCollects();
        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 初始化list
     */
    private void initData() {
//        String[] cookNames = {"可乐鸡翅","鱼香肉丝","松鼠桂鱼","红烧排骨","栗子风味小炒",
//                "油闷大虾","麻婆豆腐","手撕包菜","糖醋里脊","干煸菜花","红烧肉","酸菜鱼","番茄炒蛋"};
//        String[] scores = {"8.9分","7.5分","9.8分","9.4分","6.5分","7.3分","7.8分","8.4分","8.5分","8.8分"};
////        CookingModel model = new CookingModel();
//        for (int i=0;i<10;i++) {
//            CookingModel model = new CookingModel();
//            model.setCookingName(cookNames[i]);
//            model.setCookingMateria(cookNames[i]);
//            model.setUserName("万万没想到");
//            model.setCookingNum("1206人已做");
//            model.setCookingScore(scores[i]);
//            list.add(model);
//        }
    }

    /**
     * 初始化菜谱列表
     */
    private void initRecyclerView() {
        //获取recyclerView
        collectRyv = (RecyclerView)view.findViewById(R.id.collect_ryv);
        collectRyv.setVisibility(View.VISIBLE);
        emptyLl.setVisibility(View.GONE);
        //设置布局管理器
        //设置layoutManager,可以设置显示效果，是线性布局、grid布局，还是瀑布流布局
        //参数是：上下文、列表方向（横向还是纵向）、是否倒叙
//        collectRyv.setLayoutManager(new GridLayoutManager(view.getContext(),GridLayoutManager.DEFAULT_SPAN_COUNT));
        collectRyv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        //获取adapter
        collectAdapter = new CookingRecyclerViewAdapter(view.getContext(),list);
        //给recyclerVier设置adapter
        collectRyv.setAdapter(collectAdapter);
        //设置分隔线
//        cookingRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        //设置间距
        collectRyv.addItemDecoration(new SpaceItemDecoration(DensityUtils.dp2px(getActivity(),0),DensityUtils.dp2px(getActivity(),10)));
    }

    public class CookingRecyclerViewAdapter extends RecyclerView.Adapter<CookingRecyclerViewAdapter.Holer> {

        private Context context;
        private List<UserCollectsModel.DataBean> list;

        private CookingRecyclerViewAdapter(Context context, List<UserCollectsModel.DataBean> list) {
            this.context = context;
            this.list = list;
        }

        /**
         * 布局绑定，相当于listview中的getView()方法中创建view和viewHolder
         * @param parent
         * @param viewType
         * @return
         */
        @Override
        public Holer onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.layout_cooking_item,parent,false);
            Holer holer = new Holer(view);
            return holer;
        }

        /**
         * 数据绑定
         * @param holder
         * @param position
         */
        @Override
        public void onBindViewHolder(Holer holder, final int position) {
            holder.position = position;
            holder.cookingName.setText(list.get(position).getTitle());
//            holder.cookingMaterias.setText(list.get(position).getIngs());
            if (list.get(position).getTags() != null && list.get(position).getTags().length() != 0) {
                holder.cookingMaterias.setText(list.get(position).getTags().replaceAll("\n"," "));
            }
            holder.cookingScore.setText(String.valueOf(list.get(position).getScore()));
            holder.cookingNumber.setText(list.get(position).getTitle());
            holder.userName.setText(list.get(position).getUserInfo().getUserName());
            Glide.with(context)
                    .load(list.get(position).getUserInfo().getImage())
                    .transform(new GlideCircleTransform(context)).
                    into(holder.creatorIv);
            Glide.with(context)
                    .load(list.get(position).getImage())
                    .transform(new CenterCrop(context),new GlideRoundTransform(context,5))
                    .into(holder.cookingImage);
//            XutilsHttp.getInstance().bindCircularImage3(holder.cookingImage,list.get(position).getImage().toString(),10);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holer extends RecyclerView.ViewHolder implements View.OnClickListener{
            private ImageView cookingImage;
            private TextView cookingName;
            private TextView cookingMaterias;
            private TextView userName;
            private TextView cookingScore;
            private TextView cookingNumber;
            private int position;
            private ImageView creatorIv;

            public Holer(View itemView) {
                super(itemView);
                cookingImage = (ImageView) itemView.findViewById(R.id.cooking_img_iv);
                cookingName = (TextView) itemView.findViewById(R.id.cooking_name_tv);
                cookingMaterias = (TextView) itemView.findViewById(R.id.cooking_materia_tv);
                userName = (TextView) itemView.findViewById(R.id.cooking_user_name_tv);
                cookingScore = (TextView) itemView.findViewById(R.id.cooking_score_tv);
                cookingNumber = (TextView) itemView.findViewById(R.id.cooking_num_tv);
                creatorIv = (ImageView)itemView.findViewById(R.id.creator_iv);
//                final String reid = String.valueOf(list.get(position).getReid());
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reid = String.valueOf(list.get(position).getReid());
                        Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
                        intent.putExtra("reid",reid);
                        startActivity(intent);
//                        Toast.makeText(getActivity(),"点击了一下",Toast.LENGTH_LONG).show();
                    }
                });
            }

            @Override
            public void onClick(View v) {
//                itemView
//                final String reid = String.valueOf(list.get(position).getReid());
//                Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
//                intent.putExtra("reid",reid);
//                startActivity(intent);
            }
        }
    }

    /**
     * 获取用户收藏列表
     */
    private void getUserCollects() {
        Map<String, String> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.UserCollects, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    UserCollectsModel collectsModel = gson.fromJson(result,UserCollectsModel.class);
                    if (collectsModel.isSuccess()) {
                        list.clear();
                        list.addAll(collectsModel.getData());
                        if (list.size() != 0) {
                            if (collectRyv == null) {
                                initRecyclerView();
                            }
                            else {
                                collectRyv.setVisibility(View.VISIBLE);
                                emptyLl.setVisibility(View.GONE);
                                collectAdapter.notifyDataSetChanged();
                            }
                        }
                        else {
                            if (collectRyv != null) {
                                collectRyv.setVisibility(View.GONE);
                            }
                            emptyLl.setVisibility(View.VISIBLE);
                            emptyTv.setText("还没有收藏哦~");
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
     * 收藏菜谱搜索
     */
    private void searchCollects() {
        Map<String, String> map = new HashMap<>();
        String keyword = searchEtv.getText().toString();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        map.put("keyword",keyword);
        XutilsHttp.getInstance().get(ServiceAPI.SearchUserCollects, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                Gson gson = new Gson();
                UserCollectsModel collectModel = gson.fromJson(result,UserCollectsModel.class);
                if (collectModel.isSuccess()) {
                    list.clear();
                    list.addAll(collectModel.getData());
                    if (list.size() != 0) {
                        if (collectRyv == null) {
                            initRecyclerView();
                        }
                        else {
                            collectRyv.setVisibility(View.VISIBLE);
                            emptyLl.setVisibility(View.GONE);
                            collectAdapter.notifyDataSetChanged();
                        }
                    }
                    else {
                        if (collectRyv != null) {
                            collectRyv.setVisibility(View.GONE);
                        }

                        emptyLl.setVisibility(View.VISIBLE);
                        emptyTv.setText("无内容，换个词试试~");
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }
}
