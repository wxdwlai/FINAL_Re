package com.example.dell.recipebywx.my;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.recipebywx.CustomGridView;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.TasteModel;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.google.gson.Gson;
import com.mob.wrappers.UMSSDKWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TasteSettingActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private LinearLayout back;
    private CustomGridView tasteGv;
    private TasteAdapter adapter;
    private List<TasteModel.DataBean> list = new ArrayList<>();

    private CustomGridView tasteGv2;
    private TasteAdapter adapter2;
    private List<UserInforModel.DataBean.UserTastesBean> list2 = new ArrayList<>();
    private TextView saveTv;
    private List<String> choose = new ArrayList<>();
    private boolean[] select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taste_setting);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        this.changeStatusBarTextColor(true);
        initView();
    }

    void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        getTaste();
        getUser();
        saveTv = (TextView)findViewById(R.id.save_tv);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //保存标签
        saveTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("++++++++++++++++标签数目+++++++++++++++++\n"+choose.size());
                putTags();
                getUser();
            }
        });
    }

    void initGridView() {
        tasteGv = (CustomGridView)findViewById(R.id.label_grv);
        adapter = new TasteAdapter(getApplicationContext(),list,1);
        tasteGv.setAdapter(adapter);
        select = new boolean[list.size()];
        select = adapter.getSelect();
    }

    //用户已选口味标签
    void initGridView2() {
        tasteGv2 = (CustomGridView)findViewById(R.id.label_grv2);
        adapter2 = new TasteAdapter(getApplicationContext(),list2);
        tasteGv2.setAdapter(adapter2);
    }

    class TasteAdapter extends BaseAdapter {

        private Context context;
        private List<TasteModel.DataBean> list;
        private List<UserInforModel.DataBean.UserTastesBean> list2;
        private boolean[] select;
        private int tag = -1;//表示全部的口味标签

        public TasteAdapter(Context context, List<TasteModel.DataBean> list,int tag) {
            this.context = context;
            this.list = list;
            select = new boolean[list.size()];
            this.tag = tag;
            for (int i=0;i<list.size();i++) {
                select[i] = false;
            }
        }
        public TasteAdapter(Context context, List<UserInforModel.DataBean.UserTastesBean> list) {
            this.context = context;
            this.list2 = list;
            select = new boolean[list.size()];
            this.tag = tag;
            for (int i=0;i<list.size();i++) {
                select[i] = false;
            }
        }
        @Override
        public int getCount() {
            if (tag != -1)
                return list.size();
            else return list2.size();
        }

        @Override
        public Object getItem(int position) {
            if (tag != -1)
                return list.get(position);
            else return list2.get(position);
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
//                holder.cancle.setVisibility(View.VISIBLE);
                convertView.setTag(holder);
            } else {
                holder = (Holder) convertView.getTag();
            }
            if (tag == 1) {
                holder.tv.setText(list.get(position).getTagName());
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
            }
            else {
                holder.tv.setText(list2.get(position).getTags().getTagName());
                holder.cancle.setVisibility(View.VISIBLE);
                holder.cancle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        deleteTaste(String.valueOf(list2.get(position).getTagId()));
                        list2.remove(position);
                        adapter2.notifyDataSetChanged();
                    }
                });
            }

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

    public void getTaste() {
//        Map map = new HashMap();
//        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.getTaste, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    TasteModel tasteModel = new Gson().fromJson(result,TasteModel.class);
                    if (tasteModel.isSuccess()) {
                        list.clear();
                        list.addAll(tasteModel.getData());
                        if (tasteGv == null) {
                            initGridView();
                        }
                        else {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
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
                        list2.clear();
                        list2.addAll(userInforModel.getData().getUserTastes());
                        if (tasteGv2 == null) {
                            initGridView2();
                        }
                        else {
                            adapter2.notifyDataSetChanged();
                        }
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

//    public void getUserTaste() {
//        Map map = new HashMap();
//        map.put("uid",localUserInfo.getUserInfo().getUid());
//        XutilsHttp.getInstance().get(ServiceAPI.getUserTaste, map, new XutilsHttp.XCallBack() {
//            @Override
//            public void onResponse(String result) {
//                if (result != null) {
//                    TasteModel tasteModel = new Gson().fromJson(result,TasteModel.class);
//                    if (tasteModel.isSuccess()) {
//                        list2.clear();
//                        list2.addAll(tasteModel.getData());
//                        initGridView2();
//                    }
//                }
//            }
//
//            @Override
//            public void onError(String result) {
//
//            }
//        });
//    }
    /**
     * 保存用户标签修改
     */
    void putTags() {
        Map map = new HashMap();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        Map<String,Object> maps = new HashMap<>();
        maps.put("list",choose);
        XutilsHttp.getInstance().post(ServiceAPI.putTaste, map, maps, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    TasteModel tasteModel = new Gson().fromJson(result,TasteModel.class);
                    if (tasteModel.isSuccess()) {
                        Toast.makeText(TasteSettingActivity.this,"保存成功",Toast.LENGTH_SHORT).show();
                        UserInforModel.DataBean.UserTastesBean taste = new UserInforModel.DataBean.UserTastesBean();
                        UserInforModel.DataBean.UserTastesBean.TagsBean tag = new UserInforModel.DataBean.UserTastesBean.TagsBean();
//                        for (int i=0;i<choose.size();i++) {
//                            tag.setTagId(Integer.valueOf(choose.get(i)));
//                            tag.setTagName(list.get(Integer.valueOf(choose.get(i))-1).getTagName());
//                            taste.setTags(tag);
//                            taste.setTagId(Integer.valueOf(choose.get(i)));
//                            taste.setUid(Integer.valueOf(localUserInfo.getUserInfo().getUid()));
//                            list2.add(taste);
//                        }
                        adapter2.notifyDataSetChanged();
                        adapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    void deleteTaste(String tagId) {
        Map map = new HashMap();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        map.put("tagId",String.valueOf(tagId));
        XutilsHttp.getInstance().post(ServiceAPI.deleteTaste,map,null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    TasteModel tasteModel = new Gson().fromJson(result,TasteModel.class);
                    if (tasteModel.isSuccess()) {

                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }



    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
}
