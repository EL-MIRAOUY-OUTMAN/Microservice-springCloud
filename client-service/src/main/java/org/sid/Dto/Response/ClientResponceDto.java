package org.sid.Dto.Response;


import lombok.Builder;

@Builder
public class ClientResponceDto {
    private int cni;
    private String nom;
    private String prenom;
    private int email;

}
