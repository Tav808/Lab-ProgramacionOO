public class App {
    public static void main(String[] args) {

        String[][] datos = {
                // Argentina
                { "Emiliano Martinez", "Arquero", "33", "Aston Villa", "true" },
                { "Cristian Romero", "Defensor", "28", "Tottenham", "true" },
                { "Nicolas Otamendi", "Defensor", "38", "Benfica", "true" },
                { "Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true" },
                { "Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true" },
                { "Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true" },
                { "Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true" },
                { "Lionel Messi", "Delantero", "39", "Inter Miami", "true" },
                { "Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true" },
                { "Lautaro Martinez", "Delantero", "29", "Inter Milan", "true" },
                { "Paulo Dybala", "Delantero", "33", "Roma", "false" },
                // Francia
                { "Mike Maignan", "Arquero", "31", "Milan", "true" },
                { "William Saliba", "Defensor", "25", "Arsenal", "true" },
                { "Theo Hernandez", "Defensor", "29", "Milan", "true" },
                { "Jules Kounde", "Defensor", "28", "Barcelona", "true" },
                { "Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true" },
                { "Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true" },
                { "Adrien Rabiot", "Mediocampista", "31", "Marseille", "true" },
                { "Kylian Mbappe", "Delantero", "28", "Real Madrid", "true" },
                { "Ousmane Dembele", "Delantero", "29", "PSG", "true" },
                { "Marcus Thuram", "Delantero", "29", "Inter Milan", "true" },
                { "Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false" }
        };

        Jugador[] jugadores = new Jugador[datos.length];

        for (int i = 0; i < datos.length; i++) {
            String nombre = datos[i][0];
            String posicion = datos[i][1];
            int edad = Integer.parseInt(datos[i][2]);
            String equipo = datos[i][3];
            boolean estaConvocado = Boolean.parseBoolean(datos[i][4]);

            jugadores[i] = new Jugador(nombre, edad, posicion, equipo, estaConvocado);
        }

        Seleccion seleccion = new Seleccion(jugadores);

        seleccion.mostrarConvocados();
        System.out.println("-");
        seleccion.mostrarNoConvocados();
        System.out.println("-");
        seleccion.contarPorEquipo("Real Madrid");
        System.out.println("-");
        seleccion.contarPorPosicion("Arquero");
        System.out.println("-");
        seleccion.buscarPorPosicion(0);
        System.out.println("-");
        seleccion.buscarPorEquipo(12);
        System.out.println("-");
        seleccion.ordenarPorEdad();
        System.out.println("-");
        seleccion.jugadorMasJoven();
        System.out.println("-");
        seleccion.jugadorMasViejo();
        System.out.println("-");
        seleccion.estaConvocado("Lionel Messi");
        System.out.println("-");
        seleccion.promedioEdad();
        System.out.println("-");
        seleccion.agregarJugador(new Jugador("Lionel Messi", 39, "Delantero", "Inter Miami", true));
        System.out.println("-");
        seleccion.eliminarJugador("Lionel Messi");
        System.out.println("-");
        seleccion.mostrarCantidadTotal();
    }
}
