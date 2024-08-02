package com.spring.Config;

import com.spring.Entity.Sala;
import com.spring.Repository.SalaRepository;
import com.spring.Service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SalaConfig implements CommandLineRunner {
    @Autowired
    private SalaRepository SalaRepository;
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public void run(String... args) throws Exception {
        Sala sala1 = new Sala("1 ano", "a");
        Sala sala2 = new Sala("1 ano", "b");
        Sala sala3 = new Sala("1 ano", "c");

        salaRepository.saveAll(Arrays.asList(sala1, sala2, sala3));
    }
}
