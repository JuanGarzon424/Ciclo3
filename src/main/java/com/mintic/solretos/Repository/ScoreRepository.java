/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.solretos.Repository;

import com.mintic.solretos.CRUDRepository.ScoreCRUDRepository;
import com.mintic.solretos.Entidades.Score;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCRUDRepository  scoreCRUDRepository;
    
    public Score setInsert(Score score){
        Optional<Score> obj = scoreCRUDRepository.findById(score.getScoreId());
        if (obj.isEmpty() == true)
            return scoreCRUDRepository.save(score);
        else
            return null;
    }
    
    public Score setUpdate(Score score){
        Optional<Score> obj = scoreCRUDRepository.findById(score.getScoreId());
        if (obj.isEmpty() == false)
            return scoreCRUDRepository.save(score);
        else
            return null;
    }
    
    public void setDelete(Integer id){
        Optional<Score> obj = scoreCRUDRepository.findById(id);
        if (obj.isEmpty() == false)
            scoreCRUDRepository.deleteById(id);
            
    }
    
    public List<Score> getall(){
        return (List<Score>) scoreCRUDRepository.findAll();
    }
    
    public Score getOne(Integer id){
        Optional<Score> obj = scoreCRUDRepository.findById(id);
        Score devolver;
        if (obj.isEmpty() == false)
            devolver = obj.get();
        else
            devolver = null;
        return  devolver;
    }    
    
}