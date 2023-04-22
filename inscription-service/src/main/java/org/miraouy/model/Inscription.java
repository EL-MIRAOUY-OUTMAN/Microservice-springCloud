package org.miraouy.model;

import javax.persistence.*;
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
    private int idAdherant;
}
