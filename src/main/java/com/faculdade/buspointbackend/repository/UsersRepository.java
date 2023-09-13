package com.faculdade.buspointbackend.repository;

import com.faculdade.buspointbackend.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Integer> { }
