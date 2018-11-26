package com.imooc.user.service;

import com.imooc.user.entity.UserInfo;

/**
 * Created by helei on 2018-11-26.
 */
public interface UserInfoService {

    public UserInfo findByOpenid(String openid);
}
