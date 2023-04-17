package com.miraouy.service;

import com.miraouy.Dto.Request.InscriptionRequestDto;
import com.miraouy.Dto.Response.InscriptionReesponseDto;

import java.util.List;


public interface ServiceInscription {
    public InscriptionReesponseDto addInscription(InscriptionRequestDto inscription);
    public InscriptionReesponseDto getInscription(Long id);
    public List<InscriptionReesponseDto> getAllInscription();

}
