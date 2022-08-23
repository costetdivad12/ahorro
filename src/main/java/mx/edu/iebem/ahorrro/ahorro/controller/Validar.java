package mx.edu.iebem.ahorrro.ahorro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ValidarModel>  getValidarCorreo(@PathVariable("correo") String correo){
         System.out.println(" metodo correo " + correo);
         return new ResponseEntity<>(service.getValidarCorreo(correo),HttpStatus.OK);
    }
    
}
