package com.journaldev.springhibernate.service;

import java.util.List;

import com.journaldev.springhibernate.model.Repuesto;
 
public interface RepuestoService {
 
    public void addRepuesto(Repuesto p);
    public List<Repuesto> listRepuestos();
     
}