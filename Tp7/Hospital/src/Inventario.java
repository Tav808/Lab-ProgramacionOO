public class Inventario {
    private Paciente[] listaPacientes;

    public Inventario(Paciente[] productos) {
        this.listaPacientes = productos;
    }

    public void listarPacientes() {
        for (Paciente p : listaPacientes) {
            if (p != null) {
                p.mostrarFicha();
            }
        }
    }

    public void listarPacientes(int indice) {
        if (indice < 0 || indice >= listaPacientes.length) {
            System.out.println("Índice " + indice + " fuera de rango.");
            return;
        }
        Paciente p = listaPacientes[indice];
        System.out.println("=== Paciente en índice " + indice + " ===");
        System.out.println("Nombre : " + p.getNombre());
        System.out.println("Edad   : " + p.getEdad() + " años");
        System.out.println("Estado : " + (p.getEstaHospitalizado() ? "Hospitalizado" : "No hospitalizado"));
    }

    public void mostrarCantidadTotal() {
        System.out.println("Cantidad total de pacientes en inventario: " + listaPacientes.length);
    }
}