package com.faculdade.buspointbackend.repository;

import com.faculdade.buspointbackend.domain.entity.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Integer> {
}
