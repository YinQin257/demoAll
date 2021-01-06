package com.yinqin.demo.SpringBootDemo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootStartDemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String str = "Hello World";
        return str;
    }


}
