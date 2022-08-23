package mx.edu.iebem.ahorrro.ahorro.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Component;

import mx.edu.iebem.ahorrro.ahorro.model.ValidarModel;

@Component
public class ValidarMapper implements RowMapper<ValidarModel> {
    @Override
    public ValidarModel mapRow(ResultSet arg0, int arg1) throws SQLException {

        ValidarModel validar = new ValidarModel();
        validar.setCorreo(arg0.getString(1));
        validar.setValidar(arg0.getBoolean(2));
        validar.setRfc(arg0.getString(3));
        validar.setCurp(arg0.getString(4));
        validar.setNombre(arg0.getString(5));
        validar.setTelefono(arg0.getString(6));
        return validar;
    }
}
