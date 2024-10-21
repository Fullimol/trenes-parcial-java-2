package trenesypasajeros;

import java.util.ArrayList;

public abstract class Tren {

    //atributos
    private int cantidadMaximaPasajeros;
    private String destino;
    private boolean motorEncendido;

    //constructor
    public Tren(int cantidadMaximaPasajeros, String destino) {
        this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
        this.destino = destino;
    }

    //metodos
    public abstract String getTipoDeTren();

    public abstract ArrayList<Pasajero> getPasajeros();

    /*
    retornará true, si el pasajero (primer parámetro) se encuentra en el tren (segundo parámetro), false,
    caso contrario.
     */
    public static boolean sonIguales(Pasajero pasajero, Tren tren) {
        for (Pasajero pasajeroEnTren : tren.getPasajeros()) {
            if (pasajero.equals(pasajeroEnTren)) {
                return true;
            }
        }
        return false;
    }

    public void agregar(Pasajero pasajero) {
        ArrayList<Pasajero> pasajeros = getPasajeros();
        if (pasajeros.size() >= cantidadMaximaPasajeros) {
            System.out.println("Tren completo!!");
            return;
        }
        if (pasajeros.contains(pasajero)) {
            System.out.println("El pasajero ya esta en el tren.");
            return;
        }
        pasajeros.add(pasajero);
    }
    
    @Override
    public String toString() {
        String mensaje = "cant pasajeros: " + cantidadMaximaPasajeros + " | Destino: " + 
                destino + " | MotorEncendido: " + motorEncendido;
        return mensaje;
    }

    //getters y setters
    public int getCantidadMaximaPasajeros() {
        return cantidadMaximaPasajeros;
    }

    public String getDestino() {
        return destino.toUpperCase();
    }

    public boolean getMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
}
