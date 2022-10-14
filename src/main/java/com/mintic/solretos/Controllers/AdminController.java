/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.mintic.solretos.Controllers;

import com.mintic.solretos.Entidades.Admin;
import com.mintic.solretos.Services.AdminService;
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
@RequestMapping("/api/Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    
    @GetMapping("/all")
    public List<Admin> getAll() {
        return adminService.getAll();
    }
    
    @GetMapping("/{id}")
    public Admin getOne(@PathVariable("id") Integer id) {
        return adminService.getOne(id);
    }
    
    @PutMapping("/update")
    public Admin setUpdate(@RequestBody Admin admin) {
        return adminService.setUpdate(admin);
    }
    
    @PostMapping("/save")
    public Admin setInsert(@RequestBody Admin admin) {
        return adminService.setInsert(admin);
    }
    
    @DeleteMapping("/delete/{id}")
    public void setDelete(@PathVariable("id") Integer id) {
         adminService.setDelete(id);
    }
    
}
