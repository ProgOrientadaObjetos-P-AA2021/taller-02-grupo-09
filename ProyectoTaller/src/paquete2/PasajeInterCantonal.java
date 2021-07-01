package paquete2;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author reroes
 */
public abstract class PasajeInterCantonal implements Serializable{
    
    protected String nombre;
    protected String ciudad;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected double km;
    protected double tarifaBase;
    protected double valorPasaje;

    public PasajeInterCantonal(String nombre, String ciudad, String cedula, String origen, String destino, double km, double tarifaBase) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.cedula = cedula;
        this.origen = origen;
        this.destino = destino;
        this.km = km;
        this.tarifaBase = tarifaBase;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public abstract void setValorPasaje();
        
    
    @Override
    public String toString(){
        return String.format("Pasaje.");
    }
    
    
}
