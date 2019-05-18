package com.example.dell.recipebywx.message;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.PrivateMessageModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrivateMsgFragment extends Fragment {

    private LocalUserInfo localUserInfo;
    private View view;
    private SmartRefreshLayout refreshLayout;
    private RecyclerView messageRcy;
    private MessageAdapter adapter;
    private List<PrivateMessageModel.DataBean> list = new ArrayList<>();

    public PrivateMsgFragment() {
        // Required empty public constructor
    }

    public static PrivateMsgFragment newInstance(String param1, String param2) {
        PrivateMsgFragment fragment = new PrivateMsgFragment();
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
        view = inflater.inflate(R.layout.fragment_private_msg,null);
        localUserInfo = new LocalUserInfo(getActivity());
        refreshLayout = (SmartRefreshLayout)view.findViewById(R.id.refresh);
        refreshLayout.setRefreshHeader(new ClassicsHeader(getContext()));
        refreshLayout.setRefreshFooter(new BallPulseFooter(getContext()).setSpinnerStyle(SpinnerStyle.Scale));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(1000);
                getPrivate();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(1000);
                getPrivate();
            }
        });
        getPrivate();
        return view;
    }

    public void initRecycleView() {
        messageRcy = (RecyclerView)view.findViewById(R.id.message_rcy);
        messageRcy.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        adapter = new MessageAdapter(getActivity(),list);
        messageRcy.setAdapter(adapter);
        messageRcy.addItemDecoration(new SpaceItemDecoration(0, DensityUtils.dp2px(getActivity(),10)));
    }

    public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.Holder> {

        private Context context;
        private List<PrivateMessageModel.DataBean> list;

        public MessageAdapter(Context context,List<PrivateMessageModel.DataBean> list) {
            this.context = context;
            this.list = list;
        }
        //绑定布局
        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Holder holder = null;
            View view = LayoutInflater.from(context).inflate(R.layout.layout_message_item,null);
            holder = new Holder(view);
            return holder;
        }

        //item数据绑定
        @Override
        public void onBindViewHolder(Holder holder, int position) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            Long time = list.get(position).getDate();
            String date = dateFormat.format(time);
            holder.position = position;
            if (String.valueOf(list.get(position).getUid()).equals(localUserInfo.getUserInfo().getUid())) {
//                holder.userName = list.get(position).getReceiverInfo().getUserName();
//                holder.userId = list.get(position).getReceiverInfo().getUid();
                holder.userNameTv.setText(list.get(position).getReceiverInfo().getUserName());
                holder.timeTv.setText(date);
                Glide.with(context).load(list.get(position).getReceiverInfo().getImage())
                        .transform(new GlideCircleTransform(context))
                        .into(holder.userIconIv);
            }
            else {
                holder.userNameTv.setText(list.get(position).getSenderInfo().getUserName());
//            XutilsHttp.getInstance().bindCircularImage(holder.userIconIv,list.get(position).getReceiverInfo().getImage(),10);
                holder.timeTv.setText(date);
                Glide.with(context).load(list.get(position).getSenderInfo().getImage())
                        .transform(new GlideCircleTransform(context))
                        .into(holder.userIconIv);
            }

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {

            private ImageView userIconIv;
            private TextView userNameTv;
            private TextView timeTv;
            private int position;
            private String userName;
            private String userId;
            public Holder(View itemView) {
                super(itemView);
                userIconIv = (ImageView)itemView.findViewById(R.id.user_icon_iv);
                userNameTv = (TextView)itemView.findViewById(R.id.user_name_tv);
                timeTv = (TextView)itemView.findViewById(R.id.message_time_tv);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (String.valueOf(list.get(position).getUid()).equals(localUserInfo.getUserInfo().getUid())) {
                            Intent intent = new Intent(getContext(),MessageDetailActivity.class);
                            intent.putExtra("userId",String.valueOf(list.get(position).getReceiverInfo().getUid()));
                            intent.putExtra("userName",list.get(position).getReceiverInfo().getUserName());
                            startActivity(intent);
                        }
                        else {
                            Intent intent = new Intent(getContext(),MessageDetailActivity.class);
                            intent.putExtra("userId",String.valueOf(list.get(position).getSenderInfo().getUid()));
                            intent.putExtra("userName",list.get(position).getSenderInfo().getUserName());
                            startActivity(intent);
                        }

                    }
                });
            }
        }
    }

    public void getPrivate() {
        Map map = new HashMap();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.getMessageUsers, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    PrivateMessageModel messageModel = new Gson().fromJson(result,PrivateMessageModel.class);
                    if (messageModel.isSuccess()) {
                        list = messageModel.getData();
                        if (list.size() != 0) {
                            initRecycleView();
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
