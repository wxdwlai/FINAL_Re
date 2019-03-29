package com.example.dell.recipebywx.search;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.home.CookingListFragment;
import com.example.dell.recipebywx.model.CookingModel;
import com.example.dell.recipebywx.model.RecipeDetailModel;
import com.example.dell.recipebywx.model.SearchResultModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchResultActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private LinearLayout back;
    private TextView emptyTv;
    private String keyword;
    private EditText searchEtv;
    private RecyclerView resultRcy;
    private CookingRecyclerViewAdapter adapter;
//    private List<CookingModel> list = new ArrayList<>();
    private List<SearchResultModel.DataBean> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        keyword = getIntent().getStringExtra("keyword");
        localUserInfo = new LocalUserInfo(getApplicationContext());
        setContentView(R.layout.activity_search_result);
        initView();
        this.changeStatusBarTextColor(true);
    }

    /**
     * 初始化list
     */
    private void initData() {
        getSearch();
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

    private void initView() {
        initData();
        back = (LinearLayout)findViewById(R.id.toolbar_left_button);
        emptyTv = (TextView)findViewById(R.id.empty_tv);
        searchEtv = (EditText)findViewById(R.id.toolbar_search_etv);
        searchEtv.setText(keyword);
        searchEtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        searchEtv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                finish();
            }

            @Override
            public void afterTextChanged(Editable s) {
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /**
     * 初始化菜谱列表
     */
    private void initRecyclerView() {
        //获取recyclerView
        resultRcy = (RecyclerView)findViewById(R.id.search_result_rcy);
        //获取adapter
        adapter = new CookingRecyclerViewAdapter(SearchResultActivity.this,list);
        //设置布局管理器
        //设置layoutManager,可以设置显示效果，是线性布局、grid布局，还是瀑布流布局
        //参数是：上下文、列表方向（横向还是纵向）、是否倒叙
        resultRcy.setLayoutManager(new LinearLayoutManager(SearchResultActivity.this,LinearLayoutManager.VERTICAL,false));
        //给recyclerVier设置adapter
        resultRcy.setAdapter(adapter);
        //设置分隔线
//        cookingRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        //设置间距
        resultRcy.addItemDecoration(new SpaceItemDecoration(DensityUtils.dp2px(SearchResultActivity.this,0),DensityUtils.dp2px(SearchResultActivity.this,10)));
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
        public void onBindViewHolder(Holer holder, final int position) {
            holder.position = position;
            holder.cookingName.setText(list.get(position).getTitle());
            holder.cookingMaterias.setText(list.get(position).getIngs());
            if (list != null) {
                if (list.get(position).getTags() != null && list.get(position).getTags().length() != 0) {
                    holder.userName.setText(list.get(position).getUserInfo().getUserName());
//                    holder.userName.setText(list.get(position).getTags().replace("\n"," "));
//                    holder.userName.setText();
                }
//                List<SearchResultModel.DataBean.RecipeTypesBean> typesBeanList = new ArrayList<>();
//                typesBeanList = list.get(position).getRecipeTypes();
//                if (typesBeanList.size() != 0) {
//                    String tag = "";
//                    for (int i=0;i<typesBeanList.size();i++) {
//                        tag += typesBeanList.get(i).getTypes().getTypeName() + " ";
//                    }
//                    holder.userName.setText(tag);
//                }

//            holder.cookingScore.setText(String.valueOf(list.get(position).getScore()));
//            holder.cookingNumber.setText(list.get(position).getTitle());
                XutilsHttp.getInstance().bindCircularImage3(holder.cookingImage,list.get(position).getImage().toString(),10);
            }
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

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reid = String.valueOf(list.get(position).getReid());
                        Intent intent = new Intent(SearchResultActivity.this,RecipeDetailActivity.class);
                        intent.putExtra("reid",reid);
                        startActivity(intent);
                        //点击进入菜谱详情页面
//                        Intent intent = new Intent(SearchResultActivity.this,RecipeDetailActivity.class);
//                        startActivity(intent);
//                        Toast.makeText(SearchResultActivity.this,"点击了一下",Toast.LENGTH_LONG).show();
                    }
                });
            }

            @Override
            public void onClick(View v) {
//                itemView
            }
        }
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    /**
     * 菜谱搜索结果
     */
    public void getSearch() {
        Map<String, String> map = new HashMap<>();
        map.put("keyword",keyword);
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.searchUrl, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    SearchResultModel searchResultModel = gson.fromJson(result,SearchResultModel.class);
                    if (searchResultModel.isSuccess()) {
                        list = searchResultModel.getData();
                        if (list.size()>0) {
                            emptyTv.setVisibility(View.GONE);
                            if (resultRcy == null) {
                                initRecyclerView();
                            }
                            else {
                                adapter.notifyDataSetChanged();
                            }

                        }
                        else {
                            emptyTv.setVisibility(View.VISIBLE);
                            if (resultRcy != null) {
                                resultRcy.setVisibility(View.GONE);
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
