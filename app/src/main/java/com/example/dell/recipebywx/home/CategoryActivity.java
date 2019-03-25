package com.example.dell.recipebywx.home;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.dell.recipebywx.CustomGridView;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.utils.Helper;

import java.util.List;
import java.util.Map;

public class CategoryActivity extends AppCompatActivity {

    private LinearLayout back;
    private TextView hotTv;
    private CustomGridView hotGdv;
    private TextView kindsTv;
    private CustomGridView kindsGdv;
    private TextView meteriaTv;
    private CustomGridView meteriaGdv;
    private TextView likeTv;
    private CustomGridView likeGdv;
    private SimpleAdapter adapter;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initView();
        this.changeStatusBarTextColor(true);
    }

    private void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        hotTv = (TextView)findViewById(R.id.hot_tv);
        hotGdv = (CustomGridView)findViewById(R.id.hot_grid_view);
        kindsTv = (TextView)findViewById(R.id.kind_tv);
        kindsGdv = (CustomGridView)findViewById(R.id.kinds_grid_view);
        meteriaTv = (TextView)findViewById(R.id.mereria_tv);
        meteriaGdv = (CustomGridView)findViewById(R.id.mereria_grid_view);
        likeTv = (TextView)findViewById(R.id.like_tv);
        likeGdv = (CustomGridView)findViewById(R.id.like_grid_view);
    }

    private void initData() {
        String[] data = {""};
    }

//    private class CategoryAdapter extends SimpleAdapter {
//        private Context context;
//        private List<?> list;
//        public CategoryAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
//            super(context, data, resource, from, to);
//            this.context = context;
//            this.list = data;
//        }
//    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
}
