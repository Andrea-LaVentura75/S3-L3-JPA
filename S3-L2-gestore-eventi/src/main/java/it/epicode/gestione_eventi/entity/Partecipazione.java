package it.epicode.gestione_eventi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.security.PrivateKey;

@Data
@Entity
@Table(name = "partecipazioni")
public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

   // @Column(nullable = false)
    //private Persona persona;

    //@Column(nullable = false)
    // private Evento evento;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private  StatoPartecipazioneEnum stato;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

}
