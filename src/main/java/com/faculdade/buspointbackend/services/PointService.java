package com.faculdade.buspointbackend.services;

import com.faculdade.buspointbackend.domain.entity.Point;
import com.faculdade.buspointbackend.repository.PointRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {
    private final PointRepository pointRepository;

    public PointService(PointRepository pointRepository){
        this.pointRepository = pointRepository;
    }

    public List<Point> getAllPoints(){
        return pointRepository.findAll();
    }

    public Point createPoint(Point point){
      return pointRepository.save(point);
    }





}

