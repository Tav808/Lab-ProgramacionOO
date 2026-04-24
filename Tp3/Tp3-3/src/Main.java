public class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Juan Perez", 101);
        Vendedor v2 = new Vendedor("Maria Garcia", 102);
        Vendedor v3 = new Vendedor("Carlos Lopez", 103);

        v1.agregarVehiculo(new Auto("Toyota Corolla", 111));
        v1.agregarVehiculo(new Moto("Honda CB500", 222));
        v1.agregarVehiculo(new Auto("Ford Focus", 333));
        v1.agregarVehiculo(new Moto("Yamaha MT-07", 444));

        v2.agregarVehiculo(new Auto("VW Golf", 555));
        v2.agregarVehiculo(new Moto("Kawasaki Z900", 666));
        v2.agregarVehiculo(new Auto("Fiat Cronos", 777));

        v3.agregarVehiculo(new Moto("BMW R1250", 888));
        v3.agregarVehiculo(new Auto("Chevrolet Onix", 999));
        v3.agregarVehiculo(new Auto("Renault Sandero", 100));

        System.out.println("--- Gestión de Vehículos por Vendedor ---");
        v1.Mostrar();
        v2.Mostrar();
        v3.Mostrar();
    }
}
