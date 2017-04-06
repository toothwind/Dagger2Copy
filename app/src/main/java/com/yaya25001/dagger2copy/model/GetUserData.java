package com.yaya25001.dagger2copy.model;

import javax.inject.Inject;

/**
 * Created by toothwind on 2017/4/6.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public class GetUserData {

    @Inject
    public GetUserData() {
    }

    //模拟取数据
    public UserData getUser() {
        UserData data = new UserData();
        data.mUserName = "toothwind";
        return data;
    }

}
