public class Administrador extends Usuario {
    private int nivelAcceso;

    public Administrador(int idusuario, String nombre, String email, String contraseña, int nivelAcceso) {
        super(idusuario, nombre, email, contraseña);
        this.nivelAcceso = nivelAcceso;
    }
}
