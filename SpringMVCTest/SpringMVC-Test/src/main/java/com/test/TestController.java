package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/aaa")
    public String index(){
        System.out.println("###");
        return "index";
    }
}

