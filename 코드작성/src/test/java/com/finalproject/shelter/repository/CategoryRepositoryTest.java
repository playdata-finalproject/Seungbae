package com.finalproject.shelter.repository;

import com.finalproject.shelter.ShelterApplicationTests;
import com.finalproject.shelter.model.entity.Category;
import com.finalproject.shelter.model.entity.Categorytable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryRepositoryTest extends ShelterApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategorytableRepository categorytableRepository;

    @Test
    public void create(){

        Category category = Category.builder()
                .title("플러터")
                .categorytable(categorytableRepository.getOne(1L))
                .build();
        categoryRepository.save(category);
    }
}
