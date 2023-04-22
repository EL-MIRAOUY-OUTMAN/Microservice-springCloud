package org.sid.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter  @ToString
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cni;
    private String nom;
    private String prenom;
    private String adresse;
    //@Size(min = 4)
    private String login;
    //@Email
    private String email;
    private int  age;
}
