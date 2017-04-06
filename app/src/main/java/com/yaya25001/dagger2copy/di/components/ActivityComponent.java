package com.yaya25001.dagger2copy.di.components;

import android.app.Activity;

import com.yaya25001.dagger2copy.di.modules.ActivityModule;
import com.yaya25001.dagger2copy.di.scopes.PerActivity;

import dagger.Component;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
@PerActivity
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    Activity getActivity();

}
