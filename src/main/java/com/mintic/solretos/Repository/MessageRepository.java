/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.solretos.Repository;

import com.mintic.solretos.CRUDRepository.MessageCRUDRepository;
import com.mintic.solretos.Entidades.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCRUDRepository  messageCRUDRepository;
    
    public Message setInsert(Message message){
        Optional<Message> obj = messageCRUDRepository.findById(message.getIdMessage());
        if (obj.isEmpty() == true)
            return messageCRUDRepository.save(message);
        else
            return null;
    }
    
    public Message setUpdate(Message message){
        Optional<Message> obj = messageCRUDRepository.findById(message.getIdMessage());
        if (obj.isEmpty() == false)
            return messageCRUDRepository.save(message);
        else
            return null;
    }
    
    public void setDelete(Integer id){
        Optional<Message> obj = messageCRUDRepository.findById(id);
        if (obj.isEmpty() == false)
            messageCRUDRepository.deleteById(id);
            
    }
    
    public List<Message> getall(){
        return (List<Message>) messageCRUDRepository.findAll();
    }
    
    public Message getOne(Integer id){
        Optional<Message> obj = messageCRUDRepository.findById(id);
        Message devolver;
        if (obj.isEmpty() == false)
            devolver = obj.get();
        else
            devolver = null;
        return  devolver;
    }    
    
}