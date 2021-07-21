/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();
        
        
        
        PasajeNormal pasajeNormal = new PasajeNormal("Jamil",
                "1532", "Quito", "Zamora", 342, 15, 65);
        
        
        
        PasajeTerceraEdad pasajeTerceraEdad = new PasajeTerceraEdad("Tomas",
                "987654", "Loja", "Cariamanga", 5, 12);

        
        
        PasajeMenorEdad pasajeMenorEdad = new PasajeMenorEdad("Juan", "1123456",
                "Loja", "Catamayo",03, 13, 86);
        
        
        
        PasajeUniversitario pasajeUniversitario = new PasajeUniversitario("Romeo", 
                "12564", "malacatos",
                "Vilcabamba", 16, 9.15, "Nacional");

        
        
        
        pasajes.add(pasajeMenorEdad);
        pasajes.add(pasajeUniversitario);
        pasajes.add(pasajeNormal);
        pasajes.add(pasajeTerceraEdad);
        
        
        
        
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).establecerValPasaje();
        }

        
        
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {
            
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        
        
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
