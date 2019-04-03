package com.example.dell.recipebywx.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.dell.recipebywx.LoginActivity;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.my.PostRecipeActivity;
import com.example.dell.recipebywx.search.SearchRecipeActivity;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * create by wx :2018/12/28
 */
public class HomeFragment extends Fragment {

    private LocalUserInfo localUserInfo;

    private LinearLayout addRecipeLl;

    private TabLayout cookingStyleTab;
    private ViewPager cookingView;
    private CookingStylePagerAdapter pagerAdapter;

    private LinearLayout searchLl;
    private ImageView searchIv;
    private EditText searchEtv;

    private LinearLayout menuLl;

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> stylesList = new ArrayList<>();
    private FragmentManager fragmentManager;
    public HomeFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
        localUserInfo = new LocalUserInfo(getContext());
        addRecipeLl = (LinearLayout)view.findViewById(R.id.toolbar_left_button);
        searchLl = view.findViewById(R.id.toolbar_center_serch);
        searchIv = view.findViewById(R.id.toolbar_search_iv);
        searchEtv = view.findViewById(R.id.toolbar_search_etv);
//        searchEtv.clearFocus();
        cookingStyleTab = (TabLayout)view.findViewById(R.id.style_of_cooking_tab);
        cookingView = (ViewPager)view.findViewById(R.id.style_of_cooking_view);
//        menuLl = (LinearLayout)view.findViewById(R.id.toolbar_left_button);

        String[] styles = {"推荐","热菜","家常菜","早餐","午餐","下午茶","晚餐","儿童","老人","烘焙","川菜","甜品",};
        for (int i=0;i<styles.length;i++) {
            if (i==0) {
                stylesList.add("推荐");
                fragmentList.add(new RecommendFragment());
            }
            else {
                stylesList.add(styles[i]);
                fragmentList.add(new CookingListFragment(i));
            }

        }
        pagerAdapter = new CookingStylePagerAdapter(getActivity().getSupportFragmentManager(),view.getContext(),fragmentList,stylesList);
        cookingView.setAdapter(pagerAdapter);
        cookingStyleTab.setupWithViewPager(cookingView);

        //搜索框进入搜索菜谱界面
        searchLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchRecipeActivity.class);
                intent.putExtra("userId","1");
                startActivity(intent);
            }
        });
        searchIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchRecipeActivity.class);
                startActivity(intent);
            }
        });
        searchEtv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchRecipeActivity.class);
                startActivity(intent);
            }
        });

//        menuLl.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(),CategoryActivity.class);
//                startActivity(intent);
//            }
//        });
        addRecipeLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), PostRecipeActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        localUserInfo = new LocalUserInfo(getContext());
        RecommendFragment recommend = new RecommendFragment();
        fragmentList.remove(0);
        fragmentList.add(0,recommend);
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        localUserInfo = new LocalUserInfo(getContext());
        RecommendFragment recommend = new RecommendFragment();
        fragmentList.remove(0);
        fragmentList.add(0,recommend);
        return super.onCreateAnimation(transit, enter, nextAnim);
    }
}
