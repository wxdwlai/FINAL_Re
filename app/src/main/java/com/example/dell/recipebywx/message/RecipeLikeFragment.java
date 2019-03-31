package com.example.dell.recipebywx.message;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.RecipeCommentModel;
import com.example.dell.recipebywx.model.RecipeLikeModel;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.my.UserActivity;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeLikeFragment extends Fragment {

    private LocalUserInfo localUserInfo;
    private View view;
    private RecyclerView recyclerView;
    private MessageAdapter adapter;
    private List<RecipeLikeModel.DataBean> list = new ArrayList<>();
    private AlertDialog dialog;
    private LinearLayout emptyLl;
    public RecipeLikeFragment() {

    }

    public static RecipeLikeFragment newInstance(String param1, String param2) {
        RecipeLikeFragment fragment = new RecipeLikeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
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
        view = inflater.inflate(R.layout.fragment_recipe_comment, null);
        emptyLl = (LinearLayout)view.findViewById(R.id.message_none_ll);
        localUserInfo = new LocalUserInfo(getContext());
        getMessage();

        return view;
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if (enter) {
            getMessage();
        }
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    private void initRecycleView() {
        recyclerView = (RecyclerView)view.findViewById(R.id.id_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        adapter = new MessageAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new SpaceItemDecoration(0, DensityUtils.dp2px(getActivity(),10)));
    }

    public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.Holder> {

        private Context context;
        private List<RecipeLikeModel.DataBean> list;

        public MessageAdapter(Context context, List<RecipeLikeModel.DataBean> list) {
            this.context = context;
            this.list = list;
        }

        @Override
        public MessageAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.layout_message_common,parent,false);
            MessageAdapter.Holder holder = new MessageAdapter.Holder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(MessageAdapter.Holder holder, final int position) {
            holder.position = position;
            holder.nameTv.setText(list.get(position).getUserInfo().getUserName());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
            Long date = list.get(position).getTime();
            String d = simpleDateFormat.format(date);
            holder.timeTv.setText(d);
            holder.contentTv.setText("赞了你");
//            holder.contentTv.setText(list.get(position).getReid());
            Glide.with(context).load(list.get(position).getUserInfo().getImage())
                    .transform(new GlideCircleTransform(context))
                    .into(holder.iconIv);

            holder.iconIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(),UserActivity.class);
//                    Intent intent = new Intent(getActivity(), UserInfoActivity.class);
                    intent.putExtra("userId",String.valueOf(list.get(position).getUid()));
                    startActivity(intent);
                }
            });
            holder.nameTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), UserActivity.class);
                    intent.putExtra("userId",String.valueOf(list.get(position).getUid()));
                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {
            private int position;
            private ImageView iconIv;
            private TextView nameTv;
            private TextView timeTv;
            private TextView contentTv;
            private TextView messageTv;
            private LinearLayout commentLl;
            public Holder(View itemView) {
                super(itemView);
                iconIv = (ImageView)itemView.findViewById(R.id.icon_iv);
                nameTv = (TextView)itemView.findViewById(R.id.name_tv);
                timeTv = (TextView)itemView.findViewById(R.id.time_tv);
                contentTv = (TextView)itemView.findViewById(R.id.content_tv);
                messageTv = (TextView)itemView.findViewById(R.id.message_tv);
                commentLl = (LinearLayout)itemView.findViewById(R.id.comment_ll);
                commentLl.setVisibility(View.GONE);
                final String[] items = {"查看菜谱详情","不再显示此回复"};
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(),RecipeDetailActivity.class);
                        intent.putExtra("reid",String.valueOf(list.get(position).getReid()));
                        startActivity(intent);
//                        dialog = new AlertDialog.Builder(getActivity())
//                                .setItems(items, new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialog, int which) {
//                                        if (which == 0) {
//                                            Intent intent = new Intent(getActivity(),RecipeDetailActivity.class);
//                                            intent.putExtra("reid",String.valueOf(list.get(position).getReid()));
//                                            startActivity(intent);
//                                        }
//                                        else {
////                                            delMessage(position);
//                                        }
//                                    }
//                                }).create();
//                        dialog.show();
                    }
                });
            }
        }
    }

    /**
     * 获取评论消息
     */
    public void getMessage() {
        Map<String,String> map = new HashMap<>();
        map.put("uid",String.valueOf(localUserInfo.getUserInfo().getUid()));
        if (!"0".equals(localUserInfo.getUserInfo().getToken())) {
            map.put("x-auth-token",localUserInfo.getUserInfo().getToken());
        }
        XutilsHttp.getInstance().get(ServiceAPI.getLikeMessage, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    RecipeLikeModel messageModel = new Gson().fromJson(result,RecipeLikeModel.class);
                    if (messageModel.isSuccess()) {
                        list.clear();
                        list.addAll(messageModel.getData());
                        if (list.size() != 0) {
                            initRecycleView();
//                            if (recyclerView == null) {
//                                initRecycleView();
//                            }
//                            else {
//                                adapter.notifyDataSetChanged();
//                            }
                        }
                        else {
                            recyclerView.setVisibility(View.GONE);
                            emptyLl.setVisibility(View.VISIBLE);
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
     * 删除消息（评论消息）
     */
    public void delMessage(final int position) {
        Map<String, String> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        map.put("mid",String.valueOf(list.get(position)));
        XutilsHttp.getInstance().delete(ServiceAPI.delMessage, map, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    UserInforModel model = new Gson().fromJson(result,UserInforModel.class);
                    if (model.isSuccess()) {
                        list.remove(position);
                        adapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

}
