package com.example.dell.recipebywx.message;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
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
import com.example.dell.recipebywx.LoginActivity;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.MessageModel;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.my.UserInfoActivity;
import com.example.dell.recipebywx.search.RecipeDetailActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

import javax.microedition.khronos.opengles.GL;

public class MessageFragment extends Fragment {

    private LocalUserInfo localUserInfo;
    private View view;
    private NestedScrollView messageNsv;
    private RecyclerView recyclerView;
    private MessageAdapter adapter;
    private List<MessageModel.DataBean> list = new ArrayList<>();
    private LinearLayout emptyLl;
    private AlertDialog dialog;
    public MessageFragment() {
        // Required empty public constructor
    }

    public static MessageFragment newInstance(String param1, String param2) {
        MessageFragment fragment = new MessageFragment();
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
        view = inflater.inflate(R.layout.fragment_message,null);
        localUserInfo = new LocalUserInfo(getContext());
        messageNsv = (NestedScrollView)view.findViewById(R.id.messge_nsv);
        messageNsv.setVisibility(View.VISIBLE);
//        messageNsv.setVisibility(View.GONE);
        emptyLl = (LinearLayout)view.findViewById(R.id.message_none_ll);
//        emptyLl.setVisibility(View.GONE);
//        emptyLl.setVisibility(View.VISIBLE);
        getMessage();
//        initRecycleView(view);
        return view;
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if (enter) {
            if (!"0".equals(localUserInfo.getUserInfo().getUid())) {
//                getUserCollects();
                getMessage();
            } else {
                emptyLl.setVisibility(View.VISIBLE);
                if (adapter != null) {
                    list.clear();
                    adapter.notifyDataSetChanged();
                }
                startActivityForResult(new Intent(getActivity(), LoginActivity.class), 200);
            }
        }
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        if (!"0".equals(localUserInfo.getUserInfo().getUid())) {
            getMessage();
        } else {
            emptyLl.setVisibility(View.VISIBLE);
            if (adapter != null) {
                list.clear();
                adapter.notifyDataSetChanged();
            }
            startActivityForResult(new Intent(getActivity(), LoginActivity.class), 200);
        }
        super.onActivityCreated(savedInstanceState);
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
        private List<MessageModel.DataBean> list;

        public MessageAdapter(Context context, List<MessageModel.DataBean> list) {
            this.context = context;
            this.list = list;
        }

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.layout_message_common,parent,false);
            Holder holder = new Holder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(Holder holder, final int position) {
            holder.position = position;
            holder.nameTv.setText(list.get(position).getUserInfo().getUserName());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
            Long date = list.get(position).getCreateTime();
            String d = simpleDateFormat.format(date);
            holder.timeTv.setText(d);
            holder.contentTv.setText(list.get(position).getContext());
            holder.messageTv.setText(list.get(position).getComment().getContext());
            Glide.with(context).load(list.get(position).getUserInfo().getImage())
                    .transform(new GlideCircleTransform(context))
                    .into(holder.iconIv);

            holder.iconIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(),MessageDetailActivity.class);
//                    Intent intent = new Intent(getActivity(), UserInfoActivity.class);
                    intent.putExtra("userId",String.valueOf(list.get(position).getUserInfo().getUserName()));
                    startActivity(intent);
                }
            });
            holder.nameTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), UserInfoActivity.class);
                    intent.putExtra("userId",String.valueOf(list.get(position).getPuid()));
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
            public Holder(View itemView) {
                super(itemView);
                iconIv = (ImageView)itemView.findViewById(R.id.icon_iv);
                nameTv = (TextView)itemView.findViewById(R.id.name_tv);
                timeTv = (TextView)itemView.findViewById(R.id.time_tv);
                contentTv = (TextView)itemView.findViewById(R.id.content_tv);
                messageTv = (TextView)itemView.findViewById(R.id.message_tv);
                final String[] items = {"查看菜谱详情","不再显示此回复"};
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog = new AlertDialog.Builder(getActivity())
                                .setItems(items, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        if (which == 0) {
                                            Intent intent = new Intent(getActivity(),RecipeDetailActivity.class);
                                            intent.putExtra("reid",String.valueOf(list.get(position).getReid()));
                                            startActivity(intent);
                                        }
                                        else {
                                            delMessage(position);
                                        }
                                    }
                                }).create();
                        dialog.show();
//                        Intent intent = new Intent(getActivity(),RecipeDetailActivity.class);
//                        intent.putExtra("reid",String.valueOf(list.get(position).getReid()));
//                        intent.putExtra("userName",list.get(position).getUserInfo().getUserName());
//                        startActivity(intent);
                    }
                });
//                itemView.setOnLongClickListener(new View.OnLongClickListener() {
//                    @Override
//                    public boolean onLongClick(View v) {
//                        return false;
//                    }
//                });
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
        XutilsHttp.getInstance().get(ServiceAPI.getMessage, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    MessageModel messageModel = new Gson().fromJson(result,MessageModel.class);
                    if (messageModel.isSuccess()) {
                        list.clear();
                        list.addAll(messageModel.getData());
                        if (list.size() != 0) {
                            if (recyclerView == null) {
                                initRecycleView();
                            }
                            else {
                                adapter.notifyDataSetChanged();
                            }
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
        map.put("mid",String.valueOf(list.get(position).getMid()));
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
