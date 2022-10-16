/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.mintic.solretos.Controllers;

import com.mintic.solretos.Entidades.Score;
import com.mintic.solretos.Services.ScoreService;
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
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    
    @GetMapping("/all")
    public List<Score> getAll() {
        return scoreService.getAll();
    }
    
    @GetMapping("/{id}")
    public Score getOne(@PathVariable("id") Integer id) {
        return scoreService.getOne(id);
    }
    
    @PutMapping("/update")
    public Score setUpdate(@RequestBody Score score) {
        return scoreService.setUpdate(score);
    }
    
    @PostMapping("/save")
    public Score setInsert(@RequestBody Score score) {
        return scoreService.setInsert(score);
    }
    
    @DeleteMapping("/delete/{id}")
    public void setDelete(@PathVariable("id") Integer id) {
         scoreService.setDelete(id);
    }
    
}
