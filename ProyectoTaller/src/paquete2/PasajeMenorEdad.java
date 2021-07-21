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
    
    private double Porcentaje;

    
    
    
    
    public PasajeMenorEdad(String nombre, String cedula, String origen, String distancia,
            double distanciakm, double tarifa, double porcentaje) {
        super(nombre, cedula, origen, distancia, distanciakm, tarifa);
        Porcentaje = porcentaje;
    }

    
    
    
    
    public void establecerPorcentaje(double n) {
        Porcentaje = n;
    }

    
    
    
    
    @Override
    public void establecerValPasaje() {
        valorPasaje = (distanciaKM * 0.15) + (tarifaBase * (Porcentaje / 100));
    }

    
    
    
    public double obtenerPorcentaje() {
        return Porcentaje;
    }
    
    
    
    
    
    @Override
    public String toString() {
        String cadena =  String.format("%s\nValor del pasaje: %.2f\n", 
                super.toString(), 
                obtenerValPasaje());
        return cadena;
        
    }
    
}
