/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.hashblog.ejemploAnotaciones.clases;

import mx.hashblog.ejemploAnotaciones.anotaciones.Anotacion;

/**
 *
 * @author david
 */
@Anotacion(uso="Clase para datos", orden=1)
public class Datos {
    private Integer campo;
    private String texto;
    private Double decimal;

    /**
     * @return the campo
     */
    public Integer getCampo() {
        return campo;
    }

    /**
     * @param campo the campo to set
     */
    public void setCampo(Integer campo) {
        this.campo = campo;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the decimal
     */
    public Double getDecimal() {
        return decimal;
    }

    /**
     * @param decimal the decimal to set
     */
    public void setDecimal(Double decimal) {
        this.decimal = decimal;
    }
}
