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
        
        PasajeNormal pn = new PasajeNormal("Jose","Loja", "199304", "Loja",
                "Quito", 150.2 , 50.25, 8.00);
                
        PasajeMenorEdad me = new PasajeMenorEdad ("Daniel","Machala", "66043", "Cuenca",
                "Loja", 300.00, 75.20, 9.00 );       
        
        PasajeTerceraEdad te = new PasajeTerceraEdad("Juan","Zaraguro", "87743", "Loja",
                "GYE", 902.50, 45.70);    
        
        PasajeUniversitario pu = new PasajeUniversitario("UTPL", "Jamil","Vilca","98474", "Vilca",
                "Loja", 90.5, 15.90);    
        
        pasajes.add(pn);
        pasajes.add(me);
        pasajes.add(te);
        pasajes.add(pu);
        
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
