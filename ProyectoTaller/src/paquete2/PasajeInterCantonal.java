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
public abstract class PasajeInterCantonal implements Serializable{
    
    
    
    protected String Nombre;
    protected String Cedula;
    protected String Origen;
    protected String Destino;
    protected double distanciaKM;
    protected double tarifaBase;
    protected double valorPasaje;

    
    
    
    public PasajeInterCantonal(String nombre, String cedula, String origen, String distancia,
            double distanciakm, double tarifa) {
        Nombre = nombre;
        Cedula = cedula;
        Origen = origen;
        Destino = distancia;
        distanciaKM = distanciakm;
        tarifaBase = tarifa;   
    }
    
    

    public void establecerNombre(String n) {
        Nombre = n;
    }

    
    
    public void establecerCedula(String n) {
        Cedula = n;
    }

    
    
    public void establecerOrigen(String n) {
        Origen = n;
    }
    
    

    public void establecerDestino(String n) {
        Destino = n;
    }
    
    

    public void establecerDistanciKm(double n) {
        distanciaKM = n;
    }
    
    

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    
    
    public abstract void establecerValPasaje();

    public String obtenerNombre() {
        return Nombre;
    }

    
    
    public String obtenerCedula() {
        return Cedula;
    }

    
    
    public String obtenerOrigen() {
        return Origen;
    }

    
    
    public double obtenerDistanciaKm() {
        return distanciaKM;
    }

    
    
    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    
    
    public double obtenerValPasaje() {
        return valorPasaje;
    }

    
    
    @Override
    public String toString() {
        String cadena = String.format("\nNombre: %s\nCedula: %s\nOrigen: %s\n"
                + "Destino: %s\nDistancia en Km: %.2f\nTarifa Base: %.2f", 
                Nombre, Cedula, Origen, Destino, distanciaKM, tarifaBase);
        return cadena;
    }


}
