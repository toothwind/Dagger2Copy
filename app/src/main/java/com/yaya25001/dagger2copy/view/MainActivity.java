package com.yaya25001.dagger2copy.view;

import android.os.Bundle;

import com.yaya25001.dagger2copy.R;
import com.yaya25001.dagger2copy.di.components.DaggerMainComponent;
import com.yaya25001.dagger2copy.di.components.MainComponent;
import com.yaya25001.dagger2copy.di.modules.ActivityModule;
import com.yaya25001.dagger2copy.di.modules.MainModule;

public class MainActivity extends BaseActivity {

    /*
    1.在app的gradle配置:
    //dagger start
    apt 'com.google.dagger:dagger-compiler:2.0'
    //dagger end
    compile 'com.android.support:appcompat-v7:23.2.1'
    compile 'com.google.dagger:dagger:2.0'
    compile 'org.glassfish:javax.annotation:10.0-b28'
    compile 'com.android.support:support-v4:23.2.1'
    compile 'com.google.android.gms:play-services:8.4.0'

     //dagger
    apply plugin: 'com.neenbedankt.android-apt'
    项目的gradle
    classpath:配置classpath 'com.neenbedankt.gradle.plugins:android-apt:1.4'

    2.class  App集成application
      写个mvp

    3.mvp-->
    4.
    去掉toastUtil的new方法,给fragment中变量添加注解 @Inject
    构造方法没加?
    现在缺少一个链接的纽带
     Component
    5.创建包:di (components , modules , scopes)
    6.创建各种component module scope
    7.inject

     */

    private MainComponent mainComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainComponent = DaggerMainComponent.builder().appComponent(getAppComponent())
                .mainModule(new MainModule())
                .activityModule(new ActivityModule(this)).build();
        mainComponent.inject(this);

    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }
}
