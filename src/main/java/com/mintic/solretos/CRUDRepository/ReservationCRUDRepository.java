/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.mintic.solretos.CRUDRepository;

import com.mintic.solretos.Entidades.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author luis_
 */
public interface ReservationCRUDRepository extends CrudRepository<Reservation, Integer> {
    
    @Query(value="Select count(idReservation) from reservations where status = ?", nativeQuery=true)
    public Integer countbystatus(String status);     
    
}
