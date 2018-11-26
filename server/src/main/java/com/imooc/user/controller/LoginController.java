package com.imooc.user.controller;

import com.imooc.user.constant.CookieConstant;
import com.imooc.user.entity.UserInfo;
import com.imooc.user.enums.ResultEnum;
import com.imooc.user.enums.RoleEnum;
import com.imooc.user.service.UserInfoService;
import com.imooc.user.utils.CookieUtil;
import com.imooc.user.utils.ResultVoUtil;
import com.imooc.user.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;

/**
 * Created by helei on 2018-11-26.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 买家登录
     * @param openid
     * @param response
     * @return
     */
    @GetMapping(value = "/buyer",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultVo buyer(@RequestParam("openid") String openid,
                          HttpServletResponse response){
        //1. openid和数据库里的数据是否匹配
        UserInfo userInfo = userInfoService.findByOpenid(openid);
        if(null == userInfo){
            return ResultVoUtil.error(ResultEnum.LOGIN_FAIL);
        }
        //2. 判断角色
        if(RoleEnum.BUYER.getColde() != userInfo.getRole()){
            return ResultVoUtil.error(ResultEnum.ROLE_ERROR);
        }
        //3. cookie里设置openid=abc
        CookieUtil.set(response, CookieConstant.OPENID,openid,CookieConstant.expire);

        return ResultVoUtil.success();
    }

    /**
     * 卖家登录
     * @param openid
     * @param response
     * @return
     */
    public ResultVo seller(@RequestParam("openid") String openid,
                          HttpServletResponse response){

        return null;
    }

}
