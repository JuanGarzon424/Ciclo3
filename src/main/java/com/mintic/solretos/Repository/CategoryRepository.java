/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.solretos.Repository;

import com.mintic.solretos.CRUDRepository.CategoryCRUDRepository;
import com.mintic.solretos.Entidades.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luis_
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCRUDRepository  categoryCRUDRepository;
    
    public Category setInsert(Category category){
        Optional<Category> obj = categoryCRUDRepository.findById(category.getId());
        if (obj.isEmpty() == true)
            return categoryCRUDRepository.save(category);
        else
            return null;
    }
    
    public Category setUpdate(Category category){
        Optional<Category> obj = categoryCRUDRepository.findById(category.getId());
        if (obj.isEmpty() == false)
            return categoryCRUDRepository.save(category);
        else
            return null;
    }
    
    public void setDelete(Integer id){
        Optional<Category> obj = categoryCRUDRepository.findById(id);
        if (obj.isEmpty() == false)
            categoryCRUDRepository.deleteById(id);
            
    }
    
    public List<Category> getall(){
        return (List<Category>) categoryCRUDRepository.findAll();
    }
    
    public Category getOne(Integer id){
        Optional<Category> obj = categoryCRUDRepository.findById(id);
        Category devolver;
        if (obj.isEmpty() == false)
            devolver = obj.get();
        else
            devolver = null;
        return  devolver;
    }    
    
}