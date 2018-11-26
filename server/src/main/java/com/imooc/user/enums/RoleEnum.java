package com.imooc.user.enums;

import lombok.Getter;

/**
 * Created by helei on 2018-11-26.
 */
@Getter
public enum RoleEnum {
    BUYER(1,"买家"),
    SELLER(2,"卖家")
    ;

    private Integer colde;

    private String message;

    RoleEnum(Integer colde, String message) {
        this.colde = colde;
        this.message = message;
    }
}
