package org.miraouy.Dto.Request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InscriptionRequestDto {
        private String specialite;
        private String niveau;
        private int idClient;
    }

