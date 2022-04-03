package com.atgaoyf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author gaoyf
 * @Desc //
 * @Date 2021/3/3 15:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> implements Serializable {

    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message) {

       this(code, message, null);
    }
}
