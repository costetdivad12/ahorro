package mx.edu.iebem.ahorrro.ahorro.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import mx.edu.iebem.ahorrro.ahorro.model.AhorroPdfModel;
import mx.edu.iebem.ahorrro.ahorro.model.Ahorromodel;
import mx.edu.iebem.ahorrro.ahorro.services.AhorroService;

@CrossOrigin
@RestController
@RequestMapping("/ahorro")
public class AhorroController {
    
     @Autowired private AhorroService service;
     
    
     @PostMapping("/Guardar")
    public ResponseEntity<Void>   getInsertAhorro(@RequestBody Ahorromodel parametros) {
     
          
            service.insertInfo(parametros);

            return new ResponseEntity<>(HttpStatus.CREATED);
      }
   @PostMapping("/GuardarPDF")
   public ResponseEntity<String>   getInsertAhorroPDF(@ModelAttribute AhorroPdfModel ahorro) throws IOException{
          service.GuardarPDFS(ahorro.getRfc(), ahorro.getIne(), ahorro.getComprobante(), ahorro.getCurps(), ahorro.getNombramiento(), ahorro.getAfore(), ahorro.getHistoria());

   return  new ResponseEntity<>("Successfully uploaded!", HttpStatus.OK);
  }
}
