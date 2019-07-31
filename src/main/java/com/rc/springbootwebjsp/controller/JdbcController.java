package com.rc.springbootwebjsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ClassName JdbcController
 * @Description Jdbc 方式连接控制类
 * @Author liux
 * @Date 19-8-1 上午1:19
 * @Version 1.0
 */
@Controller
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/query")
    public Map<String, Object> query() {
        return jdbcTemplate.queryForList("select * from teacher").get(0);
    }
}
