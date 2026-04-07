public class Main {
    public static void main(String[] args) throws Exception {
        Perros perroCompartido = new Perros("Olivia", 5);

        Gatos gato1 = new Gatos("Kinoto", 3);
        Gatos gato2 = new Gatos("Torbie", 5);
        Gatos gato3 = new Gatos("Morito", 2);
        Perros perro1 = new Perros("Greco", 2);
        Perros perro2 = new Perros("Loki", 4);
        Perros perro3 = new Perros("Toto", 6);

        Veterinarios vet1 = new Veterinarios("Dr. Pepper", 1);
        Veterinarios vet2 = new Veterinarios("Dr. Mirinda", 2);
        Veterinarios vet3 = new Veterinarios("Dr. Schweepes", 3);

        vet1.agregarAnimal(perroCompartido);
        vet1.agregarAnimal(gato1);
        vet1.agregarAnimal(perro1);

        vet2.agregarAnimal(perroCompartido);
        vet2.agregarAnimal(gato2);
        vet2.agregarAnimal(perro2);

        vet3.agregarAnimal(perroCompartido);
        vet3.agregarAnimal(gato3);
        vet3.agregarAnimal(perro3);

        vet1.Mostrar();
        vet2.Mostrar();
        vet3.Mostrar();
    }
}
