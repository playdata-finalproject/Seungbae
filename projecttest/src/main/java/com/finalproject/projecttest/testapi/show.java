package com.finalproject.projecttest.testapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class show {

    @GetMapping("/home")
    public String a(){
        return "/main.html";
    }
}
