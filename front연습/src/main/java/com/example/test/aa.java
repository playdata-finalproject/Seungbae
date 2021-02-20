package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class aa {

    @GetMapping("")
    public ModelAndView a(){ return new ModelAndView("/pages/index");}

    @GetMapping("/join")
    public ModelAndView a1(){ return new ModelAndView("/pages/join");}

    @GetMapping("/list")
    public ModelAndView a2(){ return new ModelAndView("/pages/list");}

    @GetMapping("/login")
    public ModelAndView a3(){ return new ModelAndView("/pages/login");}

    @GetMapping("/view")
    public ModelAndView a4(){ return new ModelAndView("/pages/view");}

}
