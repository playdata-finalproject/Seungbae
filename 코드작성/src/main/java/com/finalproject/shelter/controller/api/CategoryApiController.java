package com.finalproject.shelter.controller.api;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import com.finalproject.shelter.model.entity.Category;
import com.finalproject.shelter.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryApiController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/title")
    public List<Category> All(){

        List<Category> categoryList = categoryRepository.findAll();

        return categoryList;
    }

}
