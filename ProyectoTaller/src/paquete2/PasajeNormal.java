package paquete2;

import java.io.Serializable;

/**
 *
 * @author Jose Cordova, Jamil Sebastian
 */
public class PasajeNormal extends PasajeInterCantonal 
        implements Serializable{
    
    protected double porcentajeAd;

    public PasajeNormal(String nombre, String ciudad, String cedula, String origen, String destino, double km, double tarifaBase, double porcentaje) {
        super(nombre, ciudad, cedula, origen, destino, km, tarifaBase);
        this.porcentajeAd = porcentaje;
        setValorPasaje();
    }

    public double getPorcentajeAd() {
        return porcentajeAd;
    }

    public void setPorcentajeAd(double porcentaje) {
        this.porcentajeAd = porcentaje;
    }
    
    @Override
    public void setValorPasaje() {
        this.valorPasaje = (km * 0.15) + (tarifaBase + ((tarifaBase)* (porcentajeAd / 100))) ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tTranporte Menor Edad\n"
                + "Nombre = %s\n"
                + "Ciudad = %s\n"
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
                getPorcentajeAd());

        return cadena;
    }
}
