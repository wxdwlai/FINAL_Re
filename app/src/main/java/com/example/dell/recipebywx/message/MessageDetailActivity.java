package com.example.dell.recipebywx.message;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.MessageModel;
import com.example.dell.recipebywx.model.PrivateMessageModel;
import com.example.dell.recipebywx.my.UserActivity;
import com.example.dell.recipebywx.my.UserInfoActivity;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;
//import com.mob.commons.MOBIM;
//import com.mob.imsdk.MobIM;
//import com.mob.imsdk.MobIMCallback;
//import com.mob.imsdk.MobIMMessageReceiver;
//import com.mob.imsdk.model.IMConversation;
//import com.mob.imsdk.model.IMMessage;

import org.w3c.dom.Text;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageDetailActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private TextView titleTv;
    private String userName;
    private ImageView rightIv;
    private LinearLayout back;
    private TextView tv1;
    private TextView send;
    private EditText inputEtv;
    private String userId;
    private RecyclerView messageRcy;
    private MessageAdapter adapter;
    private List<PrivateMessageModel.DataBean> list = new ArrayList<>();
    final private int SENDER_TAG = 1;
    final private int RECEIVER_TAG = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        userId = getIntent().getStringExtra("userId");
        userName = getIntent().getStringExtra("userName");
        initView();
        getPrivateMessage();
        this.changeStatusBarTextColor(true);
    }

    private void initView() {
        titleTv = (TextView)findViewById(R.id.toolbar_center_tv);
        titleTv.setText(userName);
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        rightIv = (ImageView)findViewById(R.id.toolbar_right_image);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rightIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MessageDetailActivity.this,UserActivity.class);
                intent.putExtra("userId",String.valueOf(userId));
                startActivity(intent);
            }
        });
        inputEtv = (EditText)findViewById(R.id.input_etv);
        send = (TextView)findViewById(R.id.send_tv);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sendMessage();
                if (inputEtv.getText() != null && inputEtv.getText().toString().length() != 0) {
                    PrivateMessageModel.DataBean dataBean = new PrivateMessageModel.DataBean();
                    dataBean.setMessage(inputEtv.getText().toString());
                    PrivateMessageModel.DataBean.SenderInfoBean userInfoBean = new PrivateMessageModel.DataBean.SenderInfoBean();
                    userInfoBean.setImage(localUserInfo.getUserInfo().getIconurl());
                    userInfoBean.setUserName(localUserInfo.getUserInfo().getName());
                    userInfoBean.setUid(Integer.valueOf(localUserInfo.getUserInfo().getUid()));
                    dataBean.setSenderInfo(userInfoBean);
                    dataBean.setUid(Integer.valueOf(localUserInfo.getUserInfo().getUid()));
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    dataBean.setDate(timestamp.getTime());
                    if (adapter == null) {
                        initRecyclerView();
                    }
                    adapter.addData(dataBean);
                    inputEtv.setText(null);
                }
                else {
                    Toast.makeText(MessageDetailActivity.this,"输入内容不能为空~",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void initRecyclerView() {
        messageRcy = (RecyclerView)findViewById(R.id.content_rcy);
        messageRcy.setLayoutManager(new LinearLayoutManager(MessageDetailActivity.this,LinearLayoutManager.VERTICAL,false));
        adapter = new MessageAdapter(MessageDetailActivity.this,list);
        messageRcy.setAdapter(adapter);
        messageRcy.addItemDecoration(new SpaceItemDecoration(0, DensityUtils.dp2px(MessageDetailActivity.this,10)));
        messageRcy.scrollToPosition(list.size()-1);
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.Holder> {

        private Context context;
        private List<PrivateMessageModel.DataBean> list;

        public MessageAdapter(Context context,List<PrivateMessageModel.DataBean> list) {
            this.context = context;
            this.list = list;
        }

        public void addData(PrivateMessageModel.DataBean message) {
            list.add(message);
            notifyItemInserted(list.size()-1);
            messageRcy.scrollToPosition(list.size()-1);
        }

        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view;
            view = LayoutInflater.from(context).inflate(R.layout.layout_send_item,null);
            Holder holder = new Holder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(Holder holder, final int position) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            Long time = list.get(position).getDate();
            String date = dateFormat.format(time);
            if (String.valueOf(list.get(position).getSenderInfo().getUid()).equals(localUserInfo.getUserInfo().getUid())) {
                holder.position = position;
                holder.flag = SENDER_TAG;
                holder.receiverLl.setVisibility(View.GONE);
                holder.senderLl.setVisibility(View.VISIBLE);
                holder.textSTv.setText(list.get(position).getMessage());
                holder.timeTv.setText(date);
                Glide.with(context).load(list.get(position).getSenderInfo().getImage())
                        .transform(new GlideCircleTransform(context))
                        .into( holder.userSIv);
            }
            else {
                holder.position = position;
                holder.flag = RECEIVER_TAG;
                holder.receiverLl.setVisibility(View.VISIBLE);
                holder.senderLl.setVisibility(View.GONE);
                holder.textTv.setText(list.get(position).getMessage());
                holder.timeTv.setText(date);
                Glide.with(context).load(list.get(position).getSenderInfo().getImage())
                        .transform(new GlideCircleTransform(context))
                        .into( holder.userIv);
                holder.userIv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MessageDetailActivity.this, UserActivity.class);
                        intent.putExtra("userId",String.valueOf(list.get(position).getSenderInfo().getUid()));
                        startActivity(intent);

                    }
                });
            }
//            if (holder instanceof SenderHolder) {
//                if (String.valueOf(list.get(position).getSenderInfo().getUid()).equals(localUserInfo.getUserInfo().getUid())) {
//                    ((SenderHolder) holder).position = position;
//                    ((SenderHolder) holder).textTv.setText(list.get(position).getMessage());
//                    Glide.with(context).load(list.get(position).getSenderInfo().getImage())
//                            .transform(new GlideCircleTransform(context))
//                            .into(((SenderHolder) holder).userIv);
//                }
//            }
//            else if (holder instanceof ReceiverHolder) {
//                if (!String.valueOf(list.get(position).getSenderInfo().getUid()).equals(localUserInfo.getUserInfo().getUid())) {
//                    ((ReceiverHolder) holder).position = position;
//                    ((ReceiverHolder) holder).textTv.setText(list.get(position).getMessage());
//                    Glide.with(context).load(list.get(position).getSenderInfo().getImage())
//                            .transform(new GlideCircleTransform(context))
//                            .into(((ReceiverHolder) holder).userIv);
//                }
//                ((ReceiverHolder) holder).position = position;
//            }
//            else {
//                //其他类型的消息
//            }
        }


        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {

            private int flag;
            private int position;
            private LinearLayout receiverLl;
            private RelativeLayout senderLl;
            private TextView timeTv;
            private ImageView userIv;
            private TextView textTv;

            private ImageView userSIv;
            private TextView textSTv;
            public Holder(View itemView) {
                super(itemView);
                receiverLl = (LinearLayout) itemView.findViewById(R.id.receiver_ll);
                senderLl = (RelativeLayout) itemView.findViewById(R.id.sender_ll);
                timeTv = (TextView)itemView.findViewById(R.id.tv_send_msg_date) ;
                textSTv = (TextView)itemView.findViewById(R.id.tv_item_send_txt);
                userSIv = (ImageView)itemView.findViewById(R.id.from_person_avator02);
                userIv = (ImageView)itemView.findViewById(R.id.from_person_avator);
                textTv = (TextView)itemView.findViewById(R.id.tv_item_from_txt);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        }

        public class SenderHolder extends RecyclerView.ViewHolder {

            private TextView timeTv;
            private ImageView userIv;
            private TextView textTv;
            private int position;
            public SenderHolder(View itemView) {
                super(itemView);
                timeTv = (TextView)itemView.findViewById(R.id.tv_send_msg_date) ;
                textTv = (TextView)itemView.findViewById(R.id.tv_item_send_txt);
                userIv = (ImageView)itemView.findViewById(R.id.from_person_avator02);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Intent intent = new Intent();
//                        startActivity(intent);
                    }
                });
            }
        }

        public class ReceiverHolder extends RecyclerView.ViewHolder {

            private ImageView userIv;
            private TextView textTv;
            private TextView timeTv;
            private int position;
            public ReceiverHolder(View itemView) {
                super(itemView);
                userIv = (ImageView)itemView.findViewById(R.id.from_person_avator);
                textTv = (TextView)itemView.findViewById(R.id.tv_item_from_txt);
                timeTv = (TextView)itemView.findViewById(R.id.tv_from_msg_date);
            }
        }
    }

    public void getPrivateMessage() {
        Map map = new HashMap();
        map.put("uuid",userId);
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.getPrivateMessage, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    PrivateMessageModel messageModel = new Gson().fromJson(result,PrivateMessageModel.class);
                    if (messageModel.isSuccess()) {
                        list.clear();
                        list.addAll(messageModel.getData());
                        if (list.size() != 0) {
                            initRecyclerView();
                            if (String.valueOf(list.get(0).getUid()).equals(userId)) {
                                Glide.with(getApplicationContext()).load(list.get(0).getSenderInfo().getImage())
                                        .transform(new GlideCircleTransform(getApplicationContext()))
                                        .into(rightIv);
                            }
                            else {
                                Glide.with(getApplicationContext()).load(list.get(0).getReceiverInfo().getImage())
                                        .transform(new GlideCircleTransform(getApplicationContext()))
                                        .into(rightIv);
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

    public void sendMessage() {
        Map map = new HashMap();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        map.put("uuid",userId);
        map.put("message",inputEtv.getText().toString());
        XutilsHttp.getInstance().put(ServiceAPI.sendMessage, map, null, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
//                    PrivateMessageModel.DataBean dataBean = new PrivateMessageModel.DataBean();
//                    dataBean.setMessage(inputEtv.getText().toString());
//                    dataBean.getSenderInfo().setImage(localUserInfo.getUserInfo().getIconurl());
//                    dataBean.getSenderInfo().setUserName(localUserInfo.getUserInfo().getName());
//                    dataBean.setUid(Integer.valueOf(localUserInfo.getUserInfo().getUid()));
//                    adapter.addData(dataBean);
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }
}
