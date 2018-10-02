package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * Created by lt on 2018/9/30.
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        return resultVO;
    }
}
