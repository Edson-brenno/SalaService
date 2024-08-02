package com.spring.Dto;

import com.spring.Entity.Sala;

public record SalaDto (Long id, String serie, String turma) {
    public SalaDto (Sala sala) {
        this(sala.getId(), sala.getSerie(), sala.getTurma());
    }
}
