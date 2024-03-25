package com.cestay.paciente.app;

import java.util.Date;

public class Atencion {

    private Date fecha;
    private String medico;
    private String diagnostico;

    public Atencion() {
    
    }

    public Atencion(Date fecha, String medico, String diagnostico) {
        this.fecha = fecha;
        this.medico = medico;
        this.diagnostico = diagnostico;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMedico() {
        return this.medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }



}
