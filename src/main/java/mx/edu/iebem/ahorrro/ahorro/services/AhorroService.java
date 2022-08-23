package mx.edu.iebem.ahorrro.ahorro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AhorroService {
    @Autowired
    private JdbcTemplate jdbc;
    
    
}
