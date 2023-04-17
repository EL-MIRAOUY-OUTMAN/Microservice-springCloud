package com.miraouy.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
@Builder
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String specialite;
    private String niveau;

    @Temporal(TemporalType.DATE)
    private Date dateinscription;
    private Long idAdherant;
}
