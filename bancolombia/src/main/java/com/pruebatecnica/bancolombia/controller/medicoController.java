package com.pruebatecnica.bancolombia.controller;

import com.pruebatecnica.bancolombia.entities.medico;
import com.pruebatecnica.bancolombia.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class medicoController {

    @Autowired
    private IMedicoService medicoService;


    private final Logger LOG = Logger.getLogger(""+medicoController.class);

    @GetMapping("/medico/listaMedicos")
    public String getListaMedico(Model model){
        LOG.log(Level.INFO, "getListaMedico");
        List<medico> medicos = medicoService.findAll();
        List<medico> listMedico = new ArrayList<>();
        for (int i = 0; i < medicos.size() ; i++) {
            if(!medicos.get(i).getNombre().equals("Diego")){
                listMedico.add(medicos.get(i));
            }
        }
        model.addAttribute("medicosGet", listMedico);
        return "medico/listaMedicos";
    }
    @GetMapping("/medico/modificarMedico")
    public String createMedico(Model createModel){
        LOG.log(Level.INFO,"createMedico");
        medico medicoNuevo = new medico();
        createModel.addAttribute("editarMedico",medicoNuevo);
        return "medico/modificarMedico";
    }
    @PostMapping("/guardarMedico")
    public String guardarMedico(medico guardarMedico, Errors errores){
        LOG.log(Level.INFO,"guardarMedico");
        guardarMedico = medicoService.createMedico(guardarMedico);
        return "redirect:/medico/listaMedicos";
    }

    @RequestMapping(value = "/editarMedico/{id}",method = RequestMethod.GET)
    public String editMedico(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO,"editMedico");
        medico medico = medicoService.findById(id);
        model.addAttribute("editarMedico",medico);
        return "medico/modificarMedico";
    }

    @RequestMapping(value = "/eliminarMedico/{id}",method = RequestMethod.GET)
    public String deleteMedico(@PathVariable("id")long id,Model model){
        LOG.log(Level.INFO,"deleteMedico");
        medicoService.deleteMedico(id);
        return "redirect:/medico/listaMedicos";
    }
}
