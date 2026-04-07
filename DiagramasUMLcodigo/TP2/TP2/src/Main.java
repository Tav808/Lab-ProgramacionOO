public class Main {
    public static void main(String[] args) {
        Socios socio1 = new Socios("Juan Perez", 101);
        Socios socio2 = new Socios("Maria Garcia", 102);
        Socios socio3 = new Socios("Carlos Lopez", 103);

        for (int i = 1; i <= 5; i++) {
            socio1.agregarLibro(new Libros(1000 + i, "Libro A" + i));
            socio2.agregarLibro(new Libros(2000 + i, "Libro B" + i));
            socio3.agregarLibro(new Libros(3000 + i, "Libro C" + i));
        }

        System.out.println("Resultados de los socios y sus libros:");
        socio1.Mostrar();
        socio2.Mostrar();
        socio3.Mostrar();
    }
}
