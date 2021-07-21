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
public class PasajeNormal extends PasajeInterCantonal 
        implements Serializable{
    
    
    
    
    private double porcentajeAdicional;

    
    
    
    public PasajeNormal(String nombre, String cedula, String origen, String distancia, 
            double distanciakm, double tarifa, double porcentajeadicional) {
        super(nombre, cedula, origen, distancia, distanciakm, tarifa);
        porcentajeAdicional = porcentajeadicional;
    }
    
    
    

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdicional = n;
    }

    
    
    
    @Override
    public void establecerValPasaje() {
        valorPasaje = ((distanciaKM * 0.15) + (tarifaBase
                + (tarifaBase * (porcentajeAdicional / 100))));
    }
    
    
    
    
    public double obtenerPorcentajeAdiconal() {
        return porcentajeAdicional;
    }

    
    
    
    @Override
    public String toString() {
        String cadena = String.format("%s\nPorcentaje Adicional: %s\n"
                + "Valor del pasaje: %.2f\n",super.toString(), 
                porcentajeAdicional, valorPasaje);
        return cadena;
    }
}
