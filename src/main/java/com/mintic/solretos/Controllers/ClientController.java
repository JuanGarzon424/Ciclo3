/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.mintic.solretos.Controllers;

import com.mintic.solretos.Entidades.Client;
import com.mintic.solretos.Services.ClientService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/Client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    @GetMapping("/all")
    public List<Client> getAll() {
        return clientService.getAll();
    }
    
    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") Integer id) {
        return clientService.getOne(id);
    }
    
    @PutMapping("/update")
    public Client setUpdate(@RequestBody Client client) {
        return clientService.setUpdate(client);
    }
    
    @PostMapping("/save")
    public Client setInsert(@RequestBody Client client) {
        return clientService.setInsert(client);
    }
    
    @DeleteMapping("/delete/{id}")
    public void setDelete(@PathVariable("id") Integer id) {
         clientService.setDelete(id);
    }
    
}
