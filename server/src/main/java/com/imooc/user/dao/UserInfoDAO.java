package com.imooc.user.dao;

import com.imooc.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by helei on 2018-11-26.
 */
public interface UserInfoDAO extends JpaRepository<UserInfo,String> {

    UserInfo findByOpenid(String openid);
}
