package com.example.dell.recipebywx.search;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.SearchHistoryModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchRecipeActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private LinearLayout back;
    private EditText searchEtv;
    private LinearLayout clearIv;
    private TextView searchButtonTv;
    private LinearLayout emptyLl;
    private TextView emptyTv;
    private TextView recentTv;
    private GridView recentGv;
    private LinearLayout deleteRecentIv;
    private CustomAdapter recentAdapter;
    private TextView recommendTv;
    private GridView recommendGd;
    private CustomAdapter recommendAdapter;
    //返回搜索记录
    private List<String> searchRecordsList = new ArrayList<>();
    private List<String> recommendList = new ArrayList<>();
    private String keyword;
    private String userId = "1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_recipe);
//        userId = getIntent().getStringExtra("userId");
        localUserInfo = new LocalUserInfo(getApplicationContext());
        initView();
        this.changeStatusBarTextColor(true);
    }

    private void initView() {
        initData();
        back = (LinearLayout)findViewById(R.id.toolbar_left_button);
        searchEtv = (EditText)findViewById(R.id.toolbar_search_etv);
        searchButtonTv = (TextView) findViewById(R.id.toolbar_right_tv);
        clearIv = (LinearLayout)findViewById(R.id.clear_iv);
        emptyLl = (LinearLayout)findViewById(R.id.empty_ll);
        recentTv = (TextView)findViewById(R.id.recent_search_tv);
        recentGv = (GridView)findViewById(R.id.recent_search_grid_view);
        deleteRecentIv = (LinearLayout)findViewById(R.id.delete_recent_iv);
        recommendTv = (TextView)findViewById(R.id.recommend_tv);
        recommendGd = (GridView)findViewById(R.id.recommend_grid_view);
        emptyTv = (TextView)findViewById(R.id.empty_tv);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //推荐搜索显示
        if (recommendList.size() == 0) {
            recommendTv.setVisibility(View.GONE);
            recommendGd.setVisibility(View.GONE);
        } else {
            recommendTv.setVisibility(View.VISIBLE);
            recommendGd.setVisibility(View.VISIBLE);
            recommendAdapter = new CustomAdapter(getApplicationContext(),recommendList);
            recommendGd.setAdapter(recommendAdapter);
        }
        deleteRecentIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteSearch();
            }
        });
        searchEtv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() != 0) {
//                    searchEtv.setText(s.toString());
                    keyword = s.toString();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() != 0) {
//                    searchEtv.setText(s.toString());
                    keyword = s.toString();
                    clearIv.setVisibility(View.VISIBLE);
                    clearIv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            searchEtv.setText("");
                        }
                    });
                }
                else {
                    clearIv.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() != 0) {
//                    searchEtv.setText(s.toString());
                    clearIv.setVisibility(View.VISIBLE);
                    clearIv.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            searchEtv.setText("");
                        }
                    });
                }
                else {
                    clearIv.setVisibility(View.GONE);
                }
            }
        });
        if (searchEtv.getText().toString().length() != 0) {
            clearIv.setVisibility(View.VISIBLE);
            clearIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    searchEtv.setText("");
                    clearIv.setVisibility(View.GONE);
                }
            });
        }
        else {
            clearIv.setVisibility(View.GONE);
        }
        //点击搜索按钮跳转到搜索结果详情页
        searchButtonTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchRecipeActivity.this,SearchResultActivity.class);
                intent.putExtra("keyword",keyword);
//                for (int i=0;i<searchRecordsList.size();i++) {
//                    if (keyword == searchRecordsList.get(i)) {
//                        searchRecordsList.remove(i);
//                        break;
//                    }
//                }
//                searchRecordsList.add(0,keyword);
//                recentAdapter.notifyDataSetChanged();
                startActivity(intent);
            }
        });
        searchEtv.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                    Toast.makeText(SearchRecipeActivity.this,"点击搜索"+keyword,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SearchRecipeActivity.this,SearchResultActivity.class);
                    intent.putExtra("keyword",keyword);
//                    for (int i=0;i<searchRecordsList.size();i++) {
//                        if (keyword == searchRecordsList.get(i)) {
//                            searchRecordsList.remove(i);
//                            break;
//                        }
//                    }
//                    searchRecordsList.add(0,keyword);
//                    recentAdapter.notifyDataSetChanged();
                    startActivity(intent);
                }
                return false;
            }
        });
    }

    private void initData() {
        getSearchRecord();
        String[] recommend = {"雪花酥","可乐鸡翅","松鼠桂鱼","辣子鸡","酸菜鱼","月饼","牛轧糖","香菇"
        ,"青菜"};
//        String[] record = {"哈哈","可乐鸡翅","花生","可乐","啤酒"};
        for (int i = 0;i<recommend.length;i++) {
            recommendList.add(recommend[i]);
        }
//        for (int i = 0 ; i < record.length; i++) {
//            searchRecordsList.add(record[i]);
//        }
    }
    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    public class CustomAdapter extends BaseAdapter {

        private Context context;
        private List<?> list;

        public CustomAdapter(Context context,List<?> list) {
            this.context = context;
            this.list = list;
        }
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Holder holder = null;
            if (convertView == null) {
                holder = new Holder();
                convertView = LayoutInflater.from(context).inflate(R.layout.layout_search_record_item,null);
                convertView.setTag(holder);
            } else {
                holder = (Holder)convertView.getTag();
            }
            holder.textView = convertView.findViewById(R.id.text_tv);
            //设置适配器文字内容
            holder.textView.setText(list.get(position).toString());
            final Holder finalHolder = holder;
            holder.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String keyword = finalHolder.textView.getText().toString();
                    searchEtv.setText(keyword);
                    Intent intent = new Intent(SearchRecipeActivity.this,SearchResultActivity.class);
                    intent.putExtra("keyword",keyword);
                    startActivity(intent);
                }
            });
            return convertView;
        }
        private class Holder {
            private TextView textView;
        }
    }

    /**
     * 获取用户最近搜索记录关键词
     */
    public void getSearchRecord() {
        Map<String,String> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.getSearchHistory, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    SearchHistoryModel searchHistoryModel = gson.fromJson(result,SearchHistoryModel.class);
                    if (searchHistoryModel.isSuccess()) {
//                        List<SearchHistoryModel.DataBean> data = searchHistoryModel.getData();
//                        for (SearchHistoryModel.DataBean dataBean : data) {
//                            searchRecordsList.add(dataBean.getKeyword());
//                        }
                        searchRecordsList = searchHistoryModel.getData();

                        //最近搜索显示
                        if (searchRecordsList.size() == 0) {
                            recentTv.setVisibility(View.GONE);
                            recentGv.setVisibility(View.GONE);
                            deleteRecentIv.setVisibility(View.GONE);
                        } else {
                            recentTv.setVisibility(View.VISIBLE);
                            recentGv.setVisibility(View.VISIBLE);
                            deleteRecentIv.setVisibility(View.VISIBLE);
                            recentAdapter = new CustomAdapter(getApplicationContext(),searchRecordsList);
                            recentGv.setAdapter(recentAdapter);
                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    public void deleteSearch() {
        final Map map = new HashMap();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().delete(ServiceAPI.deleteSearch, map, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    SearchHistoryModel model = new Gson().fromJson(result,SearchHistoryModel.class);
                    if (model.isSuccess()) {
                        searchRecordsList.clear();
                        recentAdapter.notifyDataSetChanged();
                        deleteRecentIv.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

}
