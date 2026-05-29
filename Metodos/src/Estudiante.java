public class Estudiante {
    private String nombre;
    private String dni;
    private double promedio;

    public Estudiante(String nombre, String dni, double promedio) {
        this.nombre = nombre;
        this.dni = dni;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getDni() {
        return dni;
    }

    public void mostrarFicha() {
        System.out.println("nombre:" + nombre);
        System.out.println("dni:" + dni);
        System.out.println("promedio:" + promedio);
    }

}
