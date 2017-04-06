package com.yaya25001.dagger2copy.di.modules;

import android.content.Context;

import com.yaya25001.dagger2copy.ToastUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
@Module
public class AppModule {

    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    //单例..
    @Provides @Singleton
    public Context provideContext(Context context){
        return context;
    }

    @Provides @Singleton
    public ToastUtil provideToastUtil(){
        return  new ToastUtil(context);
    }


}
