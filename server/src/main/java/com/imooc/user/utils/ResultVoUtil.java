package com.imooc.user.utils;


import com.imooc.user.enums.ResultEnum;
import com.imooc.user.vo.ResultVo;

/**
 * Created by helei on 2018-11-14.
 */
public class ResultVoUtil {

    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功3gggggg");
        return resultVo;
    }

    public static ResultVo success(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功3gggggg");
        return resultVo;
    }

    public static ResultVo error(ResultEnum resultEnum){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(resultEnum.getCode());
        resultVo.setMsg(resultEnum.getMessage());
        return resultVo;
    }

}
