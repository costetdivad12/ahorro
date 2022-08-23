package mx.edu.iebem.ahorrro.ahorro.model;

import org.springframework.web.multipart.MultipartFile;

public class AhorroPdfModel {
    private String ine_ruta;
    private String comprobante_ruta;
    private String curp_ruta;
    private String nombramiento_ruta;
    private String afore_ruta;
    private String historia_ruta;
    private MultipartFile ine;
    private MultipartFile comprobante;
    private MultipartFile curps;
    private MultipartFile nombramiento;
    private MultipartFile afore;
    private MultipartFile historia;
    private String rfc;


    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }



    public MultipartFile getAfore() {
        return this.afore;
    }

    public void setAfore(MultipartFile afore) {
        this.afore = afore;
    }

    public MultipartFile getHistoria() {
        return this.historia;
    }

    public void setHistoria(MultipartFile historia) {
        this.historia = historia;
    }

    public String getIne_ruta() {
        return this.ine_ruta;
    }

    public void setIne_ruta(String ine_ruta) {
        this.ine_ruta = ine_ruta;
    }

    public String getComprobante_ruta() {
        return this.comprobante_ruta;
    }

    public void setComprobante_ruta(String comprobante_ruta) {
        this.comprobante_ruta = comprobante_ruta;
    }

    public String getCurp_ruta() {
        return this.curp_ruta;
    }

    public void setCurp_ruta(String curp_ruta) {
        this.curp_ruta = curp_ruta;
    }

    public String getNombramiento_ruta() {
        return this.nombramiento_ruta;
    }

    public void setNombramiento_ruta(String nombramiento_ruta) {
        this.nombramiento_ruta = nombramiento_ruta;
    }

    public String getAfore_ruta() {
        return this.afore_ruta;
    }

    public void setAfore_ruta(String afore_ruta) {
        this.afore_ruta = afore_ruta;
    }

    public String getHistoria_ruta() {
        return this.historia_ruta;
    }

    public void setHistoria_ruta(String historia_ruta) {
        this.historia_ruta = historia_ruta;
    }

    public MultipartFile getIne() {
        return this.ine;
    }

    public void setIne(MultipartFile ine) {
        this.ine = ine;
    }

    public MultipartFile getComprobante() {
        return this.comprobante;
    }

    public void setComprobante(MultipartFile comprobante) {
        this.comprobante = comprobante;
    }

    public MultipartFile getCurps() {
        return this.curps;
    }

    public void setCurps(MultipartFile curps) {
        this.curps = curps;
    }

    public MultipartFile getNombramiento() {
        return this.nombramiento;
    }

    public void setNombramiento(MultipartFile nombramiento) {
        this.nombramiento = nombramiento;
    }
    
}
