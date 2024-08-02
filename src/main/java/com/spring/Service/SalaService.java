package com.spring.Service;

import com.spring.Entity.Sala;
import com.spring.Repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> findAll() {
        return salaRepository.findAll();
    }
}
