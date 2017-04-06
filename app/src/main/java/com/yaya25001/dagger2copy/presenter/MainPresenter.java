package com.yaya25001.dagger2copy.presenter;

import com.yaya25001.dagger2copy.model.GetUserData;
import com.yaya25001.dagger2copy.model.UserData;

import javax.inject.Inject;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public class MainPresenter {

    private GetUserData userData;
    private IUserView userView;

    @Inject
    public MainPresenter(GetUserData userData) {
        this.userData = userData;
    }

    public void getUser(){
        UserData userData = this.userData.getUser();
        this.userView.setUserName(userData.mUserName);
    }

    public void setUserView(IUserView userView) {
        this.userView = userView;
    }
}
