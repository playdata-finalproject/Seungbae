package com.finalproject.projecttest.testapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class test {

    @GetMapping("/name")
    public dto w(){
        dto aw = new dto(1L,"seungbae");
        return aw;
    }
}
