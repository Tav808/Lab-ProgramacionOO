import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Jugador> listaJugadores;

    public Seleccion(Jugador[] listaJugadores) {
        this.listaJugadores = new ArrayList<Jugador>();
        if (listaJugadores != null) {
            for (Jugador j : listaJugadores) {
                if (j != null) {
                    this.listaJugadores.add(j);
                }
            }
        }
    }

    public void mostrarConvocados() {
        for (Jugador j : listaJugadores) {
            if (j != null && j.getEstaConvocado() == true) {
                j.mostrarFicha();
            }
        }
    }

    public void mostrarNoConvocados() {
        for (Jugador j : listaJugadores) {
            if (j != null && j.getEstaConvocado() == false) {
                j.mostrarFicha();
            }
        }
    }

    public int contarPorEquipo(String equipo) {
        int contador = 0;
        for (Jugador j : listaJugadores) {
            if (j != null && j.getEquipo().equals(equipo)) {
                contador++;
            }
        }
        System.out.println("Cantidad de jugadores en " + equipo + ": " + contador);
        return contador;
    }

    public int contarPorPosicion(String posicion) {
        int contador = 0;
        for (Jugador j : listaJugadores) {
            if (j != null && j.getPosicion().equals(posicion)) {
                contador++;
            }
        }
        System.out.println("Cantidad de jugadores en la posicion de " + posicion + ": " + contador);
        return contador;
    }

    public void buscarPorPosicion(int indice) {
        if (indice < 0 || indice >= listaJugadores.size()) {
            System.out.println("Índice " + indice + " fuera de rango.");
            return;
        }
        Jugador j = listaJugadores.get(indice);
        if (j != null) {
            System.out.println("=== Jugador en índice " + indice + " ===");
            System.out.println("Nombre : " + j.getNombre());
            System.out.println("Edad   : " + j.getEdad() + " años");
            System.out.println("Posicion: " + j.getPosicion());
            System.out.println("Equipo: " + j.getEquipo());
            System.out.println("Esta convocado: " + j.getEstaConvocado());
        }
    }

    public void buscarPorEquipo(int indice) {
        if (indice < 0 || indice >= listaJugadores.size()) {
            System.out.println("Índice " + indice + " fuera de rango.");
            return;
        }
        Jugador j = listaJugadores.get(indice);
        if (j != null) {
            System.out.println("=== Jugador en índice " + indice + " ===");
            System.out.println("Nombre : " + j.getNombre());
            System.out.println("Edad   : " + j.getEdad() + " años");
            System.out.println("Posicion: " + j.getPosicion());
            System.out.println("Equipo: " + j.getEquipo());
            System.out.println("Esta convocado: " + j.getEstaConvocado());
        }
    }

    public void ordenarPorEdad() {
        for (int i = 0; i < listaJugadores.size() - 1; i++) {
            for (int j = i + 1; j < listaJugadores.size(); j++) {
                if (listaJugadores.get(i).getEdad() > listaJugadores.get(j).getEdad()) {
                    Jugador temp = listaJugadores.get(i);
                    listaJugadores.set(i, listaJugadores.get(j));
                    listaJugadores.set(j, temp);
                }
            }
        }
        for (Jugador j : listaJugadores) {
            if (j != null) {
                j.mostrarFicha();
            }
        }
    }

    public void jugadorMasJoven() {
        int edad = Integer.MAX_VALUE;
        for (Jugador j : listaJugadores) {
            if (j != null && j.getEdad() < edad) {
                edad = j.getEdad();
            }
        }
        System.out.println("Edad del jugador mas joven: " + edad);
    }

    public void jugadorMasViejo() {
        int edad = Integer.MIN_VALUE;
        for (Jugador j : listaJugadores) {
            if (j != null && j.getEdad() > edad) {
                edad = j.getEdad();
            }
        }
        System.out.println("Edad del jugador mas viejo: " + edad);
    }

    public void estaConvocado(String nombre) {
        for (Jugador j : listaJugadores) {
            if (j != null && j.getNombre().equals(nombre)) {
                System.out.println("El jugador " + nombre + " esta convocado: " + j.getEstaConvocado());
            }
        }
    }

    public void promedioEdad() {
        int edad = 0;
        int contadorValidos = 0;
        for (Jugador j : listaJugadores) {
            if (j != null) {
                edad += j.getEdad();
                contadorValidos++;
            }
        }
        if (contadorValidos > 0) {
            System.out.println("Promedio de edad: " + (edad / contadorValidos));
        } else {
            System.out.println("Promedio de edad: 0");
        }
    }

    public void agregarJugador(Jugador nuevoJugador) {
        if (nuevoJugador != null) {
            listaJugadores.add(nuevoJugador);
        }
    }

    public void eliminarJugador(String nombre) {
        for (int i = 0; i < listaJugadores.size(); i++) {
            Jugador j = listaJugadores.get(i);
            if (j != null && j.getNombre().equals(nombre)) {
                listaJugadores.remove(i);
                i--;
            }
        }
    }

    public void mostrarCantidadTotal() {
        System.out.println("Cantidad total de jugadores en inventario: " + listaJugadores.size());
    }
}