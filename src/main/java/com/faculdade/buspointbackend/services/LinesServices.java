package com.faculdade.buspointbackend.services;

import com.faculdade.buspointbackend.domain.entity.LineBus;
import com.faculdade.buspointbackend.repository.LineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinesServices {
    private final LineRepository lineRepository;

    public LinesServices(LineRepository lineRepository){
        this.lineRepository = lineRepository;
    }

    public List<LineBus> getAllLines(){
        return lineRepository.findAll();
    }

    public void createLines(LineBus linebus){
        this.lineRepository.save(linebus);
    }
}
