/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.mintic.solretos.Services;

import com.mintic.solretos.Entidades.Score;
import com.mintic.solretos.Repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis_
 */
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;
    
    public Score setInsert(Score score){
        return scoreRepository.setInsert(score);
    }

    public Score setUpdate(Score score){
        return scoreRepository.setUpdate(score);
    }

    public void setDelete(Integer id){
        scoreRepository.setDelete(id);
    }

    public Score getOne(Integer id){
        return scoreRepository.getOne(id);
    }
    
    public List<Score> getAll(){
        return scoreRepository.getall();
    }
    
}