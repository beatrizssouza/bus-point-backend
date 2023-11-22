package com.faculdade.buspointbackend.controller;


import com.faculdade.buspointbackend.domain.dto.PointRequest;
import com.faculdade.buspointbackend.domain.entity.Point;
import com.faculdade.buspointbackend.services.PointService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/point")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class PointController {

    private final PointService pointService;

    public PointController(PointService pointService){
        this.pointService = pointService;
    }

    @GetMapping
    public List<Point> getPoints(){
        return pointService.getAllPoints();
    }

    @PostMapping
    public ResponseEntity<String> postPoint(@RequestBody @Valid Point pointRequest){
        pointService.createPoint(pointRequest);
        return ResponseEntity.ok("Criado com sucesso!");
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> deletePoint(@PathVariable Long id){
        pointService.deletePointById(id);
        return ResponseEntity.ok("Deletado com sucesso!");

    }
}
