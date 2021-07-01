/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeMenorEdad extends PasajeInterCantonal 
        implements Serializable{
    
    private double porcentajeAd;
    
    public PasajeMenorEdad(double porcentajeAd, String nombre, String ciudad, String cedula, String origen, String destino, double km, double tarifaBase, double valorPasaje) {
        super(nombre, ciudad, cedula, origen, destino, km, tarifaBase, valorPasaje);
        this.porcentajeAd = porcentajeAd;
        setValorPasaje();
    }

    public double getPorcentajeAd() {
        return porcentajeAd;
    }

    public void setPorcentajeAd(double porcentajeAd) {
        this.porcentajeAd = porcentajeAd;
    }
    
    @Override
    public void setValorPasaje() {
        this.valorPasaje = (km * 0.15) + (tarifaBase + (tarifaBase*(porcentajeAd/100))));
    }
    
}
