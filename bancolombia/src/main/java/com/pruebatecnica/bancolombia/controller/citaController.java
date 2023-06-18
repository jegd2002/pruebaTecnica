package com.pruebatecnica.bancolombia.controller;

import com.pruebatecnica.bancolombia.entities.cita;
import com.pruebatecnica.bancolombia.entities.medico;
import com.pruebatecnica.bancolombia.entities.paciente;
import com.pruebatecnica.bancolombia.service.ICitaService;
import com.pruebatecnica.bancolombia.service.IMedicoService;
import com.pruebatecnica.bancolombia.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class citaController {
    @Autowired
    private ICitaService citaService;
    @Autowired
    private IPacienteService pacienteService;
    @Autowired
    private IMedicoService medicoService;
    private final Logger LOG = Logger.getLogger(""+medicoController.class);
    @GetMapping("/cita/listaCitaUsuario")
    public String getCita(Model model){
        LOG.log(Level.INFO,"getCita");
        List<cita> citas = citaService.findAll();
        model.addAttribute("getCita",citas);
        return "cita/listaCitaUsuario";
    }

    @GetMapping("/cita/ModificarCrearCita")
    public String createCita(Model model){
        LOG.log(Level.INFO,"createCita");
        //Cita
        cita cita = new cita();
        model.addAttribute("citaId",cita);
        //Seleccionar medico
        List<medico> medico = medicoService.findAll();
        model.addAttribute("medicoCita",medico);
        return "cita/ModificarCrearCita";
    }

    @PostMapping("/guardarCita")
    public String guardarCita(cita cita, Errors errores){
        LOG.log(Level.INFO,"guardarCita");
        cita = citaService.createCita(cita);
        return "redirect:/cita/listaCitaUsuario";
    }

    @RequestMapping(value = "/editarCita/{id}", method = RequestMethod.GET)
    public String editarCita(@PathVariable("id")long id, Model model){
        LOG.log(Level.INFO,"editarPaciente");
        //paciente
        cita cita = citaService.findById(id);
        model.addAttribute("citaId",cita);
        //medico
        List<medico> medico = medicoService.findAll();
        model.addAttribute("medicoCita",medico);
        return "cita/ModificarCrearCita";
    }


    @RequestMapping(value = "/eliminarCita/{id}", method = RequestMethod.GET)
    public String deleteCita(@PathVariable("id") long id,Model model) {
        LOG.log(Level.INFO, "deleteCita");
        citaService.deleteCita(id);
        return "redirect:/cita/listaCitaUsuario";
    }
}
