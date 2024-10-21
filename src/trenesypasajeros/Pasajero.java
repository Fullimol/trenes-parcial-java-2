package trenesypasajeros;

import java.util.Objects;

public class Pasajero {

    //Atributos:
    private String apellido;
    private String nombre;
    private Rangos rango;

    //constructores
    public Pasajero() {
        this.apellido = "Sin apellido";
        this.nombre = "Sin nombre";
        this.rango = rango.CLIENTE;
    }

    public Pasajero(String apellido) {
        this.apellido = apellido;
        this.nombre = "Sin nombre";
        this.rango = rango.CLIENTE;
    }

    public Pasajero(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.rango = rango.CLIENTE;
    }

    public Pasajero(String apellido, String nombre, Rangos rango) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.rango = rango;
    }

    //metodos
    /*
    Agregar el método público y de clase sonIguales(Pasajero, Pasajero), retorna
    true, si los pasajeros tienen el mismo nombre, apellido y rango, false, caso
    contrario.
     */
    public static boolean sonIguales(Pasajero p1, Pasajero p2) {
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1.nombre.equals(p2.nombre) && p1.apellido.equals(p2.apellido) && p1.rango == p2.rango;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pasajero [apellido=").append(apellido)
                .append(", nombre=").append(nombre)
                .append(", rango=").append(rango)
                .append("]");
        return sb.toString();
    }
    
    
    // Compara los objetos Pasajero basándose en nombre y apellido.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pasajero pasajero = (Pasajero) obj;
        return nombre.equals(pasajero.nombre) && apellido.equals(pasajero.apellido);
    }
    
    
    //Sobrescribe hashCode para retornar el valor del hashCode del resultado del método toString() utilizando Objects.hashCode().
    @Override
    public int hashCode() {
        return Objects.hashCode(toString());
    }
}
