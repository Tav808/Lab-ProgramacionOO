import java.util.ArrayList;
import java.util.List;

public class Vendedor {

    protected String nombre;
    protected int NumeroVendedor;
    protected List<Vehiculo> VehiculosCargo;

    public Vendedor(String nombre, int NumeroVendedor) {
        this.nombre = nombre;
        this.NumeroVendedor = NumeroVendedor;
        this.VehiculosCargo = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (VehiculosCargo.size() < 10) {
            VehiculosCargo.add(vehiculo);
        } else {
            System.out.println(nombre + " ya tiene 10 vehiculos a su cargo.");
        }
    }

    public void Mostrar() {
        System.out.println("\n Vendedor: " + nombre + " [ID: " + NumeroVendedor + "] - \nVehiculos: ");
        for (Vehiculo vehiculo : VehiculosCargo) {
            vehiculo.Mostrar();
        }
    }
}
