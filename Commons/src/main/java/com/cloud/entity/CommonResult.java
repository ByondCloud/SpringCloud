package com.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/29
 * @Time 18:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code; // 状态码
    private String message; // 信息
    private T data; // 具体数据

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
