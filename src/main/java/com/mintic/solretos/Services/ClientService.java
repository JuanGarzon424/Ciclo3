/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.mintic.solretos.Services;

import org.springframework.stereotype.Service;

import com.mintic.solretos.Entidades.Client;
import com.mintic.solretos.Repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    
    public Client setInsert(Client client){
        return clientRepository.setInsert(client);
    }

    public Client setUpdate(Client client){
        return clientRepository.setUpdate(client);
    }

    public void setDelete(Integer id){
        clientRepository.setDelete(id);
    }

    public Client getOne(Integer id){
        return clientRepository.getOne(id);
    }
    
    public List<Client> getAll(){
        return clientRepository.getall();
    }
    
}