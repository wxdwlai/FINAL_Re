package com.example.dell.recipebywx.service;

import android.graphics.Bitmap;
import android.widget.ImageView;

import java.io.File;
import java.util.Map;


import com.example.dell.recipebywx.home.CategoryActivity;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.common.util.DensityUtil;
import org.xutils.ex.HttpException;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.image.ImageOptions;
import org.xutils.x;
/**
 * Created by dell on 2019/1/5.
 */

public class XutilsHttp {
    private volatile static XutilsHttp instance;
    private volatile static ImageOptions common_image_options;
    private volatile static ImageOptions circular_image_options;
    private volatile static ImageOptions circular_image_options_id;

    /**
     * 单例模式
     *
     * @return
     */
    public static XutilsHttp getInstance() {
        if (instance == null) {
            synchronized (XutilsHttp.class) {
                if (instance == null) {
                    instance = new XutilsHttp();
                }
            }
        }
        return instance;
    }
    /**
     * 异步get请求
     *
     * @param url
     * @param maps
     * @param callback
     */
    public Callback.Cancelable get(String url, Map<String, String> maps, final XCallBack callback) {
        RequestParams params = new RequestParams(url);
//        params.addHeader("Authorization", MyConfig.getAuthorization());
        params.addHeader("content-type", "application/json");
//        params.addHeader("from","android");
//        params.addHeader("version", Utils.getAppCode());
        //        params.addHeader("deviceToken", MyConfig.getDivceToken());
        //        params.addHeader("IMEI",Util.getIMEI());
        //        params .addHeader("version",Util.getAppCode());
        //        Log.i("huang","deviceToken=="+MyConfig.getDivceToken());
        if (maps != null && !maps.isEmpty()) {
            if (maps.containsKey("x-auth-token")){
                params.addHeader("x-auth-token",maps.get("x-auth-token"));
            }
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                params.addQueryStringParameter(entry.getKey(), entry.getValue());
            }
        }
        Callback.Cancelable cancelable = x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                if (callback != null) {
                    callback.onResponse(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                if (ex instanceof HttpException) {
                    HttpException exception = (HttpException) ex;
                    if (callback != null) {
//                        callback.onError(JsonTo.jsonToFailure(exception.getResult()));
                        callback.onError("数据解析异常,请稍候再试！");

                    }
                } else {
                    if (callback != null) {
                        if (ex.getMessage().contains("Json") || ex.getMessage().contains("JSON")) {
                            callback.onError("数据解析异常,请稍候再试！");
                        } else {
//                            if (NetworkHelper.isNetworkConnected(DemoApplication.getInstance())) {
//                                callback.onError("未知错误，请稍后重试！");
//                            } else {
                            callback.onError("访问失败，请稍后重试！");
//                            }
                        }
                    }
                }
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
        return cancelable;

    }

    /**
     * 异步post请求
     *
     * @param url
     * @param maps
     * @param callback
     */
    public Callback.Cancelable post(String url,Map<String, String> map, Map<String, Object> maps, final XCallBack callback) {
        RequestParams params = new RequestParams(url);
        params.addHeader("Content-Type", "application/json");
//        params.addHeader("Authorization", MyConfig.getAuthorization());
//        params.addHeader("Accept", "application/json");
//        params.addHeader("from","android");
//        params.addHeader("version", Utils.getAppCode());
        //        params.addHeader("appfrom", "medsci_app");
        //        params.addHeader("deviceToken", MyConfig.getDivceToken());
        //        params.addHeader("IMEI",Util.getIMEI());
        //        params .addHeader("version",Util.getAppCode());
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {

                params.addQueryStringParameter(entry.getKey(), entry.getValue());
            }
        }
        if (maps != null && !maps.isEmpty()) {
            if (maps.containsKey("x-auth-token")){
                params.addHeader("x-auth-token",maps.get("x-auth-token").toString());
            }
            Gson gson = new Gson();
            String jsonStr = gson.toJson(maps);
            params.setAsJsonContent(true);
            params.setBodyContent(jsonStr);
//            for (Map.Entry<String, String> entry : maps.entrySet()) {
//                params.addBodyParameter(entry.getKey(), entry.getValue());
//            }
        }

        Callback.Cancelable cancelable = x.http().post(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                if (callback != null) {
                    callback.onResponse(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                if (ex instanceof HttpException) {
                    HttpException exception = (HttpException) ex;
                    if (callback != null) {
                        callback.onError("数据解析异常,请稍候再试！");
                    }
                } else {
                    if (callback != null) {
                        if (ex.getMessage().contains("Json") || ex.getMessage().contains("JSON")) {
                            callback.onError("数据解析异常,请稍候再试！");
                        } else {
                            callback.onError("访问失败，请稍后重试！");
                        }
                    }
                }
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
        return cancelable;
    }

    /**
     * 异步post请求
     *
     * @param url
     * @param jsonObject
     * @param callback
     */
    public Callback.Cancelable postJson(String url, String jsonObject, final XCallBack callback) {
        RequestParams params = new RequestParams(url);
//        params.addHeader("Authorization", MyConfig.getAuthorization());
//        params.addHeader("Accept", "application/json");
//        params.addHeader("Content-Type", "application/json");
//        params.addHeader("from","android");
//        params.addHeader("version", Utils.getAppCode());
        params.setBodyContent(jsonObject);
        params.setAsJsonContent(true);
        Callback.Cancelable cancelable = x.http().post(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                if (callback != null) {
                    callback.onResponse(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
//                if (ex instanceof HttpException) {
//                    HttpException exception = (HttpException) ex;
//                    if (callback != null) {
//                        callback.onError(JsonTo.jsonToFailure(exception.getResult()));
//                    }
//                } else {
//                    if (callback != null) {
//                        Log.i("huang", "exception.getResult()==" + ex.getMessage());
//                        if (ex.getMessage().contains("Json") || ex.getMessage().contains("JSON")) {
//                            callback.onError("数据解析异常,请稍候再试！");
//                        } else {
//                            if (NetworkHelper.isNetworkConnected(DemoApplication.getInstance())) {
//                                callback.onError("未知错误，请稍后重试！");
//                            } else {
//                                callback.onError("访问失败，请稍后重试！");
//                            }
//                        }
//                    }
//                }
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
        return cancelable;
    }

    public Callback.Cancelable put(String url,Map<String, String> map,Map<String, Object> maps, final XCallBack callback) {
        RequestParams params = new RequestParams(url);
        params.addHeader("Content-Type", "application/json");
//        params.addHeader("Authorization", MyConfig.getAuthorization());
//        params.addHeader("Accept", "application/json");
//        params.addHeader("from","android");
//        params.addHeader("version", Utils.getAppCode());
        //        params.addHeader("appfrom", "medsci_app");
        //        params.addHeader("deviceToken", MyConfig.getDivceToken());
        //        params.addHeader("IMEI",Util.getIMEI());
        //        params .addHeader("version",Util.getAppCode());
        if (map != null && !map.isEmpty()) {
            if (map.containsKey("x-auth-token")){
                params.addHeader("x-auth-token",map.get("x-auth-token").toString());
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {

                params.addQueryStringParameter(entry.getKey(), entry.getValue());
            }
        }
        if (maps != null && !maps.isEmpty()) {
            if (maps.containsKey("x-auth-token")){
                params.addHeader("x-auth-token",maps.get("x-auth-token").toString());
            }
            Gson gson = new Gson();
            String jsonStr = gson.toJson(maps);
            params.setAsJsonContent(true);
            params.setBodyContent(jsonStr);
//            for (Map.Entry<String, String> entry : maps.entrySet()) {
//                params.addBodyParameter(entry.getKey(), entry.getValue());
//            }
        }
        Callback.Cancelable cancelable = x.http().request(HttpMethod.PUT,params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                if (callback != null) {
                    callback.onResponse(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                if (ex instanceof HttpException) {
                    HttpException exception = (HttpException) ex;
                    if (callback != null) {
                        callback.onError("数据解析异常,请稍候再试！");
                    }
                } else {
                    if (callback != null) {
                        if (ex.getMessage().contains("Json") || ex.getMessage().contains("JSON")) {
                            callback.onError("数据解析异常,请稍候再试！");
                        } else {
                            callback.onError("访问失败，请稍后重试！");
                        }
                    }
                }
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
        return cancelable;
    }

    /**
     * 异步delete请求
     *
     * @param url
     * @param maps
     * @param callback
     */
    public Callback.Cancelable delete(String url,Map<String, String> map, Map<String, Object> maps, final XCallBack callback) {
        RequestParams params = new RequestParams(url);
        params.addHeader("Content-Type", "application/json");
//        params.addHeader("Authorization", MyConfig.getAuthorization());
//        params.addHeader("Accept", "application/json");
//        params.addHeader("from","android");
//        params.addHeader("version", Utils.getAppCode());
        //        params.addHeader("appfrom", "medsci_app");
        //        params.addHeader("deviceToken", MyConfig.getDivceToken());
        //        params.addHeader("IMEI",Util.getIMEI());
        //        params .addHeader("version",Util.getAppCode());
        if (map != null && !map.isEmpty()) {
            if (map.containsKey("x-auth-token")){
                params.addHeader("x-auth-token",map.get("x-auth-token").toString());
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {

                params.addQueryStringParameter(entry.getKey(), entry.getValue());
            }
        }
        if (maps != null && !maps.isEmpty()) {
            if (maps.containsKey("x-auth-token")){
                params.addHeader("x-auth-token",maps.get("x-auth-token").toString());
            }
            Gson gson = new Gson();
            String jsonStr = gson.toJson(maps);
            params.setAsJsonContent(true);
            params.setBodyContent(jsonStr);
//            for (Map.Entry<String, String> entry : maps.entrySet()) {
//                params.addBodyParameter(entry.getKey(), entry.getValue());
//            }
        }
        Callback.Cancelable cancelable = x.http().request(HttpMethod.DELETE,params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                if (callback != null) {
                    callback.onResponse(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                if (ex instanceof HttpException) {
                    HttpException exception = (HttpException) ex;
                    if (callback != null) {
                        callback.onError("数据解析异常,请稍候再试！");
                    }
                } else {
                    if (callback != null) {
                        if (ex.getMessage().contains("Json") || ex.getMessage().contains("JSON")) {
                            callback.onError("数据解析异常,请稍候再试！");
                        } else {
                            callback.onError("访问失败，请稍后重试！");
                        }
                    }
                }
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
        return cancelable;
    }

    /**
     * 正常图片显示
     *
     * @param iv
     * @param url
     */
    public void bindCommonImage(ImageView iv, String url) {
//        if (common_image_options == null) {
//            common_image_options = new ImageOptions.Builder().setConfig(Bitmap.Config.RGB_565).setImageScaleType
//                    (ImageView.ScaleType.FIT_XY).setLoadingDrawableId(R
//                    .mipmap.wfxs).setFailureDrawableId(R.mipmap.wfxs).setUseMemCache(false).build();
//        }
        x.image().bind(iv, url, common_image_options);
    }

    /**
     * 正常图片显示,无失败图
     *
     * @param iv
     * @param url
     */
    public void bindCommonImage2(ImageView iv, String url) {
        if (common_image_options == null) {
            common_image_options = new ImageOptions.Builder().setConfig(Bitmap.Config.RGB_565).setImageScaleType
                    (ImageView.ScaleType.FIT_XY).setUseMemCache(false).build();
        }
        x.image().bind(iv, url, common_image_options);
    }


    /**
     * 圆形图片显示
     *
     * @param iv
     * @param url
     */
    public void bindCircularImage(ImageView iv, String url) {
//        if (circular_image_options == null) {
//            circular_image_options = new ImageOptions.Builder().setConfig(Bitmap.Config.RGB_565).setLoadingDrawableId
//                    (R.mipmap.user_pp).setFailureDrawableId(R.mipmap.user_pp).setCircular(true).setImageScaleType
//                    (ImageView.ScaleType.FIT_XY).setUseMemCache(false).build();
//        }
        ImageOptions options = new ImageOptions.Builder()
                .setCircular(true)
                .build();
        x.image().bind(iv, url,options);
    }

    public void bindCircularImage2(ImageView iv, String url) {
//        if (circular_image_options == null) {
//            circular_image_options = new ImageOptions.Builder().setConfig(Bitmap.Config.RGB_565).setLoadingDrawableId
//                    (R.mipmap.zy).setFailureDrawableId(R.mipmap.zy).setCircular(true).setImageScaleType
//                    (ImageView.ScaleType.FIT_XY).setUseMemCache(false).build();
//        }
        x.image().bind(iv, url, circular_image_options);
    }
    //    设置圆角
    public void bindCircularImage3(ImageView iv, String url,int radius) {
        ImageOptions options = new ImageOptions.Builder()
                .setCrop(true)
                .setRadius(radius)
                .build();
        x.image().bind(iv, url, options);
    }

    //    public void bindCircularImage(ImageView iv, String url, Callback.CommonCallback<Drawable> callback) {
    //        if (circular_image_options == null) {
    //            circular_image_options = new ImageOptions.Builder().setConfig(Bitmap.Config.RGB_565)
    // .setLoadingDrawableId
    //                    (R.mipmap.user_pp).setFailureDrawableId(R.mipmap.user_pp).setCircular(true).build();
    //        }
    //        x.image().bind(iv, url, circular_image_options, callback);
    //    }

    /**
     * 圆形图片显示,设置默认的图片
     *
     * @param iv
     * @param url
     */
    public void bindCircularImage(ImageView iv, String url, int drawable_id) {
        if (circular_image_options_id == null) {
            circular_image_options_id = new ImageOptions.Builder().setConfig(Bitmap.Config.RGB_565)
                    .setLoadingDrawableId(drawable_id).setFailureDrawableId(drawable_id).setCircular(true).build();
        }
        x.image().bind(iv, url, circular_image_options_id);
    }


    /**
     * 文件上传
     *
     * @param url
     * @param maps
     * @param file
     * @param callback
     */
    public Callback.Cancelable upLoadFile(String url, Map<String, String> maps, Map<String, File> file, final
    XCallBack callback) {
        RequestParams params = new RequestParams(url);
//        params.addHeader("Authorization", MyConfig.getAuthorization());
//        params.addHeader("Accept", "application/json");
//        params.addHeader("from","android");
//        params.addHeader("version", Utils.getAppCode());
        //        params.addHeader("appfrom", "medsci_app");
        //        params.addHeader("deviceToken", MyConfig.getDivceToken());
        //        params.addHeader("IMEI",Util.getIMEI());
        //        params .addHeader("version",Util.getAppCode());
        if (maps != null && !maps.isEmpty()) {
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                params.addBodyParameter(entry.getKey(), entry.getValue());
            }
        }
        if (file != null) {
            for (Map.Entry<String, File> entry : file.entrySet()) {
                params.addBodyParameter(entry.getKey(), entry.getValue().getAbsoluteFile());
            }
        }
        // 有上传文件时使用multipart表单, 否则上传原始文件流.
        params.setMultipart(true);
        Callback.Cancelable cancelable = x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (callback != null) {
                    callback.onResponse(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
//                if (ex instanceof HttpException) {
//                    HttpException exception = (HttpException) ex;
//                    if (callback != null) {
//                        callback.onError(JsonTo.jsonToFailure(exception.getResult()));
//                    }
//                } else {
//                    if (callback != null) {
//                        if (ex.getMessage().contains("Json") || ex.getMessage().contains("JSON")) {
//                            callback.onError("数据解析异常,请稍候再试！");
//                        } else {
//                            if (NetworkHelper.isNetworkConnected(DemoApplication.getInstance())) {
//                                callback.onError("未知错误，请稍后重试！");
//                            } else {
//                                callback.onError("访问失败，请稍后重试！");
//                            }
//                        }
//                    }
//                }
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

        return cancelable;

    }


    /**
     * 文件下载
     *
     * @param url
     * @param maps
     * @param path
     * @param callback
     */
    public Callback.Cancelable downLoadFile(String url, Map<String, String> maps, String path, final
    XDownLoadCallBack
            callback) {

        RequestParams params = new RequestParams(url);
        //        params.addHeader("Authorization", MyConfig.getAuthorization());
        //        params.addHeader("Accept", "application/json");
        //        params.addHeader("appfrom", "medsci_app");
        //        params.addHeader("deviceToken", MyConfig.getDivceToken());
        //        params.addHeader("IMEI",Util.getIMEI());
        //        params .addHeader("version",Util.getAppCode());
        if (maps != null && !maps.isEmpty()) {
            for (Map.Entry<String, String> entry : maps.entrySet()) {
                params.addBodyParameter(entry.getKey(), entry.getValue());
            }
        }
        params.setAutoRename(true);// 断点续传
        params.setSaveFilePath(path);
        Callback.Cancelable cancelable = x.http().get(params, new Callback.ProgressCallback<File>() {
            @Override
            public void onSuccess(final File result) {
                if (callback != null) {
                    callback.onResponse(result);
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

                if (ex instanceof HttpException) {
                    HttpException exception = (HttpException) ex;
                    if (callback != null) {
//                        callback.onError(JsonTo.jsonToFailure(exception.getResult()));
                        callback.onError("数据解析异常,请稍候再试！");

                    }
                } else {
                    if (callback != null) {
                        if (ex.getMessage().contains("Json") || ex.getMessage().contains("JSON")) {
                            callback.onError("数据解析异常,请稍候再试！");
                        } else {
//                            if (NetworkHelper.isNetworkConnected(DemoApplication.getInstance())) {
//                                callback.onError("未知错误，请稍后重试！");
//                            } else {
                            callback.onError("访问失败，请稍后重试！");
//                            }
                        }
                    }
                }
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {
                callback.onCancelled();
            }

            @Override
            public void onFinished() {

            }

            @Override
            public void onWaiting() {

            }

            @Override
            public void onStarted() {

            }

            @Override
            public void onLoading(final long total, final long current, final boolean isDownloading) {
                if (callback != null) {
                    callback.onLoading(total, current, isDownloading);
                }
            }
        });
        return cancelable;
    }

    public interface XCallBack {
        void onResponse(String result);

        void onError(String result);
    }


    public interface XDownLoadCallBack {
        void onResponse(File result);

        void onLoading(long total, long current, boolean isDownloading);

        void onError(String result);

        void onCancelled();
    }
}
