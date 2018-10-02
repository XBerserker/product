package com.imooc.product.VO;

import lombok.Data;

/**
 * Created by lt on 2018/9/30.
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String message;

    /**
     * 具体内容
     */
    private T data;

}
