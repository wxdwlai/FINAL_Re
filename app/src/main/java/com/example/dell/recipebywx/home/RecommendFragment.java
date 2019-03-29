package com.example.dell.recipebywx.home;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.CookingModel;
import com.example.dell.recipebywx.model.UserCollectsModel;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideRoundTransform;
import com.example.dell.recipebywx.utils.GridDivider;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * create by dell on 2019/2/27
 * 推荐结果界面
 */
public class RecommendFragment extends Fragment {

    private LocalUserInfo localUserInfo;
    private View view;
    private RecyclerView recyclerView;
    private RecommendAdapter adapter;
    private List<UserCollectsModel.DataBean> list = new ArrayList<>();

    private UserCollectsModel model;
    public RecommendFragment() {
        // Required empty public constructor
    }
    public static RecommendFragment newInstance(String param1, String param2) {
        RecommendFragment fragment = new RecommendFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        localUserInfo = new LocalUserInfo(getContext());
        initData();
        if (getArguments() != null) {
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        localUserInfo = new LocalUserInfo(getContext());
        initData();
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        localUserInfo = new LocalUserInfo(getContext());
        initData();
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    private void initData() {
        getRecommend();
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

    private void initRecyclerView() {
        recyclerView = (RecyclerView)view.findViewById(R.id.recommend_rcy);
//        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
//        StaggeredGridLayoutManager flowLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(flowLayoutManager);
        GridLayoutManager manager = new GridLayoutManager(view.getContext(),2);
        manager.setSmoothScrollbarEnabled(true);
        manager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(manager);
        adapter = new RecommendAdapter(view.getContext(),list);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
//        recyclerView.addItemDecoration(new GridDivider(getActivity(),2,this.getResources().getColor(R.color.divider_line)));
        recyclerView.addItemDecoration(new SpaceItemDecoration(DensityUtils.dp2px(getActivity(),4),DensityUtils.dp2px(getActivity(),2)));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recommend,null);
        localUserInfo = new LocalUserInfo(getContext());
        initData();
        return view;
    }

    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        if (enter) {
            initData();
        }
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        getRecommend();
        super.onActivityCreated(savedInstanceState);
    }


    public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.Holder> {

        private Context context;
        private List<UserCollectsModel.DataBean> list;
        public RecommendAdapter(Context context, List<UserCollectsModel.DataBean> list) {
            this.context = context;
            this.list = list;
        }

        /**
         * 绑定布局文件
         * @param parent
         * @param viewType
         * @return
         */
        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Holder holder = null;
            View view = LayoutInflater.from(context).inflate(R.layout.layout_recommend_item,parent,false);
            holder = new Holder(view);
            return holder;
        }

        /**
         * 数据绑定
         * @param holder
         * @param position
         */
        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.position = position;
            holder.title1.setText(list.get(position).getTitle());
            if (list.get(position).getTags() != null && list.get(position).getTags().length() != 0) {
                holder.tagTv.setText(list.get(position).getTags().replaceAll("\n"," "));
            }
//            holder.image1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            Glide.with(context)
                    .load(list.get(position).getImage())
                    .transform(new CenterCrop(context),new GlideRoundTransform(context,5))
                    .into(holder.image1);
//            XutilsHttp.getInstance().bindCircularImage3(holder.image1,list.get(position).getImage(),4);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {

            private ImageView image1;
            private TextView title1;
            private TextView tagTv;
            private int position;
            public Holder(View itemView) {
                super(itemView);
                image1 = (ImageView)itemView.findViewById(R.id.image1_iv);
                title1 = (TextView)itemView.findViewById(R.id.title1_tv);
                tagTv = (TextView)itemView.findViewById(R.id.tag_tv);
//                image2 = (ImageView)itemView.findViewById(R.id.image2_iv);
//                title2 = (TextView)itemView.findViewById(R.id.title2_tv);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String reid = String.valueOf(list.get(position).getReid());
                        Intent intent = new Intent(getActivity(), RecipeDetailActivity.class);
                        intent.putExtra("reid",reid);
                        startActivity(intent);
                    }
                });
            }
        }
    }

    private void getRecommend() {
        final Map<String, String> map = new HashMap<>();
        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
            map.put("uid",localUserInfo.getUserInfo().getUid());
        }
        else {
            map.put("uid","0");
        }

        XutilsHttp.getInstance().post(ServiceAPI.RecommendRecipe, map, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    Gson gson = new Gson();
                    model = gson.fromJson(result,UserCollectsModel.class);
                    if (model.isSuccess()) {
                        list = model.getData();
                        initRecyclerView();
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }



    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
