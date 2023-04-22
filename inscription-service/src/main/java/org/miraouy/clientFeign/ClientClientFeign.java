package org.miraouy.clientFeign;

import org.miraouy.Dto.Response.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "client-service",path = "/api/clients")
public interface ClientClientFeign {
    @GetMapping("/{id}")
    public ClientResponse getClientById(@PathVariable int id);
}
