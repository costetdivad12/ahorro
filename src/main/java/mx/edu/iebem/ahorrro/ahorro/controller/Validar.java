package mx.edu.iebem.ahorrro.ahorro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.iebem.ahorrro.ahorro.model.ValidarModel;
import mx.edu.iebem.ahorrro.ahorro.services.ValidarService;

@CrossOrigin
@RestController
@RequestMapping("/Validar")
public class Validar {
    @Autowired private ValidarService service;

    @GetMapping("/{correo}")
    public ValidarModel  getValidarCorreo(@PathVariable("correo") String correo){
         System.out.println(" metodo correo " + correo);
         return service.getValidarCorreo(correo);
    }
    
}
