/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.mintic.solretos.Controllers;

import com.mintic.solretos.Entidades.Boat;
import com.mintic.solretos.Services.BoatService;
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
 
@RestController
@RequestMapping("/api/Boat")
public class BoatController {
    @Autowired
    private BoatService boatService;
    
    @GetMapping("/all")
    public List<Boat> getAll() {
        return boatService.getAll();
    }
    
    @GetMapping("/{id}")
    public Boat getOne(@PathVariable("id") Integer id) {
        return boatService.getOne(id);
    }
    
    @PutMapping("/update")
    public Boat setUpdate(@RequestBody Boat boat) {
        return boatService.setUpdate(boat);
    }
    
    @PostMapping("/save")
    public Boat setInsert(@RequestBody Boat boat) {
        return boatService.setInsert(boat);
    }
    
    @DeleteMapping("/delete/{id}")
    public void setDelete(@PathVariable("id") Integer id) {
         boatService.setDelete(id);
    }
    
}
