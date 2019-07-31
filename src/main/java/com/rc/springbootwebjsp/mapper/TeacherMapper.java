package com.rc.springbootwebjsp.mapper;


import com.rc.springbootwebjsp.bean.Teacher;

/**
 * @ClassName TeacherMapper
 * @Description Teacher 映射类,xml方式工作
 * @Author liux
 * @Date 19-7-23 下午11:26
 * @Version 1.0
 */
public interface TeacherMapper {

    public Teacher getTeacherById(Integer id);

    public void insertTeacher(Teacher teacher);

}
