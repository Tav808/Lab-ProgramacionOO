public class Cliente extends Usuario {
    private int telefono;
    private String direccion;

    public Cliente(int idusuario, String nombre, String email, String contraseña, int telefono, String direccion) {
        super(idusuario, nombre, email, contraseña);
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
