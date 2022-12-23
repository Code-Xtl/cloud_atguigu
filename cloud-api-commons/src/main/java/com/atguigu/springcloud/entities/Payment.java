package com.atguigu.springcloud.entities;/**
 * @author Xtl
 * @create 2022-12-13-14:55
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@ClassName Payment
 *@Description TODO
 *@Author xtl
 *@Date 2022-12-1314:55
 *@Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
