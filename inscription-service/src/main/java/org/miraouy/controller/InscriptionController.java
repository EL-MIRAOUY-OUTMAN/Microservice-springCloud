package org.miraouy.controller;

import org.miraouy.Dto.Request.InscriptionRequestDto;
import org.miraouy.Dto.Response.InscriptionReesponseDto;
import org.miraouy.service.ServiceInscription;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscriptions")
@CrossOrigin("*")
public class InscriptionController {

    private ServiceInscription serviceInscription;
    public InscriptionController(ServiceInscription serviceInscription) {
        this.serviceInscription = serviceInscription;
    }

    @PostMapping
    public InscriptionReesponseDto addInscription(@RequestBody InscriptionRequestDto inscription) {
        return serviceInscription.addInscription(inscription);
    }

    @GetMapping("/{id}")
    public InscriptionReesponseDto getInscription(@PathVariable  Long id) {
        return serviceInscription.getInscription(id);
    }

   @GetMapping
    public List<InscriptionReesponseDto> getAllInscription() {

        return serviceInscription.getAllInscription();
    }
}
