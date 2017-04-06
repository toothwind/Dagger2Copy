package com.yaya25001.dagger2copy.di.components;

import com.yaya25001.dagger2copy.di.scopes.PerActivity;
import com.yaya25001.dagger2copy.view.MainFragment;

import dagger.Subcomponent;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
@PerActivity
@Subcomponent
public interface MainFragmentComponent {
   void inject(MainFragment mainFragment);
}
