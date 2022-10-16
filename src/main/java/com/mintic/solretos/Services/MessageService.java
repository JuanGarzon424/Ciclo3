/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.mintic.solretos.Services;


import com.mintic.solretos.Entidades.Message;
import com.mintic.solretos.Repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    
    public Message setInsert(Message message){
        return messageRepository.setInsert(message);
    }

    public Message setUpdate(Message message){
        return messageRepository.setUpdate(message);
    }

    public void setDelete(Integer id){
        messageRepository.setDelete(id);
    }

    public Message getOne(Integer id){
        return messageRepository.getOne(id);
    }
    
    public List<Message> getAll(){
        return messageRepository.getall();
    }
    
}