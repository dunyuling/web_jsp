package com.rc.springbootwebjsp.mapper;

import com.rc.springbootwebjsp.bean.Grade;
import org.apache.ibatis.annotations.*;

/**
 * @ClassName GradeMapper
 * @Description Grade 映射类,注解方式工作
 * @Author liux
 * @Date 19-7-23 下午11:27
 * @Version 1.0
 */
//@Mapper
public interface GradeMapper {

    @Select("select * from grade where id=#{id}")
    Grade getGradeById(Integer id);

    @Delete("delete from grade where id=#{id}")
    int delGrade(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into grade(grade_name) values(#{gradeName})")
    int insertGrade(Grade grade);

    @Update("update grade set grade_name=#{gradeName} where id=#{id}")
    int updateGrade(Grade grade);
}