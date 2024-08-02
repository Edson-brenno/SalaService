package com.spring.Service;

import com.spring.Dto.SalaDto;
import com.spring.Entity.Sala;
import com.spring.Repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public List<SalaDto> findAll() {
        List<Sala> salaList = salaRepository.findAll();

        return salaList.stream().map(SalaDto::new).toList();
    }

    public SalaDto getById(Long id) {
        return new SalaDto(salaRepository.getById(id));
    }
}
