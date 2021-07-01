package paquete2;

import java.io.Serializable;

/**
 *
 * @author Jose Cordova, Jamil Sebastian
 */
public class PasajeMenorEdad extends PasajeInterCantonal 
        implements Serializable{
    
    private double descuento;
    
    public PasajeMenorEdad(String nombre, String ciudad, String cedula, String origen, String destino, double km, double tarifaBase, double porcentajeAd) {
        super(nombre, ciudad, cedula, origen, destino, km, tarifaBase);
        this.descuento = porcentajeAd;
        setValorPasaje();
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double porcentajeAd) {
        this.descuento = porcentajeAd;
    }
    
    @Override
    public void setValorPasaje() {
        this.valorPasaje = (km * 0.10) + (tarifaBase - ((tarifaBase)* (descuento / 100))) ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tTranporte Normal\n"
                + "Nombre = %s\n"
                + "Cedula = %s\n"
                + "Origen = %s\n"
                + "Destino = %s\n"
                + "Numero de Km = %.2f\n"
                + "Tarifa Bases = %.2f\n"
                + "Valor del Pasaje = %.2f\n"
                + "Porcetanje Adicional = %.2f\n",
                getNombre(),
                getCiudad(),
                getCedula(),
                getOrigen(),
                getDestino(),
                getKm(),
                getTarifaBase(),
                getValorPasaje(),
                getDescuento());

        return cadena;
    }
    
}
