package com.finalproject.shelter.controller.api.board;

import com.finalproject.shelter.model.Header;
import com.finalproject.shelter.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/view")
public class BoardViewApiController {

    @Autowired
    private BoardRepository boardRepository;

//    @GetMapping("{id}")
//    public Header<>

}
