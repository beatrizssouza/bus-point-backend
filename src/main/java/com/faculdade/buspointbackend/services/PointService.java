package com.faculdade.buspointbackend.services;

import com.faculdade.buspointbackend.domain.entity.Point;
import com.faculdade.buspointbackend.repository.PointRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PointService {
    private final PointRepository pointRepository;

    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public void createPoint(Point point){
        this.pointRepository.save(point);
    }

    public List<Point> getAllPoints() {
        return pointRepository.findAll();
    }

    public void deletePointById(Long id){
        pointRepository.deleteById(Math.toIntExact(id));
    }
}
