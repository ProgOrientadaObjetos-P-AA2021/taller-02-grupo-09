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
public class PasajeTerceraEdad extends PasajeInterCantonal {
    
    public PasajeTerceraEdad(String nombre, String cedula, String origen, String distancia, 
            double distanciakm, double tarifa) {
        super(nombre, cedula, origen, distancia, distanciakm, tarifa);
    }
    
    
    
    

    @Override
    public void establecerValPasaje() {
        valorPasaje = ((distanciaKM * 0.5) + (tarifaBase/2));
    }
    
    
    
    
    
    @Override
    public String toString() {
        String cadena =  String.format("%s\nValor del pasaje: %.2f\n", 
                super.toString(), 
                obtenerValPasaje());
        return cadena;
        
    }
    
}
