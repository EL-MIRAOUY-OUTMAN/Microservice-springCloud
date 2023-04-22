package org.miraouy.Dto.Response;

import lombok.Data;

@Data
public class ClientResponse {
    private int cni;
    private String nom;
    private String prenom;

    private String email;
}
