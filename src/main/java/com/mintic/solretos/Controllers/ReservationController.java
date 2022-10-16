/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.mintic.solretos.Controllers;

import com.mintic.solretos.DTOs.DtoReportStatus;
import com.mintic.solretos.Entidades.Reservation;
import com.mintic.solretos.Services.ReservationService;
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
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    
    @GetMapping("/all")
    public List<Reservation> getAll() {
        return reservationService.getAll();
    }
    
    @GetMapping("/{id}")
    public Reservation getOne(@PathVariable("id") Integer id) {
        return reservationService.getOne(id);
    }
    
    @PutMapping("/update")
    public Reservation setUpdate(@RequestBody Reservation reservation) {
        return reservationService.setUpdate(reservation);
    }
    
    @PostMapping("/save")
    public Reservation setInsert(@RequestBody Reservation reservation) {
        return reservationService.setInsert(reservation);
    }
    
    @DeleteMapping("/delete/{id}")
    public void setDelete(@PathVariable("id") Integer id) {
         reservationService.setDelete(id);
    }
    
    @GetMapping("/report-status")
    public DtoReportStatus getReportStatus() {
        return reservationService.getReportStatus();
    }    
    
    
}
