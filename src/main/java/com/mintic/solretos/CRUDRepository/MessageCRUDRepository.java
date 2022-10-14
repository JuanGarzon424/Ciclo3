/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.mintic.solretos.CRUDRepository;

import com.mintic.solretos.Entidades.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author luis_
 */
public interface MessageCRUDRepository extends CrudRepository<Message, Integer> {
    
}
