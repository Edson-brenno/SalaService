package com.spring.Controller;

import com.spring.Dto.SalaDto;
import com.spring.Entity.Sala;
import com.spring.Service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping
    public ResponseEntity<List<SalaDto>> getSalas() {
        return ResponseEntity.ok().body(salaService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SalaDto> getSala(@PathVariable("id") long id) {
        return ResponseEntity.ok().body(salaService.getById(id));
    }
}
