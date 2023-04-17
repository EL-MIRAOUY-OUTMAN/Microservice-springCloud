package com.miraouy.Dto.Request;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data
@Builder
public class InscriptionRequestDto {
        private String specialite;
        private String niveau;
        private Long idAdherant;
    }

