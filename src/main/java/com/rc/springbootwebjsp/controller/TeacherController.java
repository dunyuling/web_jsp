package com.rc.springbootwebjsp.controller;

import com.rc.springbootwebjsp.bean.Teacher;
import com.rc.springbootwebjsp.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TeacherController
 * @Description mybatis orm 方式下 TeacherController
 * @Author liux
 * @Date 19-7-24 上午12:10
 * @Version 1.0
 */
@RestController
public class TeacherController {

    @Autowired
    TeacherMapper teacherMapper;

    @GetMapping("/teacher/{id}")
    public Teacher getTeacher(@PathVariable Integer id) {
        return teacherMapper.getTeacherById(id);
    }

    @GetMapping("/teacher")
    public Teacher insertTeacher(Teacher teacher) {
        teacherMapper.insertTeacher(teacher);
        return teacher;
    }
}
