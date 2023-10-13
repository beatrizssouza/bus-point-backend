package com.faculdade.buspointbackend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "LineSchedules")
public class LineSchedules {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "hours",length = 5, nullable = false)
    private String hours;

    @Enumerated(EnumType.STRING)
    @Column(name = "days", nullable = false)
    private DaysOfTheWeek days;


}
