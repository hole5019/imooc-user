package com.imooc.user.service.impl;

import com.imooc.user.dao.UserInfoDAO;
import com.imooc.user.entity.UserInfo;
import com.imooc.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by helei on 2018-11-26.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoDAO.findByOpenid(openid);
    }
}
