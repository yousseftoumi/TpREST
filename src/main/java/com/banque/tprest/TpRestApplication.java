package com.banque.tprest;

import com.banque.tprest.entities.Compte;
import com.banque.tprest.entities.TypeCompte;
import com.banque.tprest.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TpRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpRestApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(0,Math.random()*8555,new Date(), TypeCompte.CURRENT));
            compteRepository.save(new Compte(0,Math.random()*8555,new Date(), TypeCompte.SAVING));
            compteRepository.save(new Compte(0,Math.random()*8555,new Date(), TypeCompte.CURRENT));
            compteRepository.findAll().forEach(c->{System.out.println(c.toString());});
        };
    }
}
