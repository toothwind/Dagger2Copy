package com.yaya25001.dagger2copy.di.modules;

import com.yaya25001.dagger2copy.model.GetUserData;

import dagger.Module;
import dagger.Provides;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
@Module
public class MainModule {

    @Provides
    public GetUserData provideUserDate(){
        return new GetUserData();
    }

}
