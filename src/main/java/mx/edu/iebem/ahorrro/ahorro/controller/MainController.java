package mx.edu.iebem.ahorrro.ahorro.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping
    public ResponseEntity<Map<String,Object>> getInfoApp() {
        Map<String, Object> infoApp = new HashMap<>();
        infoApp.put("app", "Ahorro Solidario");
        infoApp.put("version", "v0.0.1");
        infoApp.put("domain", "iebem");
        infoApp.put("description", "Tramite 5L ahorro solidario");
        return new ResponseEntity<Map<String,Object>>(infoApp, HttpStatus.OK);
    } 
}
