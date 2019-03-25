package com.example.dell.recipebywx.message;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.mob.commons.MOBIM;
import com.mob.imsdk.MobIM;
import com.mob.imsdk.MobIMCallback;
import com.mob.imsdk.MobIMMessageReceiver;
import com.mob.imsdk.model.IMConversation;
import com.mob.imsdk.model.IMMessage;

import org.w3c.dom.Text;

import java.util.List;

public class MessageDetailActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private TextView titleTv;
    private String userName;
    private LinearLayout back;
    private TextView tv1;
    private TextView send;
    private EditText inputEtv;
    private String userId;
    private IMMessage msg;
    MobIMMessageReceiver mobMsgRever;
    MobIMCallback<List<IMConversation>> conversations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        userName = getIntent().getStringExtra("userId");
        initView();
        //设置消息监听
        MobIM.addMessageReceiver(mobMsgRever);
        //获取会话列表
        MobIM.getChatManager().getAllLocalConversations(conversations);
        this.changeStatusBarTextColor(true);
    }

    private void initView() {
        titleTv = (TextView)findViewById(R.id.toolbar_center_tv);
        titleTv.setText(userName);
        inputEtv = (EditText)findViewById(R.id.input_etv);
        tv1 = (TextView)findViewById(R.id.message_tv);
        send = (TextView)findViewById(R.id.send_tv);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = MobIM.getChatManager().createTextMessage(userId,inputEtv.getText().toString(),IMConversation.TYPE_USER);
                //发送消息
                MobIM.getChatManager().sendMessage(msg, new MobIMCallback<Void>() {
                    public void onSuccess(Void result)  {
                        tv1.setText(msg.getBody());
                        // TODO 处理消息发送成功的结果
                    }
                    public void onError(int code, String message)  {
                        // TODO 根据错误码（code）处理错误返回
                        tv1.setText("发送失败");
                    }
                });
            }
        });
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }
}
