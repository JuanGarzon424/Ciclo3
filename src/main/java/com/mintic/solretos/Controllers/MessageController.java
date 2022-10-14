/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.mintic.solretos.Controllers;

import com.mintic.solretos.Entidades.Message;
import com.mintic.solretos.Services.MessageService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author luis_
 */
@RestController
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    
    @GetMapping("/all")
    public List<Message> getAll() {
        return messageService.getAll();
    }
    
    @GetMapping("/{id}")
    public Message getOne(@PathVariable("id") Integer id) {
        return messageService.getOne(id);
    }
    
    @PutMapping("/update")
    public Message setUpdate(@RequestBody Message message) {
        return messageService.setUpdate(message);
    }
    
    @PostMapping("/save")
    public Message setInsert(@RequestBody Message message) {
        return messageService.setInsert(message);
    }
    
    @DeleteMapping("/delete/{id}")
    public void setDelete(@PathVariable("id") Integer id) {
         messageService.setDelete(id);
    }
    
}
