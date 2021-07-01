package paquete2;

import java.io.Serializable;

/**
 *
 * @author Jose Cordova, Jamil Sebastian
 */
public class PasajeTerceraEdad extends PasajeInterCantonal {

    public PasajeTerceraEdad(String nombre, String ciudad, String cedula, String origen, String destino, double km, double tarifaBase) {
        super(nombre, ciudad, cedula, origen, destino, km, tarifaBase);
        setValorPasaje();
    }

    @Override
    public void setValorPasaje() {
        this.valorPasaje = (km * 0.5) + (tarifaBase/ 2) ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tTranporte Tercera Edad\n"
                + "Nombre = %s\n"
                + "Ciudad = %s\n"
                + "Cedula = %s\n"
                + "Origen = %s\n"
                + "Destino = %s\n"
                + "Numero de Km = %.2f\n"
                + "Tarifa Bases = %.2f\n"
                + "Valor del Pasaje = %.2f\n",
                getNombre(),
                getCiudad(),
                getCedula(),
                getOrigen(),
                getDestino(),
                getKm(),
                getTarifaBase(),
                getValorPasaje());

        return cadena;
    }
        
}
