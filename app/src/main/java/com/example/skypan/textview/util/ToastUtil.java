package com.example.skypan.textview.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/9/25.
 */

public class ToastUtil {

    public static Toast mToast;
    public static void showMsg(Context context,String msg){
        if(mToast == null){
            mToast = Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }else{
            mToast.setText(msg);
        }
        mToast.show();
    }
}
