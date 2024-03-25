package com.cestay.paciente.app;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private Long id;
    private String rut;
    private String nombre;
    private String apellido;
    private String email;
    private List<Atencion> atenciones = new ArrayList<>();

    public Paciente() {
    
    }

    public Paciente(Long id, String rut, String nombre, String apellido, String email) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.atenciones = new ArrayList<>();
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Atencion> getAtenciones() {
        return this.atenciones;
    }

    public void setAtenciones(List<Atencion> atenciones) {
        this.atenciones = atenciones;
    }

    public void setAtencion(Atencion atencion) {
        this.atenciones.add(atencion);
    }

    public Long getId() {
        return this.id;
    }

}
