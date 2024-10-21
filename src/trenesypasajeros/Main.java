package trenesypasajeros;

public class Main {

    public static void main(String[] args) {
        Pasajero p0 = new Pasajero();
        Pasajero p1 = new Pasajero("Pratto");
        Pasajero p2 = new Pasajero("Quintero", "Juanfer");
        Pasajero p3 = new Pasajero("Pratto", "Oso", Rangos.MAQUINISTA);
        Pasajero p4 = new Pasajero();
        Pasajero p5 = new Pasajero("Martinez", "Pity", Rangos.COCINERO);
        Pasajero p6 = new Pasajero("Martinez", "Pity", Rangos.CLIENTE);
        String p7 = "pasajero7";
        boolean sonIguales = Pasajero.sonIguales(p0, p4);
        if (sonIguales) {
            System.out.println("Los pasajeros 0 y 4, son iguales");
            System.out.println(p0.toString());
        }
        sonIguales = p4.equals(p0);
        if (sonIguales) {
            System.out.println("Los pasajeros 0 y 4, son iguales");
            System.out.println(p4.toString());
        }
        if (p1.equals(p3)) {
            System.out.println("Los pasajeros 1 y 3, son iguales");
            System.out.println(p1.toString());
            System.out.println();
        }
        if (!Pasajero.sonIguales(p5, p6)) {
            System.out.println("Los pasajeros 5 y 6, NO son iguales");
        }
        if (!p2.equals(p7)) {
            System.out.println("Los pasajeros 2 y 7, NO son iguales");
        }
        System.out.println("Codigo hash pasajero 5: " + p5.hashCode());
        System.out.println("Codigo hash pasajero 6: " + p6.hashCode());
        System.out.println();
        TrenElectrico te = new TrenElectrico(4, "Constitucion");
        TrenBala tb = new TrenBala(5, "Rosario", 350);
        te.agregar(p0);
        te.agregar(p1);

        //REPETIDO
        te.agregar(p4);
        te.agregar(p2);
        te.agregar(p3);
        // NO HAY LUGAR
        te.agregar(p5);
        System.out.println();
        // SE MUESTRA TREN ELECTRICO
        System.out.println(te);
        tb.getCantidadMaximaPasajeros();
        tb.getDestino();
        tb.agregar(p6);
        tb.agregar(p5);
        if (Tren.sonIguales(p6, tb)) {
            System.out.println(p6);
        }
        // SE MUESTRA TREN BALA
        System.out.println(tb);
    }
}
