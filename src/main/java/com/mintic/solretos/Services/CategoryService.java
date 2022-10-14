/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.mintic.solretos.Services;

import com.mintic.solretos.Entidades.Category;
import com.mintic.solretos.Repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis_
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public Category setInsert(Category category){
        return categoryRepository.setInsert(category);
    }

    public Category setUpdate(Category category){
        return categoryRepository.setUpdate(category);
    }

    public void setDelete(Integer id){
        categoryRepository.setDelete(id);
    }

    public Category getOne(Integer id){
        return categoryRepository.getOne(id);
    }
    
    public List<Category> getAll(){
        return categoryRepository.getall();
    }
    
}