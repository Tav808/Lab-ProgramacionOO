public class App {
    public static void main(String[] args) {

        String[][] datosCantantes = {
                { "Taylor Swift", "Pop", "1500000", "18", "Tree Paine" },
                { "Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad" },
                { "Coldplay", "Rock", "1200000", "3", "Phil Harvey" },
                { "Duki", "Trap", "500000", "14", null }
        };

        Festival festival = new Festival("Lollapalooza");

        for (String[] fila : datosCantantes) {

            String nombre = fila[0];

            try {

                String generoMusical = fila[1];
                int cachet;

                try {
                    cachet = Integer.parseInt(fila[2]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(
                            "El cachet ingresado no es un numero valido para " + nombre + ": " + fila[2]);
                }

                int cantidadCanciones = Integer.parseInt(fila[3]);
                String representante = fila[4];

                Cantante cantante = new Cantante(nombre, generoMusical, cachet, cantidadCanciones, representante);

                try {
                    System.out.println("Representante de " + nombre + ": " + representante.toUpperCase());
                } catch (NullPointerException e) {
                    System.out.println(nombre + " no tiene manager registrado");
                }

                festival.realizarSoundcheck(cantante);

                cantante.asignarEscenario("Escenario Principal");
                cantante.liquidarHonorarios(21.0);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            } catch (EspectaculoCortoException e) {
                System.out.println(e.getMessage());

            } catch (NullPointerException e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("Fin del procesamiento de " + nombre);
            }
        }
    }
}
