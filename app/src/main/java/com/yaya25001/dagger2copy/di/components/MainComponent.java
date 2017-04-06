package com.yaya25001.dagger2copy.di.components;

import com.yaya25001.dagger2copy.di.modules.ActivityModule;
import com.yaya25001.dagger2copy.di.modules.MainModule;
import com.yaya25001.dagger2copy.di.scopes.PerActivity;
import com.yaya25001.dagger2copy.view.MainActivity;

import dagger.Component;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = {MainModule.class, ActivityModule.class})
public interface MainComponent extends ActivityComponent{

    //对MainActivity进行依赖注入
    void inject(MainActivity mainActivity);

    MainFragmentComponent mainFragmentComponent();


}
