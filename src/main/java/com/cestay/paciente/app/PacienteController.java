package com.cestay.paciente.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PacienteController {

    private List<Paciente> pacientes = new ArrayList<>();


    public PacienteController() {
        
        Paciente pac = new Paciente("1-9", "Juan", "Perez", "jperez@mail.cl");

        pac.setAtencion(new Atencion(new GregorianCalendar(2024, Calendar.JANUARY, 31).getTime(), "Dr. Juanito", "Resfrio"));
        pac.setAtencion(new Atencion(new GregorianCalendar(2024, Calendar.FEBRUARY, 29).getTime(), "Dr. Juanito", "Gripe"));

        pacientes.add(pac);

    }

    @GetMapping("pacientes")
    public String getPacientes() {
        return pacientes.toString();
    }

    @GetMapping("pacientes/{id}")
    public String getPaciente(@PathParam String id) {
        return pacientes.stream().filter(p -> p.getRut().equals(id)).findFirst().get().toString();
    }

    



}
