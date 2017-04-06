package com.yaya25001.dagger2copy;

import android.app.Application;

import com.yaya25001.dagger2copy.di.components.AppComponent;
import com.yaya25001.dagger2copy.di.components.DaggerAppComponent;
import com.yaya25001.dagger2copy.di.modules.AppModule;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
