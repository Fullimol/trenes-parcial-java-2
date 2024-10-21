package trenesypasajeros;

import java.util.ArrayList;

public class TrenElectrico extends Tren {

    //atriburos
    protected ArrayList<Pasajero> pasajeros;

    //contrsuctor
    public TrenElectrico(int cantidadMaximaPasajeros, String destino) {
        super(cantidadMaximaPasajeros, destino);
        this.pasajeros = new ArrayList<>(); //esto hace referencia a la lista de ESA INSTANCIA del tren.
    }

    //metodos
    @Override
    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    @Override
    public String getTipoDeTren() {
        return "Tren Electrico";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" | tipo: ").append(getTipoDeTren())
                .append(" | pasajeros: ").append(pasajeros);
        return sb.toString();
    }

}