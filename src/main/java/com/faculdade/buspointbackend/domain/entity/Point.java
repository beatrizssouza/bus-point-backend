package com.faculdade.buspointbackend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String namePoint;

    @Column(name = "lat", length = 20, nullable = false)
    private String lat;

    @Column(name = "lng", length = 20, nullable = false)
        private String lng;

}
