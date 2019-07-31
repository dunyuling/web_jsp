package com.rc.springbootwebjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName JspController
 * @Description 对于jsp的访问只有放在外部tomcat中才有效
 * @Author liux
 * @Date 19-7-31 下午9:55
 * @Version 1.0
 */
@Controller
public class JspController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("-----------");
        return "success";
    }

    @RequestMapping("/bb")
    @ResponseBody
    public String bb() {
        System.out.println("-----------");
        return "bb";
    }
}
