package com.atguigu.springcloud.entities;/**
 * @author Xtl
 * @create 2022-12-13-14:56
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@ClassName CommonResult
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1314:56
 *@Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {  //泛型：如果装的payment 返回payment,装的order 返回order

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
