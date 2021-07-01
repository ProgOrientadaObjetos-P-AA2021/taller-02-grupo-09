package paquete2;

import java.io.Serializable;

/**
 *
 * @author Jose Cordova, Jamil Sebastian
 */
public class PasajeUniversitario extends PasajeInterCantonal {
    
    protected String nombreU;

    public PasajeUniversitario(String nombreU, String nombre, String ciudad, String cedula, String origen, String destino, double km, double tarifaBase) {
        super(nombre, ciudad, cedula, origen, destino, km, tarifaBase);
        this.nombreU = nombreU;
        setValorPasaje();
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }
    
    @Override
    public void setValorPasaje() {
        this.valorPasaje = (tarifaBase/ 2) ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tTranporte Universitario\n"
                + "Nombre Universidad"
                + "Nombre = %s\n"
                + "Ciudad = %s\n"
                + "Cedula = %s\n"
                + "Origen = %s\n"
                + "Destino = %s\n"
                + "Numero de Km = %.2f\n"
                + "Tarifa Bases = %.2f\n"
                + "Valor del Pasaje = %.2f\n"
                + "Porcetanje Adicional = %.2f\n",
                getNombreU(),
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
