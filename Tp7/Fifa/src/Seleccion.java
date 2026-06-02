public class Seleccion {
    private Jugador[] listaJugadores;

    public Seleccion(Jugador[] listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void mostrarConvocados() {
        for (Jugador p : listaJugadores) {
            if (p != null && p.getEstaConvocado() == true) {
                p.mostrarFicha();
            }
        }
    }

    public void mostrarNoConvocados() {
        for (Jugador p : listaJugadores) {
            if (p != null && p.getEstaConvocado() == false) {
                p.mostrarFicha();
            }
        }
    }

    public int contarPorEquipo(String equipo) {
        int contador = 0;
        for (Jugador p : listaJugadores) {
            if (p != null && p.getEquipo().equals(equipo)) {
                contador++;
            }
        }
        return contador;
    }

    public int contarPorPosicion(String posicion) {
        int contador = 0;
        for (Jugador p : listaJugadores) {
            if (p != null && p.getPosicion().equals(posicion)) {
                contador++;
            }
        }
        return contador;
    }

    public void buscarPorPosicion(int indice) {
        if (indice < 0 || indice >= listaJugadores.length) {
            System.out.println("Índice " + indice + " fuera de rango.");
            return;
        }
        Jugador p = listaJugadores[indice];
        System.out.println("=== Jugador en índice " + indice + " ===");
        System.out.println("Nombre : " + p.getNombre());
        System.out.println("Edad   : " + p.getEdad() + " años");
        System.out.println("Posicion: " + p.getPosicion());
        System.out.println("Equipo: " + p.getEquipo());
        System.out.println("Esta convocado: " + p.getEstaConvocado());
    }

    public void buscarPorEquipo(int indice) {
        if (indice < 0 || indice >= listaJugadores.length) {
            System.out.println("Índice " + indice + " fuera de rango.");
            return;
        }
        Jugador p = listaJugadores[indice];
        System.out.println("=== Jugador en índice " + indice + " ===");
        System.out.println("Nombre : " + p.getNombre());
        System.out.println("Edad   : " + p.getEdad() + " años");
        System.out.println("Posicion: " + p.getPosicion());
        System.out.println("Equipo: " + p.getEquipo());
        System.out.println("Esta convocado: " + p.getEstaConvocado());
    }

    public void ordenarPorEdad() {
        for (int i = 0; i < listaJugadores.length - 1; i++) {
            for (int j = i + 1; j < listaJugadores.length; j++) {
                if (listaJugadores[i].getEdad() > listaJugadores[j].getEdad()) {
                    Jugador temp = listaJugadores[i];
                    listaJugadores[i] = listaJugadores[j];
                    listaJugadores[j] = temp;
                }
            }
        }
    }

    public void jugadorMasJoven() {
        int edad = Integer.MAX_VALUE;
        for (Jugador p : listaJugadores) {
            if (p != null && p.getEdad() < edad) {
                edad = p.getEdad();
            }
        }
        System.out.println("Edad del jugador mas joven: " + edad);
    }

    public void jugadorMasViejo() {
        int edad = Integer.MIN_VALUE;
        for (Jugador p : listaJugadores) {
            if (p != null && p.getEdad() > edad) {
                edad = p.getEdad();
            }
        }
        System.out.println("Edad del jugador mas viejo: " + edad);
    }

    public void estaConvocado(String nombre) {
        for (Jugador p : listaJugadores) {
            if (p != null && p.getNombre().equals(nombre)) {
                System.out.println("El jugador " + nombre + " esta convocado: " + p.getEstaConvocado());
            }
        }
    }

    public void promedioEdad() {
        int edad = 0;
        for (Jugador p : listaJugadores) {
            if (p != null) {
                edad += p.getEdad();
            }
        }
        System.out.println("Promedio de edad: " + edad / listaJugadores.length);
    }

    public void agregarJugador(Jugador nuevoJugador) {
        if (nuevoJugador == null) {
            return;
        }
        if (listaJugadores.length == 0) {
            listaJugadores = new Jugador[1];
            listaJugadores[0] = nuevoJugador;
            return;
        }
        Jugador[] nuevaLista = new Jugador[listaJugadores.length + 1];
        for (int i = 0; i < listaJugadores.length; i++) {
            nuevaLista[i] = listaJugadores[i];
        }
        nuevaLista[listaJugadores.length] = nuevoJugador;
        listaJugadores = nuevaLista;
    }

    public void eliminarJugador(String nombre) {
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i].getNombre().equals(nombre)) {
                listaJugadores[i] = null;
            }
        }
    }

    public void mostrarCantidadTotal() {
        System.out.println("Cantidad total de jugadores en inventario: " + listaJugadores.length);
    }
}