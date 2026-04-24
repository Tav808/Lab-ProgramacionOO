public class HerramientasManuales extends Herramientas {
    protected String tipoEmpuñadura;

    public HerramientasManuales(String nombre, int codigo, String tipoEmpuñadura) {
        super(nombre, codigo);
        this.tipoEmpuñadura = tipoEmpuñadura;
    }
}
