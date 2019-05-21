package com.example.jenkins.jenkinsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： jenkinsdemo
 * @Date : 2019/5/20 14:46
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
@Controller
public class JenkinsTest {

    @RequestMapping("/test")
    public @ResponseBody String test(){
        return "jenkins";
    }
}
