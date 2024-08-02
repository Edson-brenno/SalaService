package com.spring.Controller;

import com.spring.Entity.Sala;
import com.spring.Service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping
    public ResponseEntity<List<Sala>> getSalas() {
        return ResponseEntity.ok().body(salaService.findAll());
    }
}
