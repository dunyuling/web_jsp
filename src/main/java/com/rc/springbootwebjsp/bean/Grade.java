package com.rc.springbootwebjsp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Grade
 * @Description 实体类 --- 用于 mybatis
 * @Author liux
 * @Date 19-7-23 下午7:29
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {

    private int id;

    private String gradeName;
}
