package com.example.dell.recipebywx.my;

import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.annotation.ColorInt;
import android.support.annotation.RequiresApi;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.recipebywx.MainActivity;
import com.example.dell.recipebywx.R;
import com.example.dell.recipebywx.model.AddRecipeResponseModel;
import com.example.dell.recipebywx.model.RecipeDetailModel;
import com.example.dell.recipebywx.model.TasteModel;
import com.example.dell.recipebywx.model.UserInforModel;
import com.example.dell.recipebywx.service.ServiceAPI;
import com.example.dell.recipebywx.service.XutilsHttp;
import com.example.dell.recipebywx.utils.Base64BitmapUtil;
import com.example.dell.recipebywx.utils.DensityUtils;
import com.example.dell.recipebywx.utils.Helper;
import com.example.dell.recipebywx.utils.Local;
import com.example.dell.recipebywx.utils.LocalUserInfo;
import com.example.dell.recipebywx.utils.SpaceItemDecoration;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import static com.mob.MobSDK.getContext;

public class PostRecipeActivity extends AppCompatActivity {

    private LocalUserInfo localUserInfo;
    private TextView back;
    private LinearLayout addPicLl;
    private LinearLayout noPicLl;
    private ImageView picIv;
    private AlertDialog alterDialog;
    private EditText addNameEtv;
    private EditText addIntroEtv;

    //添加用料
    private int countMateria = 1;
    private LinearLayout materiaLl;
    private List<MateriaLinearLayout> materiaLinearLayouts = new ArrayList<>();
    private MateriaLinearLayout materiaItem;
    private RecyclerView materiaRcy;
    private MatreiaAdapter matreiaAdapter;
    private List<Materia> materiaList = new ArrayList<>();
    private TextView addMateriaTv;
    //添加做法步骤
    private int countSteps = 1;
    private LinearLayout stepLl;
    private TextView addStepTv;
    private List<RecipeDetailModel.DataBean.StepsListBean> stepList;

    private LinearLayout addTypeLl;
    private LinearLayout addTagLl;

    private LinearLayout sendLl;

    private AlertDialog alertDialog;
    private Uri imageUri;
    public static final int TAKE_PHOTO = 1;
    public static final int CHOOSE_PHOTO = 2;
    private String base64Head;
    private Bitmap headBit;
    private String base64List;
    private List<String> baseList = new ArrayList<String>(Collections.nCopies(31, ""));
    private List<Bitmap> picList;
    private String materias = "";

    private int index;

    private static final int ADD_TYPE = 3;
    private ArrayList<String> typeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_recipe);
        localUserInfo = new LocalUserInfo(getApplicationContext());
        picList = new ArrayList<>(Collections.nCopies(31,BitmapFactory.decodeResource(getResources(),R.drawable.empty_icon)));
        initView();
        initMateriaRcy();
        this.changeStatusBarTextColor(true);
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
                        bitmap = BitmapFactory.decodeStream(getApplicationContext().getContentResolver().openInputStream(imageUri));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    base64List = "data:image/jpeg;base64,"+Base64BitmapUtil.bitmapToBase64(bitmap);
                    if (baseList.get(index).length() != 0) {
                        baseList.set(index,base64List);
                        picList.set(index,bitmap);
                    }
                    else {
                        picList.add(index,bitmap);
                        baseList.add(index,base64List);
                    }
                    if (picList.size() != 0) {
                        for (int i=0;i<countSteps+1;i++) {
                            if (0 == i) {
                                noPicLl.setVisibility(View.GONE);
                                picIv.setVisibility(View.VISIBLE);
                                picIv.setImageBitmap(picList.get(i));
                            }
                            else {
                                View view = stepLl.getChildAt(i-1);
                                LinearLayout emptyLl = (LinearLayout)view.findViewById(R.id.empty_step_ll);
                                ImageView stepIv = (ImageView)view.findViewById(R.id.step_iv);
                                if (baseList.get(i).length() != 0) {
                                    emptyLl.setVisibility(View.GONE);
                                    stepIv.setVisibility(View.VISIBLE);
                                    stepIv.setImageBitmap(picList.get(i));
                                }

                            }
                        }
                    }
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
            case ADD_TYPE:
                if (resultCode == RESULT_OK) {
//                    types = new String[20];
//                    types = data.getStringExtra("types");
                    typeList = data.getStringArrayListExtra("types");
                }
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void handleImageOnKitKat(Intent data) {
        String imagePath = null;
        Uri uri = data.getData();
        if (DocumentsContract.isDocumentUri(PostRecipeActivity.this, uri)) {
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
        diaplayImage(imagePath,index);//根据图片路径显示图片
    }

    private void handleImageBeforeKitKat(Intent data) {
        Uri uri = data.getData();
        String imagePath = getImagePath(uri, null);
        diaplayImage(imagePath,index);
    }
    private String getImagePath(Uri uri, String selection) {
        String path = null;
        //通过Uri和selection来获取真实的图片路径
        Cursor cursor = PostRecipeActivity.this.getContentResolver().query(uri, null, selection, null, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                path = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));
            }
            cursor.close();
        }
        return path;
    }

    private void diaplayImage(String imagePath,int index) {
        if (imagePath != null) {
            final BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(imagePath, options);

            // 获取到这个图片的原始宽度和高度
            int picWidth = options.outWidth;
            int picHeight = options.outHeight;

            // 获取屏的宽度和高度
            WindowManager windowManager = PostRecipeActivity.this.getWindowManager();
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
            base64List = "data:image/jpeg;base64,"+Base64BitmapUtil.bitmapToBase64(bitmap);
            if (baseList.get(index).length() != 0) {
                baseList.set(index,base64List);
                picList.set(index,bitmap);
            }
            else {
                picList.set(index,bitmap);
                baseList.set(index,base64List);
            }
            if (baseList.size() != 0) {
                for (int i=0;i<countSteps+1;i++) {
                    if (0 == i) {
                        if (baseList.get(i).length() != 0) {
                            noPicLl.setVisibility(View.GONE);
                            picIv.setVisibility(View.VISIBLE);
                            picIv.setImageBitmap(picList.get(i));
                        }
                        else {
                            noPicLl.setVisibility(View.VISIBLE);
                            picIv.setVisibility(View.GONE);
                        }
                    }
                    else {
                        View view = stepLl.getChildAt(i-1);
                        LinearLayout emptyLl = (LinearLayout)view.findViewById(R.id.empty_step_ll);
                        ImageView stepIv = (ImageView)view.findViewById(R.id.step_iv);
                        if (baseList.get(i).length() != 0) {
                            emptyLl.setVisibility(View.GONE);
                            stepIv.setVisibility(View.VISIBLE);
                            stepIv.setImageBitmap(picList.get(i));
                        }
                        else {
                            emptyLl.setVisibility(View.VISIBLE);
                            stepIv.setVisibility(View.GONE);
                        }

                    }
                }
            }
        } else {
            Toast.makeText(PostRecipeActivity.this, "图片加载失败", Toast.LENGTH_SHORT).show();
        }
    }
    private void changeStatusBarTextColor(boolean isBlack) {
        int type = Helper.statusBarLightMode(this);
        Helper.statusBarLightMode(this,type);
    }

    void initView() {
        back = (TextView) findViewById(R.id.toolbar_left_tv);
        addPicLl = (LinearLayout)findViewById(R.id.add_pic_ll);
        noPicLl = (LinearLayout)findViewById(R.id.no_pic_ll);
        picIv = (ImageView)findViewById(R.id.recipe_pic_iv);
        addNameEtv = (EditText)findViewById(R.id.recipe_name_etv);
        addIntroEtv = (EditText)findViewById(R.id.intro_etv);
        materiaRcy = (RecyclerView)findViewById(R.id.materia_rcy);
        addMateriaTv = (TextView)findViewById(R.id.add_matria_tv);
        stepLl = (LinearLayout)findViewById(R.id.step_ll);
        addStepTv = (TextView)findViewById(R.id.add_step_tv);
        addTypeLl = (LinearLayout)findViewById(R.id.add_types_ll);
        addTagLl = (LinearLayout)findViewById(R.id.add_tags_ll);

        materiaLl = (LinearLayout)findViewById(R.id.materia_ll);
        sendLl = (LinearLayout)findViewById(R.id.send_ll);
        back.setTextColor(Color.parseColor("#F9EA5A32"));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //添加主图
        addPicLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPic(0);
            }
        });
        View.inflate(this,R.layout.layout_materia_item,materiaLl);
        View.inflate(this,R.layout.layout_recipe_add_step,stepLl);
        View view = stepLl.getChildAt(countSteps-1);
        final TextView stepTv = (TextView)view.findViewById(R.id.step_tv);
        stepTv.setText("步骤1");
        LinearLayout emptyLl = (LinearLayout)view.findViewById(R.id.empty_step_ll);
        emptyLl.setVisibility(View.VISIBLE);
        addStepPic(view,1);
        //增加一行食材
        addMateriaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = addMateria(v);
            }
        });
        //增加一个菜谱步骤
        addStepTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStep(v);
                View view = stepLl.getChildAt(countSteps-1);
                LinearLayout step = view.findViewById(R.id.empty_step_ll);
                TextView numTv = view.findViewById(R.id.step_tv);
                EditText stepEtv = view.findViewById(R.id.step_detail_tv);
                ImageView stepIv = view.findViewById(R.id.step_iv);
                numTv.setText("步骤"+String.valueOf(countSteps));
                step.setVisibility(View.VISIBLE);
                addStepPic(view,countSteps);
                if (baseList.size() == countSteps+1 && baseList.get(countSteps).length() != 0)  {
                    step.setVisibility(View.GONE);
                    stepIv.setVisibility(View.VISIBLE);
                    stepIv.setImageBitmap(picList.get(countSteps));
                }
            }
        });

        addTypeLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostRecipeActivity.this,RecipeTypeSettingActivity.class);
                startActivityForResult(intent,ADD_TYPE);
            }
        });

        //发布菜谱
        sendLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //菜谱基本信息，保存至recipe表格中
                String image;
                String name;
                String intro;
                String materias = "";
                image = baseList.get(0);
                name = addNameEtv.getText().toString();
                intro = addIntroEtv.getText().toString();
                for (int i=0;i<countMateria;i++) {
                    View view = materiaLl.getChildAt(i);
                    EditText materiaEtv = view.findViewById(R.id.item_materia_tv);
                    EditText materiaNumEtv = view.findViewById(R.id.item_materia_num_tv);
                    String m = materiaEtv.getText().toString();
                    String num = materiaNumEtv.getText().toString();
                    if (m.length()==0) {
                        continue;
                    }
                    materias += m+" "+num+"\n";
                }
                System.out.println("image:"+image
                        +"\nname:"+name
                        +"\nintro:"+intro
                        +"\nmaterias:"+materias);
                if (name.length() != 0 && image.length() !=0) {
                    putRecipe(name,intro,materias,image);
                }
                else if (name == null || name.length() == 0) {
                    Toast.makeText(PostRecipeActivity.this,"菜谱名不能为空",Toast.LENGTH_SHORT);
                }
                else if (image == null || image.length() == 0) {
                    Toast.makeText(PostRecipeActivity.this,"菜谱主图不能为空",Toast.LENGTH_SHORT);
                }
                //菜谱步骤，保存至步骤表中
                stepList = new ArrayList<>();
                for (int i=0;i<countSteps;i++) {
                    View view = stepLl.getChildAt(i);
                    LinearLayout stepLl = view.findViewById(R.id.empty_step_ll);
                    EditText stepEtv = view.findViewById(R.id.step_detail_tv);
                    RecipeDetailModel.DataBean.StepsListBean step = new RecipeDetailModel.DataBean.StepsListBean();
                    String stepDetail = stepEtv.getText().toString();
                    step.setStepId(i+1);
                    step.setStepImgs(baseList.get(i+1));
                    step.setSteps(stepDetail);
                    stepList.add(step);
                }
            }
        });



        addTagLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostRecipeActivity.this,TasteSettingActivity.class);
                startActivity(intent);
            }
        });
    }

    View addMateria(View v) {
        if (v == null) {
            return null;
        }
        else {
            countMateria++;
            View view = View.inflate(this,R.layout.layout_materia_item,materiaLl);
            return view;
        }
    }

    View addStep(View v) {
        if (null == v) return null;
        else {
            countSteps++;
            View view = View.inflate(this,R.layout.layout_recipe_add_step,stepLl);
            return view;
        }
    }

    //添加图片
    void addPic(final int index) {
        final String[] items3 = new String[]{"相机", "相册"};//创建item
        //选择图片反馈
        alertDialog = new AlertDialog.Builder(PostRecipeActivity.this)
                .setTitle("选择方式")
                .setIcon(R.mipmap.ic_launcher)
                .setItems(items3, new DialogInterface.OnClickListener() {//添加列表
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 1) {//相册
                            openAlbum(index);
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
                                imageUri = FileProvider.getUriForFile(PostRecipeActivity.this, "com.example.dell.recipebywx.fileprovider", outputImage);//通过FileProvider创建一个content类型的Uri
                                openCamera(index);
                            } else {
                                imageUri = Uri.fromFile(outputImage);
                                openCamera(index);
                            }
                        }
                    }
                })
                .create();
        alertDialog.show();
    }

    //添加步骤图片
    void addStepPic(View v,final int i) {
        LinearLayout stepLl = (LinearLayout)v.findViewById(R.id.step_ll);
        stepLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPic(i);
            }
        });
    }

    //食材适配器
    void initMateriaRcy() {
        materiaRcy = (RecyclerView)findViewById(R.id.materia_rcy);
        Materia materia = new Materia();
        materiaList.add(materia);
        matreiaAdapter = new MatreiaAdapter(getApplicationContext(),materiaList);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
//        CustomLinearLayoutManager manager = new CustomLinearLayoutManager(getApplicationContext());
//        manager.setScrollEnabled(false);
        manager.setSmoothScrollbarEnabled(true);
        manager.setAutoMeasureEnabled(true);
        materiaRcy.setLayoutManager(manager);
        materiaRcy.setAdapter(matreiaAdapter);
        materiaRcy.setHasFixedSize(true);
        materiaRcy.setNestedScrollingEnabled(false);
        materiaRcy.addItemDecoration(new SpaceItemDecoration(0, DensityUtils.dp2px(getApplicationContext(),10)));
    }

    public class CustomLinearLayoutManager extends LinearLayoutManager {
        private boolean isScrollEnabled = true;

        public CustomLinearLayoutManager(Context context) {
            super(context);
        }

        public void setScrollEnabled(boolean flag) {
            this.isScrollEnabled = flag;
        }

        @Override
        public boolean canScrollVertically() {
            //Similarly you can customize "canScrollHorizontally()" for managing horizontal scroll
            return isScrollEnabled && super.canScrollVertically();
        }
    }










    /**
     * 从相册选择图片或者拍照
     */
    private void openAlbum(int index) {
        this.index = index;
        Intent albumIntent = new Intent(Intent.ACTION_PICK);
        albumIntent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(albumIntent, CHOOSE_PHOTO);
    }

    private void openCamera(int index) {
        this.index = index;
        //启动相机程序
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
        startActivityForResult(intent, TAKE_PHOTO);

    }
    public class MatreiaAdapter extends RecyclerView.Adapter<MatreiaAdapter.Holder> {

        private Context context;
        private List<Materia> list;

        public MatreiaAdapter(Context context, List<Materia> list) {
            this.context = context;
            this.list = list;
        }
        @Override
        public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            Holder holder = null;
            View view = LayoutInflater.from(context).inflate(R.layout.layout_materia_item,parent,false);
            holder = new Holder(view);
            return holder;
        }

        //绑定数据
        @Override
        public void onBindViewHolder(Holder holder, int position) {
            holder.materiaEtv.setText(list.get(position).materia);
            holder.materiaNumEtv.setText(list.get(position).getNum());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {

            private EditText materiaEtv;
            private EditText materiaNumEtv;
            private ImageView itemDeleteIv;
            private int position;//位置标记
            public Holder(View itemView) {
                super(itemView);
                materiaEtv = (EditText)itemView.findViewById(R.id.item_materia_tv);
                materiaNumEtv = (EditText)itemView.findViewById(R.id.item_materia_num_tv);
                itemDeleteIv = (ImageView)itemView.findViewById(R.id.item_materia_delete_iv);
            }
        }
    }

    /**
     * 自定义数据类型
     */
    public class Materia {
        private String materia;
        private String num;

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getMateria() {
            return materia;
        }

        public void setMateria(String materia) {
            this.materia = materia;
        }
    }


    //网络访问

    /**
     * 上传菜谱的基本信息(3.26 done)
     */
    void putRecipe(String title,String intro,String ings,String image) {
        Map<String,Object> map = new HashMap<>();
        map.put("uid",localUserInfo.getUserInfo().getUid());
        map.put("title",title);
        map.put("intro",intro);
        map.put("ings",ings);
        map.put("image",image);
        XutilsHttp.getInstance().put(ServiceAPI.putRecipe, null, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result != null) {
                    AddRecipeResponseModel model = new Gson().fromJson(result,AddRecipeResponseModel.class);
                    if (model.isSuccess()) {
                        Toast.makeText(PostRecipeActivity.this,"菜谱上传成功",Toast.LENGTH_SHORT).show();
                        putSteps(model.getData().getReid());
                        putTypes(model.getData().getReid());
                        finish();
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    /**
     * 上传菜谱的步骤
     */
    void putSteps(int reid) {
        final Map<String, Object> map = new HashMap<>();
        Map m = new HashMap();
        m.put("reid",String.valueOf(reid));
        map.put("stepsList",stepList);
        XutilsHttp.getInstance().put(ServiceAPI.putSteps, m, map, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    UserInforModel model = new Gson().fromJson(result,UserInforModel.class);
                    if (model.isSuccess()) {
                        Toast.makeText(PostRecipeActivity.this,"菜谱步骤上传成功",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }

    void putTypes(final int reid) {
        final Map<String, String> map = new HashMap<>();
        map.put("reid",String.valueOf(reid));
        Map<String, Object> maps = new HashMap<>();
//        for (int i=0;types[i] != null; i++) {
//            System.out.println(types[i]);
//            typeList.add(i,types[i]);
//        }
        maps.put("list",typeList);
        XutilsHttp.getInstance().put(ServiceAPI.putTypes, map, maps, new XutilsHttp.XCallBack() {
            @Override
            public void onResponse(String result) {
                if (result.length() != 0) {
                    TasteModel model = new Gson().fromJson(result,TasteModel.class);
                    if (model.isSuccess()) {
                        Toast.makeText(PostRecipeActivity.this,"标签保存成功",Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onError(String result) {

            }
        });
    }
}
