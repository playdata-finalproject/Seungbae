package com.finalproject.shelter.service.Logic;

import com.finalproject.shelter.ifs.Crudinterface;
import com.finalproject.shelter.model.entity.Board;
import com.finalproject.shelter.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardLogicService {

    @Autowired
    private BoardRepository boardRepository;


}
