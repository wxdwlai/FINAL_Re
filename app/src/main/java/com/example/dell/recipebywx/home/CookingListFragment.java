package com.example.dell.recipebywx.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.CookingModel;
import com.example.dell.recipebywx.model.RecipeModel;
import com.example.dell.recipebywx.model.SearchResultModel;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

public class CookingListFragment extends Fragment {

    private View view;
    private RecyclerView cookingRecyclerView;
    private CookingRecyclerViewAdapter cookingAdapter;
    private List<SearchResultModel.DataBean> list = new ArrayList<>();
    private int type;
    public CookingListFragment() {
    }
    @SuppressLint("ValidFragment")
    public CookingListFragment(int type) {
        this.type  = type;
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
        view = inflater.inflate(R.layout.fragment_cooking_list,null);
        initData();
        cookingRecyclerView = (RecyclerView)view.findViewById(R.id.cooking_rv);
        initRecyclerView();
        return view;
    }

    /**
     * 初始化list
     */
    private void initData() {
        String[] cookNames = {"可乐鸡翅","鱼香肉丝","松鼠桂鱼","红烧排骨","栗子风味小炒",
        "油闷大虾","麻婆豆腐","手撕包菜","糖醋里脊","干煸菜花","红烧肉","酸菜鱼","番茄炒蛋"};
        String[] scores = {"8.9分","7.5分","9.8分","9.4分","6.5分","7.3分","7.8分","8.4分","8.5分","8.8分"};
//        CookingModel model = new CookingModel();
//        for (int i=0;i<10;i++) {
//            CookingModel model = new CookingModel();
//            model.setCookingName(cookNames[i]);
//            model.setCookingMateria(cookNames[i]);
//            model.setUserName("万万没想到");
//            model.setCookingNum("1206人已做");
//            model.setCookingScore(scores[i]);
//            list.add(model);
//        }
        getByType();
//        getRecipe();
    }

    /**
     * 初始化菜谱列表
     */
    private void initRecyclerView() {
        //获取recyclerView
        cookingRecyclerView = (RecyclerView)view.findViewById(R.id.cooking_rv);
        //获取adapter
        cookingAdapter = new CookingRecyclerViewAdapter(getActivity(),list);
        //给recyclerVier设置adapter
        cookingRecyclerView.setAdapter(cookingAdapter);
        //设置布局管理器
        //设置layoutManager,可以设置显示效果，是线性布局、grid布局，还是瀑布流布局
        //参数是：上下文、列表方向（横向还是纵向）、是否倒叙
        cookingRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        //设置分隔线
//        cookingRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        //设置间距
        cookingRecyclerView.addItemDecoration(new SpaceItemDecoration(DensityUtils.dp2px(getActivity(),0),DensityUtils.dp2px(getActivity(),10)));
    }

    public class CookingRecyclerViewAdapter extends RecyclerView.Adapter<CookingRecyclerViewAdapter.Holer> {

        private Context context;
        private List<SearchResultModel.DataBean> list;

        private CookingRecyclerViewAdapter(Context context, List<SearchResultModel.DataBean> list) {
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
        public void onBindViewHolder(Holer holder, int position) {
            holder.positon = position;
            holder.cookingName.setText(list.get(position).getTitle());
            holder.cookingMaterias.setText(list.get(position).getIngs());
            if (list.get(position).getTags() != null && list.get(position).getTags().length() != 0) {
                holder.userName.setText(list.get(position).getTags().replaceAll("\n"," "));
            }

//            holder.cookingScore.setText(list.get(position).getCookingScore());
//            holder.cookingNumber.setText(list.get(position).getCookingNum());
//            Glide.with(context).load();
            XutilsHttp.getInstance().bindCircularImage3(holder.cookingImage,list.get(position).getImage().toString(),10);
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
            private int positon;

            public Holer(View itemView) {
                super(itemView);
                cookingImage = (ImageView) itemView.findViewById(R.id.cooking_img_iv);
                cookingName = (TextView) itemView.findViewById(R.id.cooking_name_tv);
                cookingMaterias = (TextView) itemView.findViewById(R.id.cooking_materia_tv);
                userName = (TextView) itemView.findViewById(R.id.cooking_user_name_tv);
                cookingScore = (TextView) itemView.findViewById(R.id.cooking_score_tv);
                cookingNumber = (TextView) itemView.findViewById(R.id.cooking_num_tv);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Toast.makeText(getActivity(),"点击了一下",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
                        intent.putExtra("reid",String.valueOf(list.get(positon).getReid()));
                        startActivity(intent);
                    }
                });
            }

            @Override
            public void onClick(View v) {
//                itemView
            }
        }
    }

    private void getRecipe() {
        XutilsHttp.getInstance().get(ServiceAPI.ListUrl, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    Gson gson = new Gson();
//                    RecipeModel recipeModel = gson.fromJson(result,RecipeModel.class);

                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    public void getByType() {
        Map map = new HashMap();
        map.put("typeId",String.valueOf(type));
        XutilsHttp.getInstance().get(ServiceAPI.getByType, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    SearchResultModel resultModel = new Gson().fromJson(result,SearchResultModel.class);
                    if (resultModel.isSuccess()) {
                        list = resultModel.getData();
                        if (list.size()>0) {
                            if(cookingRecyclerView == null) {
                                initRecyclerView();
                            }
                            else {
                                cookingAdapter.notifyDataSetChanged();
                            }
                        }
                        else {
                            //显示空白页，但是这里不应该出现空白页
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
