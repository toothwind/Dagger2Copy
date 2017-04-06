package com.yaya25001.dagger2copy.di.modules;

import android.app.Activity;

import com.yaya25001.dagger2copy.di.scopes.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    // TODO: 2017/4/6 ?????????
    @Provides @PerActivity
    public Activity provideActivity(){
        return activity;
    }

}
