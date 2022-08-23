package mx.edu.iebem.ahorrro.ahorro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import mx.edu.iebem.ahorrro.ahorro.mapper.ValidarMapper;
import mx.edu.iebem.ahorrro.ahorro.model.ValidarModel;

@Service
public class ValidarService {
    @Autowired
    private JdbcTemplate jdbc;

    @Autowired
    private ValidarMapper mapper;


    public ValidarModel getValidarCorreo(String correo) {
        final String sql = "select correo,1,rfc,curp,CONCAT(paterno,' ',materno,' ',nombre) as nombre_completo,telefono from [172.16.20.7].Recibos.dbo.oficina_virtual where correo=?";
        // curp_mapper mapper =new curp_mapper();
        // jdbc.query(sql, mapper, new Object[]{});
        // idalumno_mapper mapper = new idalumno_mapper();
        ValidarModel re = jdbc.queryForObject(sql, mapper, new Object[] { correo });
        System.out.println(re);
        return re;
    }
}
