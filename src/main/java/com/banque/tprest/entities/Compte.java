package com.banque.tprest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date date_creation;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private TypeCompte typeCompte;
}