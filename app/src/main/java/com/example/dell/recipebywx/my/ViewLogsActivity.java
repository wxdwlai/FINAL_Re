package com.example.dell.recipebywx.my;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
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
import com.example.dell.recipebywx.model.ViewLogsModel;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideRoundTransform;
import com.example.dell.recipebywx.utils.Helper;
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

public class ViewLogsActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private SmartRefreshLayout refreshLayout;
    private TextView emptyTv;
    private LinearLayout back;
    private RecyclerView recyclerView;
    private CookingRecyclerViewAdapter adapter;
    private List<ViewLogsModel.DataBean> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_logs);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        initView();
        getViewLogs();
        this.changeStatusBarTextColor(true);
    }
    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
    private void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        emptyTv = (TextView)findViewById(R.id.empty_tv);
        emptyTv.setVisibility(View.GONE);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        refreshLayout = (SmartRefreshLayout)findViewById(R.id.viewlogs_refresh);
        refreshLayout.setRefreshHeader(new ClassicsHeader(getApplicationContext()));
        refreshLayout.setRefreshFooter(new BallPulseFooter(getApplicationContext()).setSpinnerStyle(SpinnerStyle.Scale));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(1000);
                getViewLogs();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(1000);
                getViewLogs();
            }
        });
    }
    private void initRecycleView() {
        recyclerView = (RecyclerView)findViewById(R.id.views_rcy);
        recyclerView.setVisibility(View.VISIBLE);
        recyclerView.setLayoutManager(new LinearLayoutManager(ViewLogsActivity.this,LinearLayoutManager.VERTICAL,false));
        adapter = new CookingRecyclerViewAdapter(ViewLogsActivity.this,list);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new SpaceItemDecoration(DensityUtils.dp2px(getApplicationContext(),0),DensityUtils.dp2px(getApplicationContext(),10)));
    }

    public class CookingRecyclerViewAdapter extends RecyclerView.Adapter<CookingRecyclerViewAdapter.Holer> {

        private Context context;
        private List<ViewLogsModel.DataBean> list;

        private CookingRecyclerViewAdapter(Context context, List<ViewLogsModel.DataBean> list) {
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
            View view = LayoutInflater.from(context).inflate(R.layout.layout_view_log_item,parent,false);
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
            holder.cookingName.setText(list.get(position).getRecipe().getTitle());
//            holder.cookingMaterias.setText(list.get(position).getRecipe().getIngs());
            holder.userName.setText(list.get(position).getRecipe().getTags());
            holder.cookingScore.setText(String.valueOf(list.get(position).getRecipe().getScore()));
            holder.cookingNumber.setText(list.get(position).getRecipe().getTitle());
//            XutilsHttp.getInstance().bindCircularImage3(holder.cookingImage,list.get(position).getRecipe().getImage(),8);
            Glide.with(context)
                    .load(list.get(position).getRecipe().getImage())
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

            public Holer(View itemView) {
                super(itemView);
                cookingImage = (ImageView) itemView.findViewById(R.id.cooking_img_iv);
                cookingName = (TextView) itemView.findViewById(R.id.cooking_name_tv);
                cookingMaterias = (TextView) itemView.findViewById(R.id.cooking_materia_tv);
                userName = (TextView) itemView.findViewById(R.id.cooking_user_name_tv);
                cookingScore = (TextView) itemView.findViewById(R.id.cooking_score_tv);
                cookingNumber = (TextView) itemView.findViewById(R.id.cooking_num_tv);

//                final String reid = String.valueOf(list.get(position).getReid());
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reid = String.valueOf(list.get(position).getReid());
                        Intent intent = new Intent(ViewLogsActivity.this, RecipeDetailActivity.class);
                        intent.putExtra("reid",reid);
                        startActivity(intent);
//                        Toast.makeText(getActivity(),"点击了一下",Toast.LENGTH_LONG).show();
                    }
                });
            }

            @Override
            public void onClick(View v) {
            }
        }
    }

    /**
     * 获取用户浏览记录
     */
    private void getViewLogs() {
        final Map<String, String> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.getViews, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    ViewLogsModel viewLogsModel = new Gson().fromJson(result,ViewLogsModel.class);
                    if (viewLogsModel.isSuccess()) {
//                        model = viewLogsModel;
                        list.clear();
                        list.addAll(viewLogsModel.getData());
                        if (list.size() != 0) {
                            emptyTv.setVisibility(View.GONE);
                            if (recyclerView==null) {
                                initRecycleView();
                            }
                            else {
                                recyclerView.setVisibility(View.VISIBLE);
                                adapter.notifyDataSetChanged();
                            }
                        }
                        else {
                            emptyTv.setVisibility(View.VISIBLE);
                            recyclerView.setVisibility(View.GONE);
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
