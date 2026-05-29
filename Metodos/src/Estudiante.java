public class Estudiante {
    private String nombre;
    private int dni;
    private double promedio;

    public Estudiante(String nombre, int dni, double promedio) {
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

    public int getDni() {
        return dni;
    }

    public void mostrarFicha() {
        System.out.println("nombre:" + nombre);
        System.out.println("dni:" + dni);
        System.out.println("promedio:" + promedio);
    }

}
