package org.sid.Dto.Response;


import lombok.Builder;
import lombok.Data;

@Builder @Data
public class ClientResponceDto {
    private int cni;
    private String nom;
    private String prenom;

    private String email;
}
