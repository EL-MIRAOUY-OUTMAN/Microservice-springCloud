package com.miraouy.Dto.Response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class InscriptionReesponseDto {
        private long id;
        private String specialite;
        private Date dateinscription;
        private String niveau;
        private Long idAdherant;

    }

