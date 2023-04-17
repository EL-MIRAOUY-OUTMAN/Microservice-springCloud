package org.sid.Controller;

import org.sid.Dto.Request.ClientRequestDTO;
import org.sid.Dto.Response.ClientResponceDto;
import org.sid.Service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/clients")
@CrossOrigin("*")
public class ClientController  {
      private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
     @PostMapping
    public ClientResponceDto addClient(@RequestBody ClientRequestDTO clientRequestDTO) {
        return clientService.addClient(clientRequestDTO);
    }

    @GetMapping("/{id}")
    public ClientResponceDto getClient(@PathVariable int id) {
        return clientService.getClient(id);
    }
    @GetMapping
    public List<ClientResponceDto> getAllClients() {
        return clientService.getAllClients();
    }
}
