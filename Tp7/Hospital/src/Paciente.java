
public class Paciente {
    private String nombre;
    private String dni;
    private int edad;
    private double peso;
    private boolean estaHospitalizado;

    public Paciente(String nombre, String dni, int edad, double peso, boolean estaHospitalizado) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHospitalizado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getEstaHospitalizado() {
        return estaHospitalizado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEstaHospitalizado(boolean estaHospitalizado) {
        this.estaHospitalizado = estaHospitalizado;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + " | DNI: " + dni + " | Edad: " + edad + " | Peso: " + peso
                + " | Esta hospitalizado: " + estaHospitalizado);
    }

}
