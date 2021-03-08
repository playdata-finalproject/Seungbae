package com.finalproject.shelter.service.Logic;

import com.finalproject.shelter.model.entity.Categorytable;
import com.finalproject.shelter.repository.CategorytableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategorytableLogicService {

    @Autowired
    private CategorytableRepository categorytableRepository;

    private String title;

    public String readtitle(String id){

        Optional<Categorytable> categorytable = categorytableRepository.findById(Long.parseLong(id));
        categorytable.ifPresent(select->{
            title = select.getTitle();
        });

        return title;
    }
}
