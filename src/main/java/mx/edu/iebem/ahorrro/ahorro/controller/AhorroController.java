package mx.edu.iebem.ahorrro.ahorro.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class AhorroController {
    @RequestMapping("/ahorro")
    public String   getInsertAhorro(){
        System.out.println("Metodo ahorro");
        return  "ok";
   }
}
