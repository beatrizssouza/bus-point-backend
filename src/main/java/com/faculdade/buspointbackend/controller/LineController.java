package com.faculdade.buspointbackend.controller;

import com.faculdade.buspointbackend.domain.entity.LineBus;
import com.faculdade.buspointbackend.services.LinesServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/lines")
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class LineController {

    private final LinesServices linesServices;

    public LineController(LinesServices linesServices){
        this.linesServices = linesServices;
    }

    @GetMapping
    public List<LineBus> getLinesBus(){
        return linesServices.getAllLines();
    }

    @PostMapping
    public ResponseEntity<String> postLines(@RequestBody @Valid LineBus lineRequest){
        linesServices.createLines(lineRequest);
        return ResponseEntity.ok("Criado com sucesso!");
    }
}
