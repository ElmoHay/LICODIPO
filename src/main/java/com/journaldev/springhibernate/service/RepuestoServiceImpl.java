package com.journaldev.springhibernate.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.springhibernate.dao.RepuestoDAO;
import com.journaldev.springhibernate.model.Repuesto;

@Service
@ManagedBean(name="repuestoService")
@SessionScoped
public class RepuestoServiceImpl implements RepuestoService {

	private RepuestoDAO repuestoDAO;
	 
    public void setRepuestoDAO(RepuestoDAO repuestoDAO) {
        this.repuestoDAO = repuestoDAO;
    }
 
    @Override
    @Transactional
    public void addRepuesto(Repuesto p) {
        this.repuestoDAO.addRepuesto(p);
    }
 
    @Override
    @Transactional
    public List<Repuesto> listRepuestos() {
        return this.repuestoDAO.listRepuestos();
    }
 
}
