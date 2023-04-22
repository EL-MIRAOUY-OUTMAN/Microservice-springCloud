package org.sid.Dto.Request;

import lombok.Builder;
import lombok.Data;

@Data @Builder

public class ClientRequestDTO {
    private int cni;
    private String nom;
    private String prenom;
    private String adresse;
    private String login;
    private String email;
    private int  age;
}
