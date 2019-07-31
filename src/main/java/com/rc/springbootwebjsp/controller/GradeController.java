package com.rc.springbootwebjsp.controller;


import com.rc.springbootwebjsp.bean.Grade;
import com.rc.springbootwebjsp.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GradeController
 * @Description mybatis orm 方式下 GradeController
 * @Author liux
 * @Date 19-7-23 下午11:32
 * @Version 1.0
 */
@RestController
public class GradeController {

    @Autowired
    GradeMapper gradeMapper;

    @GetMapping("/grade/{id}")
    public Grade getGrade(@PathVariable Integer id) {
        return gradeMapper.getGradeById(id);
    }

    @GetMapping("/grade")
    public Grade insertGrade(Grade grade) {
        gradeMapper.insertGrade(grade);
        return grade;
    }
}
