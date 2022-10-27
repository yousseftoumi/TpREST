package com.banque.tprest.repositories;

import com.banque.tprest.TpRestApplication;
import com.banque.tprest.entities.Compte;
import org.springframework.boot.SpringApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface  CompteRepository extends JpaRepository<Compte,Long> {
    public static void main(String[] args){
        SpringApplication.run(TpRestApplication.class,args);
    }

}
