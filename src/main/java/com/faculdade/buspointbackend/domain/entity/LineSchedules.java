package com.faculdade.buspointbackend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "LineSchedules")
public class LineSchedules {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "hours",nullable = false)
    private List<String> hours;

    @Enumerated(EnumType.STRING)
    @Column(name = "days", nullable = false)
    private DaysOfTheWeek days;


}
