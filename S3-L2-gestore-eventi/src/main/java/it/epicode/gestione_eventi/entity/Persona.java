package it.epicode.gestione_eventi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Invitati")

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    @Column(nullable = false)
    private String email;

    @Column(name = "data_evento",nullable = false)
    private LocalDate dataDiNascita;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SessoEnum sesso;

    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> listaPartecipazioni =new ArrayList<>();

}
