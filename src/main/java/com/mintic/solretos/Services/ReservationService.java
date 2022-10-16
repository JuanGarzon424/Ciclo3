/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.mintic.solretos.Services;

import com.mintic.solretos.DTOs.DtoReportStatus;
import com.mintic.solretos.Entidades.Reservation;
import com.mintic.solretos.Repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    
    public Reservation setInsert(Reservation reservation){
        return reservationRepository.setInsert(reservation);
    }

    public Reservation setUpdate(Reservation reservation){
        return reservationRepository.setUpdate(reservation);
    }

    public void setDelete(Integer id){
        reservationRepository.setDelete(id);
    }

    public Reservation getOne(Integer id){
        return reservationRepository.getOne(id);
    }
    
    public List<Reservation> getAll(){
        return reservationRepository.getall();
    }
    
    public DtoReportStatus getReportStatus(){
        return reservationRepository.getReportStatus();
    }
    
}