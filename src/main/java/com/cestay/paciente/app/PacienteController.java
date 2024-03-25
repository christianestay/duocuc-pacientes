package com.cestay.paciente.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PacienteController {

    private List<Paciente> pacientes = new ArrayList<>();


    public PacienteController() {
        
        Paciente pac = new Paciente(1L, "1-9", "Juan", "Perez", "jperez@mail.cl");
        pac.setAtencion(new Atencion(new GregorianCalendar(2024, Calendar.JANUARY, 31).getTime(), "Dr. Juanito", "Resfrio"));
        pac.setAtencion(new Atencion(new GregorianCalendar(2024, Calendar.FEBRUARY, 29).getTime(), "Dr. Juanito", "Gripe"));
        pacientes.add(pac);

        Paciente pac2 = new Paciente(2L, "1122343-1", "Marcelo", "Zamorano", "mzamorano@mail.com");
        pac2.setAtencion(new Atencion(new GregorianCalendar(2023, Calendar.FEBRUARY, 1).getTime(), "Dr. Paolo Vivar", "Lupus"));
        pacientes.add(pac2);

        Paciente pac3 = new Paciente(3L, "2290212-2", "Pablo", "Marmol", "pmarmol@mail.cl");
        pac3.setAtencion(new Atencion(new GregorianCalendar(2023, Calendar.DECEMBER, 22).getTime(), "Dr. Muñoz", "Fractura"));
        pac3.setAtencion(new Atencion(new GregorianCalendar(2023, Calendar.JULY, 31).getTime(), "Dr. Chapatin", "Luxación"));
        pacientes.add(pac3);


    }

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    @GetMapping("/pacientes/{id}")
    public Paciente getPaciente(@PathVariable Long id) {
        return pacientes.stream().filter(pac -> pac.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping("/pacientes/{id}/atenciones")
    public List<Atencion> getAtenciones(@PathVariable Long id) {
        return pacientes.stream().filter(pac -> pac.getId().equals(id)).findFirst().map(Paciente::getAtenciones).orElse(null);
    }
    



}
