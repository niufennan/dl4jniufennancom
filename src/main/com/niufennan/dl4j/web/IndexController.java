package com.niufennan.dl4j.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping("/index")
    public String home(){
        //System.out.println("aaaaaaaaaa====================");
        return "hello world";
    }
}
