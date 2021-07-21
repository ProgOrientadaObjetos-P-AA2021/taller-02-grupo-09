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
public class PasajeUniversitario extends PasajeInterCantonal {
    
    
    
    private String nombreUniversidad;

    
    
    public PasajeUniversitario(String nombre, String cedula, String origen, String distancia, 
            double distanciakm, double tarifa, String nombreuniversidad) {
        super(nombre, cedula, origen, distancia, distanciakm, tarifa);
        nombreUniversidad = nombreuniversidad;
    }

    
    
    public void establecerNombreUni(String n) {
        nombreUniversidad = n;
    }

    
    
    @Override
    public void establecerValPasaje() {
        valorPasaje = tarifaBase / 2;

    }

    
    
    public String obtenerNombreUni() {
        return nombreUniversidad;
    }
    
    
    
    @Override
    public String toString(){
        String cadena = String.format("%s\nNombre de la Universidad: %s\n"
                + "Valor del pasaje: %.2f\n",super.toString(), 
                nombreUniversidad,valorPasaje);
        
        return cadena;
    }
    
    
}
