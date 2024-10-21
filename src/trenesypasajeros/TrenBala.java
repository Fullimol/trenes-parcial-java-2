package trenesypasajeros;

import java.util.ArrayList;

public class TrenBala extends Tren {

    //atributos
    private int cantidadElectroimanes;
    private ArrayList<Pasajero> pasajeros;

    //constructor
    public TrenBala(int cantidadMaximaPasajeros, String destino, int cantidadElectroimanes) {
        super(cantidadMaximaPasajeros, destino);
        this.cantidadElectroimanes = cantidadElectroimanes;
        this.pasajeros = new ArrayList<>(); //esto hace referencia a la lista de ESA INSTANCIA del tren.
    }

    //metodos
    @Override
    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    @Override
    public String getTipoDeTren() {
        return "Tren Bala";
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" | tipo: ").append(getTipoDeTren())
          .append(" | cantidadElectroimanes: ").append(cantidadElectroimanes)
          .append(" | pasajeros:").append(pasajeros);
        return sb.toString();
    }
}
