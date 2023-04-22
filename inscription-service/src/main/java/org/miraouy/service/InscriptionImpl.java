package org.miraouy.service;

import org.miraouy.Dto.Request.InscriptionRequestDto;
import org.miraouy.Dto.Response.InscriptionReesponseDto;
import org.miraouy.Repository.InscriptionRepo;
import org.miraouy.clientFeign.ClientClientFeign;
import org.miraouy.model.Inscription;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    @Service
    public class InscriptionImpl implements ServiceInscription {
        private InscriptionRepo inscriptionRepo;
        private ClientClientFeign clientFeign;
        public InscriptionImpl(InscriptionRepo inscriptionRepo, ClientClientFeign clientFeign) {
            this.inscriptionRepo = inscriptionRepo;
            this.clientFeign = clientFeign;
        }


        @Override
        public InscriptionReesponseDto addInscription(InscriptionRequestDto inscriptionRequestDto) {

            Inscription inscription1=Inscription.builder()
                    .dateinscription(new Date())
                    .niveau(inscriptionRequestDto.getNiveau())
                    .specialite(inscriptionRequestDto.getSpecialite())
                    .idAdherant(inscriptionRequestDto.getIdClient())
                    .build();
            Inscription inscriptionSave=inscriptionRepo.save(inscription1);
            InscriptionReesponseDto insRes=InscriptionReesponseDto.builder()
                    .dateinscription(inscriptionSave.getDateinscription())
                    .specialite(inscriptionSave.getSpecialite())
                    .niveau(inscriptionSave.getNiveau())
                    .clientResponse(clientFeign.getClientById(inscriptionSave.getIdAdherant()))
                    .build();
            return insRes;
        }

        @Override
        public InscriptionReesponseDto getInscription(Long id) {


            Inscription inscription1=inscriptionRepo.findById(id).get();
            System.out.println(inscription1);
            InscriptionReesponseDto insRes=InscriptionReesponseDto.builder()
                    .dateinscription(inscription1.getDateinscription())
                    .specialite(inscription1.getSpecialite())
                    .niveau(inscription1.getNiveau())
                    .clientResponse(clientFeign.getClientById(inscription1.getIdAdherant()))
                    .build();
            return insRes;
        }

        @Override
        public List<InscriptionReesponseDto> getAllInscription() {
            List<InscriptionReesponseDto> liste= new ArrayList<>();
            List<Inscription> inscriptionList=inscriptionRepo.findAll();
            System.out.println(inscriptionList);
            inscriptionList.stream().forEach(inscription1 -> {
                InscriptionReesponseDto insRes=InscriptionReesponseDto.builder()
                        .dateinscription(inscription1.getDateinscription())
                        .specialite(inscription1.getSpecialite())
                        .niveau(inscription1.getNiveau())
                        .clientResponse(clientFeign.getClientById(inscription1.getIdAdherant()))
                        .build();
                liste.add(insRes);

            });
            return liste;
        }

    }

