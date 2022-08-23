package mx.edu.iebem.ahorrro.ahorro.repositories;

import org.springframework.stereotype.Repository;

import mx.edu.iebem.ahorrro.ahorro.model.Ahorromodel;

@Repository
public interface AhorroRepositories {
     public Integer insertInfo(Ahorromodel ahorro);
}
