package mx.edu.iebem.ahorrro.ahorro.repositories;

import org.springframework.stereotype.Repository;

import mx.edu.iebem.ahorrro.ahorro.model.ValidarModel;

@Repository
public interface ValidarRepositories {
    
    public ValidarModel getValidarCorreo(String correo);
}
