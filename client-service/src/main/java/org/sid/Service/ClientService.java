package org.sid.Service;

import org.sid.Dto.Request.ClientRequestDTO;
import org.sid.Dto.Response.ClientResponceDto;

import java.util.List;

public interface ClientService {
    public ClientResponceDto addClient(ClientRequestDTO clientRequestDTO);
    public ClientResponceDto getClient(int id);
    public List<ClientResponceDto> getAllClients();
}
