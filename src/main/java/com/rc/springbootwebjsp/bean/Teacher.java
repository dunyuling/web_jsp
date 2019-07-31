package com.rc.springbootwebjsp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Teacher
 * @Description Teacher 实体类 --- 用于 mybatis
 * @Author liux
 * @Date 19-7-23 下午7:28
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {

    private int id;
    private String name;
    private String tel;
    private String address;
    private int gradeId;
}