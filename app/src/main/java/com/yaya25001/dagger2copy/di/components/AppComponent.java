package com.yaya25001.dagger2copy.di.components;

import android.content.Context;

import com.yaya25001.dagger2copy.ToastUtil;
import com.yaya25001.dagger2copy.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Context getContext();

    ToastUtil getToastUtil();

}
