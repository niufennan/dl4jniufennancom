package com.niufennan.dl4j.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String home(){
        System.out.println("aaaaaaaaaa====================");
        return "index";
    }
}
