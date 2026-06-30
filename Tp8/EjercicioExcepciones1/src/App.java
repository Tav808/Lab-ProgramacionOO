import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mundial mundial = new Mundial();

        Seleccion argentina = new Seleccion("Argentina", "America", 12, 26, true);
        DirectorTecnico dtArgentina = new DirectorTecnico("Lionel Scaloni", "Argentina", 46);
        argentina.setDirectorTecnico(dtArgentina);

        Seleccion brasil = new Seleccion("Brasil", "America", 10, 9, true);

        mundial.agregarSeleccion(argentina);
        mundial.agregarSeleccion(brasil);

        Seleccion consultada = mundial.consultarSeleccion(5);
        if (consultada != null) {
            System.out.println("Seleccion encontrada: " + consultada.getNombre());
        }

        System.out.println("Posicion 0: " + mundial.getSelecciones().get(0).getNombre());
        mundial.actualizarPuntos(0, sc);

        mundial.consultarDirectorTecnico(0);
        mundial.consultarDirectorTecnico(1);

        try {
            brasil.validarJugadoresConvocados();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Validacion de jugadores convocados finalizada");
        }

        try {
            brasil.validarParaDisputarPartido();
            System.out.println("La seleccion puede disputar el partido");

        } catch (JugadoresInsuficientesException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Fin del programa");
        }

        sc.close();
    }
}
