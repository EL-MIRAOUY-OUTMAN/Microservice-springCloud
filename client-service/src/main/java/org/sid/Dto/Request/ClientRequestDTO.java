package org.sid.Dto.Request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class ClientRequestDTO {
    private int cni;
    private String nom;
    private String prenom;
    private String adresse;
    private String login;
    private int email;
    private int  age;
}
