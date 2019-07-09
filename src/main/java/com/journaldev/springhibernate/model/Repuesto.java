package com.journaldev.springhibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * 
 *
 */
//@Entity
//@Table(name="repuesto") // --> hibernate.xml 
public class Repuesto {
	//@Id
    //@Column(name="id")
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
     
    private String nombre;
     
    private String marca;
    
    private int cantidad;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
     
    public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
    public String toString(){
        return "id="+id+", nombre="+nombre+", marca="+marca;
    }
}