package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class aa {

    @GetMapping("")
    public String a(){
        return "pages/index.html";
    }

}
