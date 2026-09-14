package Excepciones;

public class CargoInvalidoException extends Exception {
    public CargoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
