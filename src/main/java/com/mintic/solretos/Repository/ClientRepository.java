/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.solretos.Repository;

import com.mintic.solretos.CRUDRepository.ClientCRUDRepository;
import com.mintic.solretos.Entidades.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luis_
 */
@Repository
public class ClientRepository {
    @Autowired
    private ClientCRUDRepository  clientCRUDRepository;
    
    public Client setInsert(Client client){
            return clientCRUDRepository.save(client);
    }
    
    public Client setUpdate(Client client){
        Optional<Client> obj = clientCRUDRepository.findById(client.getIdClient());
        if (obj.isEmpty() == false)
            return clientCRUDRepository.save(client);
        else
            return null;
    }
    
    public void setDelete(Integer id){
        Optional<Client> obj = clientCRUDRepository.findById(id);
        if (obj.isEmpty() == false)
            clientCRUDRepository.deleteById(id);
            
    }
    
    public List<Client> getall(){
        return (List<Client>) clientCRUDRepository.findAll();
    }
    
    public Client getOne(Integer id){
        Optional<Client> obj = clientCRUDRepository.findById(id);
        Client devolver;
        if (obj.isEmpty() == false)
            devolver = obj.get();
        else
            devolver = null;
        return  devolver;
    }    
    
}