package com.example.dell.recipebywx.my;

import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.Base64BitmapUtil;
import com.example.dell.recipebywx.utils.GlideCircleTransform;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.mob.MobSDK.getContext;

public class UserInfoActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    public static UserInfoActivity instance = null;
    private String [] permissions = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_PHONE_STATE", "android.permission.SYSTEM_ALERT_WINDOW","android.permission.CAMERA"};


    private String userId;
    private String uid = "1";//当前界面的user id
    private LinearLayout back;
    private RelativeLayout headIconRl;
    private ImageView headIconIv;
    private LinearLayout userNameLl;
    private EditText userNameEtv;
    private TextView userNameTv;
    private LinearLayout userSexLl;
    private TextView userSexTv;
    private LinearLayout userAreaLl;
    private EditText userAreaEtv;
    private TextView userAreaTv;
    private LinearLayout userTasteLl;
    private LinearLayout userLikeLl;
    private TextView userLikeTv;
    private LinearLayout logoutLl;
    private TextView saveUserInfoTv;
    private AlertDialog sexDialog;//性别选择对话框
    private TextView updateTv;
    private LinearLayout userIntroLl;
    private EditText userIntroEtv;
    private TextView userIntroTv;

    private Uri imageUri;
    public static final int TAKE_PHOTO = 1;
    public static final int CHOOSE_PHOTO = 2;
    private final int REQUEST_CODE_GALLERY = 1001;
    private AlertDialog alertDialog;
    private String base64List;//.add("data:image/png;base64,"+Base64BitmapUtil.bitmapToBase64(bitmap));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        userId = localUserInfo.getUserInfo().getUid();//getIntent().getStringExtra("userId");
        instance = this;
        this.changeStatusBarTextColor(true);
        initView();
    }

    private void initView() {
        back = (LinearLayout)findViewById(R.id.toolbar_left_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        headIconRl = (RelativeLayout)findViewById(R.id.head_icon);
        headIconIv = (ImageView)findViewById(R.id.head_icon_iv);
        userNameLl  = (LinearLayout)findViewById(R.id.id_name_ll);
        userNameEtv = (EditText)findViewById(R.id.id_name_etv);
        userNameTv = (TextView)findViewById(R.id.id_name_tv);
        userSexLl = (LinearLayout)findViewById(R.id.id_sex_ll);
        userSexTv = (TextView)findViewById(R.id.id_sex_tv);
        userAreaLl = (LinearLayout)findViewById(R.id.id_area_ll);
        userAreaEtv = (EditText) findViewById(R.id.id_area_etv);
        userAreaTv = (TextView)findViewById(R.id.id_area_tv);
        userIntroLl = (LinearLayout)findViewById(R.id.id_intro_ll);
        userIntroEtv = (EditText) findViewById(R.id.id_intro_etv);
        userIntroTv = (TextView)findViewById(R.id.id_intro_tv);
        userTasteLl = (LinearLayout)findViewById(R.id.id_taste_ll);
        userLikeLl = (LinearLayout)findViewById(R.id.id_like_ll);
        userLikeTv = (TextView)findViewById(R.id.id_like_tv);
        logoutLl = (LinearLayout)findViewById(R.id.id_logout_ll);
        saveUserInfoTv = (TextView)findViewById(R.id.save_user_info_tv);
        updateTv = (TextView)findViewById(R.id.save_user_info_tv);
        getUser(userId);
        if (localUserInfo.getUserInfo().getUid().equals(userId)) {
            userNameTv.setVisibility(View.GONE);
            userAreaTv.setVisibility(View.GONE);
            userIntroTv.setVisibility(View.GONE);

            userNameEtv.setVisibility(View.VISIBLE);
            userAreaEtv.setVisibility(View.VISIBLE);
            userIntroTv.setVisibility(View.VISIBLE);
            userTasteLl.setVisibility(View.VISIBLE);
            //选择用户性别
            userSexLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String[] items = new String[]{"男", "女"};//创建item
                    sexDialog = new AlertDialog.Builder(UserInfoActivity.this)
                            .setTitle("性别选择")
                            .setItems(items, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    if (which == 1) {//女
                                        userSexTv.setText("女");
                                    } else {
                                        userSexTv.setText("男");
                                    }
                                }
                            }).create();
                    sexDialog.show();
                }
            });
            //选择头像
            headIconRl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String[] items3 = new String[]{"相机", "相册"};//创建item
                    //选择图片反馈
                    alertDialog = new AlertDialog.Builder(UserInfoActivity.this)
                            .setTitle("选择方式")
                            .setIcon(R.mipmap.ic_launcher)
                            .setItems(items3, new DialogInterface.OnClickListener() {//添加列表
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    if (i == 1) {//相册
                                        openAlbum();
                                    } else {
                                        File outputImage = new File(Environment.getExternalStorageDirectory().getPath() + "/" + System.currentTimeMillis() + ".jpg");
                                        try {
                                            if (outputImage.exists()) {
                                                outputImage.delete();
                                            }
                                            outputImage.createNewFile();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        if (Build.VERSION.SDK_INT >= 23) {
                                        imageUri = FileProvider.getUriForFile(UserInfoActivity.this, "com.example.dell.recipebywx.fileprovider", outputImage);//通过FileProvider创建一个content类型的Uri
                                            openCamera();
                                        } else {
                                            imageUri = Uri.fromFile(outputImage);
                                            openCamera();
                                        }
                                    }
                                }
                            })
                            .create();
                    alertDialog.show();
                }
            });
            userTasteLl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UserInfoActivity.this,TasteSettingActivity.class);
                    startActivity(intent);
                }
            });
            updateTv.setVisibility(View.VISIBLE);
            updateTv.setText("保存个人资料");
            updateTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    putUserInfor();
//                    postLogout();
                }
            });
        }
        else {
            userNameEtv.setVisibility(View.GONE);
            userNameTv.setVisibility(View.VISIBLE);
            userAreaEtv.setVisibility(View.GONE);
            userAreaTv.setVisibility(View.VISIBLE);
            userIntroEtv.setVisibility(View.GONE);
            userIntroTv.setVisibility(View.VISIBLE);
            updateTv.setVisibility(View.GONE);
            userTasteLl.setVisibility(View.GONE);//不对其他用户显示口味偏好属性
        }
        logoutLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postLogout();
            }
        });
    }

    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case TAKE_PHOTO:
                if (resultCode == RESULT_OK) {
                    String photoPath;
                    //将拍摄的照片显示出来
                    Bitmap bitmap = null;
                    try {
                        bitmap = BitmapFactory.decodeStream(UserInfoActivity.this.getContentResolver().openInputStream(imageUri));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    headIconIv.setImageBitmap(bitmap);
//                    Glide.with(getApplicationContext()).load();
                    base64List = "data:image/jpeg;base64,"+Base64BitmapUtil.bitmapToBase64(bitmap);
                }
                break;
            case CHOOSE_PHOTO:
                if (resultCode == RESULT_OK) {
                    //判断手机系统版本号
                    if (Build.VERSION.SDK_INT >= 19) {
                        //4.4及以上系统使用这个方法处理图片
                        handleImageOnKitKat(data);
                    } else {
                        //4.4以下系统使用这个放出处理图片
                        handleImageBeforeKitKat(data);
                    }
                }
                break;
            default:
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void handleImageOnKitKat(Intent data) {
        String imagePath = null;
        Uri uri = data.getData();
        if (DocumentsContract.isDocumentUri(UserInfoActivity.this, uri)) {
            //如果是document类型的Uri,则通过document id处理
            String docId = DocumentsContract.getDocumentId(uri);
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String id = docId.split(":")[1];//解析出数字格式的id
                String selection = MediaStore.Images.Media._ID + "=" + id;
                imagePath = getImagePath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, selection);
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                Uri contentUri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(docId));
                imagePath = getImagePath(contentUri, null);
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            //如果是content类型的Uri，则使用普通方式处理
            imagePath = getImagePath(uri, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            //如果是file类型的Uri，直接获取图片路径即可
            imagePath = uri.getPath();
        }
        diaplayImage(imagePath);//根据图片路径显示图片
    }

    private void handleImageBeforeKitKat(Intent data) {
        Uri uri = data.getData();
        String imagePath = getImagePath(uri, null);
        diaplayImage(imagePath);
    }

    private String getImagePath(Uri uri, String selection) {
        String path = null;
        //通过Uri和selection来获取真实的图片路径
        Cursor cursor = this.getContentResolver().query(uri, null, selection, null, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
            }
            cursor.close();
        }
        return path;
    }

    private void diaplayImage(String imagePath) {
        if (imagePath != null) {
            final BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(imagePath, options);

            // 获取到这个图片的原始宽度和高度
            int picWidth = options.outWidth;
            int picHeight = options.outHeight;

            // 获取屏的宽度和高度
            WindowManager windowManager = UserInfoActivity.this.getWindowManager();
            Display display = windowManager.getDefaultDisplay();
            int screenWidth = display.getWidth();
            int screenHeight = display.getHeight();

            // isSampleSize是表示对图片的缩放程度，比如值为2图片的宽度和高度都变为以前的1/2
            options.inSampleSize = 1;
            // 根据屏的大小和图片大小计算出缩放比例
            if (picWidth > picHeight) {
                if (picWidth > screenWidth)
                    options.inSampleSize = picWidth / screenWidth;
            } else {
                if (picHeight > screenHeight)

                    options.inSampleSize = picHeight / screenHeight;
            }

            // 这次再真正地生成一个有像素的，经过缩放了的bitmap
            options.inJustDecodeBounds = false;
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath,options);
            headIconIv.setImageBitmap(bitmap);
            base64List = "data:image/jpeg;base64,"+ Base64BitmapUtil.bitmapToBase64(bitmap);
//            list.add(bitmap);
//            picAdapter.notifyDataSetChanged();
        } else {
            Toast.makeText(UserInfoActivity.this, "获取图片失败", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 从相册选择图片或者拍照
     */
    private void openAlbum() {
        Intent albumIntent = new Intent(Intent.ACTION_PICK);
        albumIntent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(albumIntent, CHOOSE_PHOTO);
    }

    private void openCamera() {
        //创建File对象，用于存储拍照后的照片
//        File outputImage = new File(getExternalCacheDir(),"output_image.jpg");
//        try {
//            if (outputImage.exists()){
//                outputImage.delete();
//            }
//            outputImage.createNewFile();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        if (Build.VERSION.SDK_INT >= 24){
//            imageUri = FileProvider.getUriForFile(UserInfoActivity.this,"com.example.dell.recipebywx.fileprovider",outputImage);
//        }else {
//            imageUri = Uri.fromFile(outputImage);
//        }
        //启动相机程序
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
        startActivityForResult(intent, TAKE_PHOTO);

    }

    /**
     * 用户信息更新(NOT DONE)
     */
    public void putUserInfor() {
        Map<String,Object> map = new HashMap();
        String name = userNameEtv.getText().toString();
        String sex = userSexTv.getText().toString();
        String location = userAreaEtv.getText().toString();
        String image = userId + String.valueOf(Math.random());;
        int sexI = 0;
        if (sex.equals("男")) {
            sexI = 1;
        } else {
            sexI = 2;
        }
        String intro = userIntroEtv.getText().toString();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        map.put("userName",name);
        map.put("sex",sexI);
        map.put("intro",intro);
        String pattern = "^http://[0-9]{2,3}.[0-9]{2,3}.[0-9]{2,3}:[0-9]{4}/image/$";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(localUserInfo.getUserInfo().getIconurl());
        map.put("image",matcher.replaceAll(localUserInfo.getUserInfo().getIconurl()));
        map.put("location",location);
        map.put("token",base64List);
        XutilsHttp.getInstance().put(ServiceAPI.UpdateUserInfor,null, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    UserInforModel res = new Gson().fromJson(result,UserInforModel.class);
                    if (res.isSuccess()) {
                        Toast.makeText(UserInfoActivity.this,res.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    /**
     *
     * 获取用户信息
     * @param id
     */
    public void getUser(String id) {
        Map<String, String> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        XutilsHttp.getInstance().get(ServiceAPI.GetUser, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    Gson gson = new Gson();
                    UserInforModel userInforModel = gson.fromJson(result,UserInforModel.class);
                    if (userInforModel.isSuccess()) {
                        userNameEtv.setText(userInforModel.getData().getUserName());
                        userNameTv.setText(userInforModel.getData().getUserName());
                        userAreaEtv.setText(userInforModel.getData().getLocation());
                        userAreaTv.setText(userInforModel.getData().getLocation());
                        userIntroEtv.setText(userInforModel.getData().getIntro());
                        userIntroTv.setText(userInforModel.getData().getIntro());
                        if (userInforModel.getData().getSex() == 1) {
                            userSexTv.setText("男");
                        } else {
                            userSexTv.setText("女");
                        }
                        Glide.with(getApplicationContext())
                                .load(userInforModel.getData().getImage())
                                .transform(new CenterCrop(getApplicationContext()),new GlideCircleTransform(getApplicationContext()))
                                .into(headIconIv);
//                        XutilsHttp.getInstance().bindCircularImage(headIconIv, userInforModel.getData().getImage());
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    /**
     * 退出登录
     */
    public void postLogout() {
        localUserInfo.clear();
        saveUserInfoTv.setVisibility(View.GONE);
        finish();
    }
}
