import java.util.ArrayList;
import java.util.Scanner;

public class Mundial {

    private ArrayList<Seleccion> selecciones;

    public Mundial() {
        this.selecciones = new ArrayList<Seleccion>();
    }

    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }

    public void agregarSeleccion(Seleccion s) {
        this.selecciones.add(s);
    }

    public Seleccion consultarSeleccion(int posicion) {
        try {
            return this.selecciones.get(posicion);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe una seleccion en la posicion " + posicion);
            return null;
        }
    }

    public void actualizarPuntos(int posicion, Scanner sc) {
        try {
            Seleccion s = this.selecciones.get(posicion);

            System.out.println("Ingrese la cantidad de puntos a actualizar: ");
            int puntos = Integer.parseInt(sc.nextLine());

            s.setPuntos(puntos);
            System.out.println("Puntos actualizados correctamente");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe una seleccion en la posicion " + posicion);

        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es numerico");

        } finally {
            System.out.println("Operacion de actualizacion de puntos finalizada");
        }
    }

    public void consultarDirectorTecnico(int posicion) {
        try {
            Seleccion s = this.selecciones.get(posicion);

            System.out.println("DT: " + s.getDirectorTecnico().getNombre());
            System.out.println("Nacionalidad: " + s.getDirectorTecnico().getNacionalidad());
            System.out.println("Edad: " + s.getDirectorTecnico().getEdad());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe una seleccion en la posicion " + posicion);

        } catch (NullPointerException e) {
            System.out.println("La seleccion no posee Director Tecnico asignado");
        }
    }

}
