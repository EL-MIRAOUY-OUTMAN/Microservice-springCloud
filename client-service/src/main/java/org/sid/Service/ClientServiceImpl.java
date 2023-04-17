package org.sid.Service;

import org.sid.Dto.Request.ClientRequestDTO;
import org.sid.Dto.Response.ClientResponceDto;
import org.sid.Model.Client;
import org.sid.Repository.ClientRepositiory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ClientServiceImpl implements  ClientService{
    private ClientRepositiory clientRepositiory;

    public ClientServiceImpl(ClientRepositiory clientRepositiory) {
        this.clientRepositiory = clientRepositiory;
    }

    @Override
    public ClientResponceDto addClient(ClientRequestDTO clientRequestDTO) {
        ClientResponceDto clientResponceDto=ClientResponceDto.builder().build();
        Client client=new Client();
        BeanUtils.copyProperties(clientRequestDTO,client);
        Client clientsave=clientRepositiory.save(client);
        BeanUtils.copyProperties(clientsave,clientResponceDto);
        return clientResponceDto;
    }

    @Override
    public ClientResponceDto getClient(int id) {
        ClientResponceDto responceDto=ClientResponceDto.builder().build();
        Client client=clientRepositiory.findById(id).get();
        BeanUtils.copyProperties(client,responceDto);
        return responceDto;
    }

    @Override
    public List<ClientResponceDto> getAllClients() {
        List<Client> liste=clientRepositiory.findAll();
        return  liste.stream().map(client -> {
            ClientResponceDto clientResponceDto=ClientResponceDto.builder().build();
            BeanUtils.copyProperties(client,clientResponceDto);
            return  clientResponceDto;
        }).collect(Collectors.toList());

    }
}
