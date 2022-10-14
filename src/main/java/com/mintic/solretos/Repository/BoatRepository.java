/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.solretos.Repository;

import com.mintic.solretos.CRUDRepository.BoatCRUDRepository;
import com.mintic.solretos.Entidades.Boat;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mintic.solretos.Entidades.Boat;

/**
 *
 * @author luis_
 */
@Repository
public class BoatRepository {
    @Autowired
    private BoatCRUDRepository  boatCRUDRepository;
    
    public Boat setInsert(Boat boat){
        Optional<Boat> obj = boatCRUDRepository.findById(boat.getId());
        if (obj.isEmpty() == true)
            return boatCRUDRepository.save(boat);
        else
            return null;
    }
    
    public Boat setUpdate(Boat boat){
        Optional<Boat> obj = boatCRUDRepository.findById(boat.getId());
        if (obj.isEmpty() == false)
            return boatCRUDRepository.save(boat);
        else
            return null;
    }
    
    public void setDelete(Integer id){
        Optional<Boat> obj = boatCRUDRepository.findById(id);
        if (obj.isEmpty() == false)
            boatCRUDRepository.deleteById(id);
            
    }
    
    public List<Boat> getall(){
        return (List<Boat>) boatCRUDRepository.findAll();
    }
    
    public Boat getOne(Integer id){
        Optional<Boat> obj = boatCRUDRepository.findById(id);
        Boat devolver;
        if (obj.isEmpty() == false)
            devolver = obj.get();
        else
            devolver = null;
        return  devolver;
    }    
    
}