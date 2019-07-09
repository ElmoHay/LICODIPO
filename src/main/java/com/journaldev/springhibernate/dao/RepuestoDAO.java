package com.journaldev.springhibernate.dao;

import java.util.List;

import com.journaldev.springhibernate.model.Repuesto;
 
public interface RepuestoDAO {
 
    public void addRepuesto(Repuesto p);
    public List<Repuesto> listRepuestos();
}