package com.pruebatecnica.bancolombia.controller;

import com.pruebatecnica.bancolombia.entities.medico;
import com.pruebatecnica.bancolombia.entities.paciente;
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
public class pacienteController {

    @Autowired
    private IPacienteService pacienteService;
    @Autowired
    private IMedicoService medicoService;

    private final Logger LOG = Logger.getLogger(""+medicoController.class);

    @GetMapping("/paciente/listaPacientes")
    public String getPacientes(Model model){
        LOG.log(Level.INFO,"getPacientes");
        List<paciente> pacientes = pacienteService.findAll3();
        model.addAttribute("pacienteGet",pacientes);
        return "paciente/listaPacientes";
    }

    @GetMapping("/paciente/modificarPaciente")
    public String createPaciente(Model model){
        LOG.log(Level.INFO,"createPaciente");
        //paciente
        paciente paciente = new paciente();
        model.addAttribute("pacienteid",paciente);
        //medico
        List<medico> medico = medicoService.findAll();
        model.addAttribute("medicoGet",medico);
        return "paciente/modificarPaciente";
    }

    @PostMapping("/guardarPaciente")
    public String guardarPaciente(paciente paciente, Errors errores){
        LOG.log(Level.INFO,"guardarPaciente");
        paciente = pacienteService.createPaciente(paciente);
        return "redirect:/paciente/listaPacientes";
    }

    @RequestMapping(value = "/editarPaciente/{id}", method = RequestMethod.GET)
    public String editarPaciente(@PathVariable("id")long id, Model model){
        LOG.log(Level.INFO,"editarPaciente");
        //paciente
        paciente paciente = pacienteService.findById(id);
        model.addAttribute("pacienteid",paciente);
        //medico
        List<medico> medicoG = medicoService.findAll();
        model.addAttribute("medicoGet",medicoG);
        return "paciente/modificarPaciente";
    }

    @RequestMapping(value = "/eliminarpaciente/{id}", method = RequestMethod.GET)
    public String deletepaciente(@PathVariable("id") long id,Model model){
        LOG.log(Level.INFO,"deletePaciente");
        pacienteService.deletePaciente(id);
        return "redirect:/paciente/listaPacientes";
    }
}
