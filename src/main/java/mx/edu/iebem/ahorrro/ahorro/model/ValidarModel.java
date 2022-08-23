package mx.edu.iebem.ahorrro.ahorro.model;

public class ValidarModel {
    private String correo;
    private boolean validar;
    private String rfc;
    private String curp;
    private String nombre;
    private String telefono;



    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return this.curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
   

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isValidar() {
        return this.validar;
    }

    public boolean getValidar() {
        return this.validar;
    }

    public void setValidar(boolean validar) {
        this.validar = validar;
    }
    

}
