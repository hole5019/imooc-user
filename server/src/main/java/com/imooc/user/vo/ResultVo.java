package com.imooc.user.vo;

import lombok.Data;

/**
 * Created by helei on 2018-11-14.
 */
@Data
public class ResultVo<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
