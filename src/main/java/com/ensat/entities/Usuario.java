package com.ensat.entities;

import javax.persistence.*;

//@Entity
//@Table(name="usuarios")
public class Usuario {


    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String dni;
	private String nombre;
	private String telefono;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}