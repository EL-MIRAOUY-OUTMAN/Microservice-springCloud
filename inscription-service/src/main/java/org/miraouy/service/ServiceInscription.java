package org.miraouy.service;

import org.miraouy.Dto.Request.InscriptionRequestDto;
import org.miraouy.Dto.Response.InscriptionReesponseDto;

import java.util.List;


public interface ServiceInscription {
    public InscriptionReesponseDto addInscription(InscriptionRequestDto inscription);
    public InscriptionReesponseDto getInscription(Long id);
    public List<InscriptionReesponseDto> getAllInscription();

}
