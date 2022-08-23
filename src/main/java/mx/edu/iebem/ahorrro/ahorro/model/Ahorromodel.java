package mx.edu.iebem.ahorrro.ahorro.model;

import org.springframework.web.multipart.MultipartFile;

public class Ahorromodel {
    
   private String rfc;
   private String curp;
   private String nombre_completo;
   private String correo_institucional;
   private String clave_presupuestal;
   private String centro_trabajo;
   private String telefono_local;
   private String telefono_cel;
  
   


   
   

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

    public String getNombre_completo() {
        return this.nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo_institucional() {
        return this.correo_institucional;
    }

    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }

    public String getClave_presupuestal() {
        return this.clave_presupuestal;
    }

    public void setClave_presupuestal(String clave_presupuestal) {
        this.clave_presupuestal = clave_presupuestal;
    }

    public String getCentro_trabajo() {
        return this.centro_trabajo;
    }

    public void setCentro_trabajo(String centro_trabajo) {
        this.centro_trabajo = centro_trabajo;
    }

    public String getTelefono_local() {
        return this.telefono_local;
    }

    public void setTelefono_local(String telefono_local) {
        this.telefono_local = telefono_local;
    }

    public String getTelefono_cel() {
        return this.telefono_cel;
    }

    public void setTelefono_cel(String telefono_cel) {
        this.telefono_cel = telefono_cel;
    }

  


}
