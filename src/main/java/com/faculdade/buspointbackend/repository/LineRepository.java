package com.faculdade.buspointbackend.repository;

import com.faculdade.buspointbackend.domain.entity.LineBus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<LineBus, Integer> {
}
