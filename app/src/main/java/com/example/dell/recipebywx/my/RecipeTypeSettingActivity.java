package com.example.dell.recipebywx.my;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dell.recipebywx.CustomGridView;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.TasteModel;
import com.example.dell.recipebywx.model.TypeModel;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.Helper;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class RecipeTypeSettingActivity extends AppCompatActivity {

    private LinearLayout back;
    private CustomGridView types;
    private TypeAdapter adapter;
    private List<TypeModel.DataBean> list = new ArrayList<>();
    private List<String> choose = new ArrayList<>();
    private String[] strings;
    private TextView saveTv;
    private List<Integer> resultList = new ArrayList<>();
    private boolean[] select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_type_setting);
        initView();
        this.changeStatusBarTextColor(true);
    }

    void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        saveTv = (TextView)findViewById(R.id.save_tv);
        getAllType();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                strings = new String[choose.size()];
                for (int i=0;i<choose.size();i++) {
                    strings[i] = choose.get(i);
                }
                intent.putExtra("types", "标签");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        saveTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                strings = new String[choose.size()];
                for (int i=0;i<choose.size();i++) {
                    strings[i] = choose.get(i);
                }
                intent.putExtra("types","标签");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    void initGridView() {
        types = (CustomGridView)findViewById(R.id.type_grv);
        adapter = new TypeAdapter(RecipeTypeSettingActivity.this,list);
        types.setAdapter(adapter);
        select = new boolean[list.size()];
        select = adapter.getSelect();
    }

    class TypeAdapter extends BaseAdapter {

        private Context context;
        private List<TypeModel.DataBean> list;
        private boolean[] select;

        public TypeAdapter(Context context, List<TypeModel.DataBean> list) {
            this.context = context;
            this.list = list;
            select = new boolean[list.size()];
            for (int i=0;i<list.size();i++) {
                select[i] = false;
            }
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
        public View getView(final int position, View convertView, ViewGroup parent) {
            final Holder holder;
            if(convertView == null){
                holder = new Holder();
                LayoutInflater layoutInflater = LayoutInflater.from(context);
                convertView = layoutInflater.inflate(R.layout.layout_simple_text,null);
                holder.tv = (TextView)convertView.findViewById(R.id.text_tv);
                holder.cancle = (ImageView)convertView.findViewById(R.id.delete_iv);
                convertView.setTag(holder);
            } else {
                holder = (Holder) convertView.getTag();
            }
            holder.tv.setText(list.get(position).getTypeName());
            holder.tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!select[position]) {
                        select[position] = true;
                        choose.add(String.valueOf(position+1));
                        holder.tv.setTextColor(Color.parseColor("#ffffff"));
                        //修改背景颜色
                        holder.tv.setBackgroundColor(Color.parseColor("#419152"));
                    }
                    else {
                        select[position] = false;
                        choose.remove(String.valueOf(position+1));
                        holder.tv.setTextColor(Color.parseColor("#2A313D"));
                        //修改背景颜色
                        holder.tv.setBackgroundColor(Color.parseColor("#ffffff"));
                    }
                }
            });

            return convertView;
        }

        class Holder {
            private TextView tv;
            private ImageView cancle;
        }

        public boolean[] getSelect() {
            return select;
        }
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    void getAllType() {
        XutilsHttp.getInstance().get(ServiceAPI.recipeType, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    TypeModel model = new Gson().fromJson(result,TypeModel.class);
                    if (model.isSuccess()) {
                        list.clear();
                        list.addAll(model.getData());
                        if (list.size() != 0) {
                            if (types == null) {
                                initGridView();
                            }
                            else {
                                adapter.notifyDataSetChanged();
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
