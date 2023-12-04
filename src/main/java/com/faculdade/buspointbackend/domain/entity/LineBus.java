package com.faculdade.buspointbackend.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "linesBusPoints")
public class LineBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLines;

    @Column(name = "nameLine",length = 50, nullable = false)
    private String nameLine;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "lines_of_days", joinColumns = @JoinColumn(name = "linesBus_id", referencedColumnName = "idLines", foreignKey = @ForeignKey(name = "fk_lines_days")),
    inverseJoinColumns = @JoinColumn(name = "line_schedules_id",referencedColumnName = "idLinesSchedules", foreignKey = @ForeignKey(name = "fk_lines_days")))
    private List<LineSchedules> linesSchedules;


    @Column(name = "point_id_list",length = 500, nullable = false)
    private List<String> pointIdList;




}
