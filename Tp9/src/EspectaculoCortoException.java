public class EspectaculoCortoException extends Exception {

    public EspectaculoCortoException() {
        super("El show es demasiado corto, se necesitan al menos 5 canciones");
    }
}
