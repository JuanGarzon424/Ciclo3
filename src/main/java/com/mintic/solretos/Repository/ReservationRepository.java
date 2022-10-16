/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.solretos.Repository;

import com.mintic.solretos.CRUDRepository.ReservationCRUDRepository;
import com.mintic.solretos.DTOs.DtoReportStatus;
import com.mintic.solretos.Entidades.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCRUDRepository  reservationCRUDRepository;
    
    public Reservation setInsert(Reservation reservation){
        Optional<Reservation> obj = reservationCRUDRepository.findById(reservation.getIdReservation());
        if (obj.isEmpty() == true)
            return reservationCRUDRepository.save(reservation);
        else
            return null;
    }
    
    public Reservation setUpdate(Reservation reservation){
        Optional<Reservation> obj = reservationCRUDRepository.findById(reservation.getIdReservation());
        if (obj.isEmpty() == false)
            return reservationCRUDRepository.save(reservation);
        else
            return null;
    }
    
    public void setDelete(Integer id){
        Optional<Reservation> obj = reservationCRUDRepository.findById(id);
        if (obj.isEmpty() == false)
            reservationCRUDRepository.deleteById(id);
            
    }
    
    public List<Reservation> getall(){
        return (List<Reservation>) reservationCRUDRepository.findAll();
    }
    
    public Reservation getOne(Integer id){
        Optional<Reservation> obj = reservationCRUDRepository.findById(id);
        Reservation devolver;
        if (obj.isEmpty() == false)
            devolver = obj.get();
        else
            devolver = null;
        return  devolver;
    }    
    
    
    public DtoReportStatus getReportStatus(){
        DtoReportStatus dtoReportStatus = new DtoReportStatus();
        dtoReportStatus.setCancelled(reservationCRUDRepository.countbystatus("cancelled"));
        dtoReportStatus.setCompleted(reservationCRUDRepository.countbystatus("completed"));
        return dtoReportStatus;
    }
    
}