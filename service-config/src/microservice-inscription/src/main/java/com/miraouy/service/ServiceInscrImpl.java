package com.miraouy.service;

import com.miraouy.Dto.Request.InscriptionRequestDto;
import com.miraouy.Dto.Response.InscriptionReesponseDto;
import com.miraouy.Repository.InscriptionRepo;
import com.miraouy.model.Inscription;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ServiceInscrImpl implements ServiceInscription{
    private InscriptionRepo inscriptionRepo;

    public ServiceInscrImpl(InscriptionRepo inscriptionRepo) {
        this.inscriptionRepo = inscriptionRepo;
    }


    @Override
    public InscriptionReesponseDto addInscription(InscriptionRequestDto inscription) {

        InscriptionReesponseDto insRes=InscriptionReesponseDto.
                builder().niveau(inscription.getNiveau()).build();
        Inscription inscription1=new Inscription();
        BeanUtils.copyProperties(inscription,inscription1);
        inscription1.setDateinscription(new Date());
        Inscription inscsave= inscriptionRepo.save(inscription1);
        BeanUtils.copyProperties(inscsave,insRes);
        return insRes;
    }

    @Override
    public InscriptionReesponseDto getInscription(Long id) {
        InscriptionReesponseDto insRes=InscriptionReesponseDto.builder().build();
        Inscription inscription1=inscriptionRepo.findById(id).get();
        BeanUtils.copyProperties(inscription1,insRes);
        return insRes;
    }

    @Override
    public List<InscriptionReesponseDto> getAllInscription() {
        List<InscriptionReesponseDto> liste= new ArrayList<>();
        InscriptionReesponseDto responsee=InscriptionReesponseDto.builder().build();
        List<Inscription> inscriptionList=inscriptionRepo.findAll();
        System.out.println(inscriptionList);
        inscriptionList.stream().forEach(inscription -> {
            BeanUtils.copyProperties(inscription,responsee);
            liste.add(responsee);
        });
        return liste;
    }

}
