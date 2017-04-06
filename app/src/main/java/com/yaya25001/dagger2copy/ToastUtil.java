package com.yaya25001.dagger2copy;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public class ToastUtil {

    private Context context;

    public ToastUtil(Context context) {
        this.context = context;
    }

    public void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

}
