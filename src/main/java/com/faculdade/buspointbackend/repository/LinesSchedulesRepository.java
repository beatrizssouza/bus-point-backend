package com.faculdade.buspointbackend.repository;

import com.faculdade.buspointbackend.domain.entity.LineSchedules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinesSchedulesRepository extends JpaRepository<LineSchedules, Integer> {
}
