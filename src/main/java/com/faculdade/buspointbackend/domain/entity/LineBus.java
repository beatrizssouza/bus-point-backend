package com.faculdade.buspointbackend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "linesBus")
public class LineBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameLine",length = 50, nullable = false)
    private String nameLine;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "lines_of_days", joinColumns = @JoinColumn(name = "linesBus_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_lines_days")),
    inverseJoinColumns = @JoinColumn(name = "line_schedules_id",referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_lines_days")))
    private List<LineSchedules> linesSchedules;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "lines_of_days", joinColumns = @JoinColumn(name = "lines_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_lines_point")),
            inverseJoinColumns = @JoinColumn(name = "point_id",referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_lines_point")))
    private List<Point> points;




}
