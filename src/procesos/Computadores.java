/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

/**
 *
 * @author Jhon
 */
public class Computadores {
    
    private String placa;
    private String marcaModelo;
    private String tipo;
    private String procesador;
    private String placaBase;
    private String memoriaRam;
    private String discoDuro;
    private String sistemaOperativo;
    private String office;
    private String antivirus;
    private String responsable;
    private String ubicacion;
    private String observaciones;
    private boolean inactivo;

    public Computadores() {
    }

    public Computadores(String placa, String marcaModelo, String tipo, String procesador, String placaBase, String memoriaRam, String discoDuro, String sistemaOperativo, String office, String antivirus, String responsable, String ubicacion, String observaciones, boolean inactivo) {
        this.placa = placa;
        this.marcaModelo = marcaModelo;
        this.tipo = tipo;
        this.procesador = procesador;
        this.placaBase = placaBase;
        this.memoriaRam = memoriaRam;
        this.discoDuro = discoDuro;
        this.sistemaOperativo = sistemaOperativo;
        this.office = office;
        this.antivirus = antivirus;
        this.responsable = responsable;
        this.ubicacion = ubicacion;
        this.observaciones = observaciones;
        this.inactivo = inactivo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(String placaBase) {
        this.placaBase = placaBase;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getAntivirus() {
        return antivirus;
    }

    public void setAntivirus(String antivirus) {
        this.antivirus = antivirus;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isInactivo() {
        return inactivo;
    }

    public void setInactivo(boolean inactivo) {
        this.inactivo = inactivo;
    }
}
