/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.mintic.solretos.Controllers;

import com.mintic.solretos.Entidades.Category;
import com.mintic.solretos.Services.CategoryService;
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
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/all")
    public List<Category> getAll() {
        return categoryService.getAll();
    }
    
    @GetMapping("/{id}")
    public Category getOne(@PathVariable("id") Integer id) {
        return categoryService.getOne(id);
    }
    
    @PutMapping("/update")
    public Category setUpdate(@RequestBody Category category) {
        return categoryService.setUpdate(category);
    }
    
    @PostMapping("/save")
    public Category setInsert(@RequestBody Category category) {
        return categoryService.setInsert(category);
    }
    
    @DeleteMapping("/delete/{id}")
    public void setDelete(@PathVariable("id") Integer id) {
         categoryService.setDelete(id);
    }
    
}
