public class Main {
    public static void main(String[] args) {
        Herramientas h1 = new HerramientasManuales("Martillo", 101, "Goma");
        Herramientas h2 = new HerramientasManuales("Destornillador", 102, "Plástico");
        Herramientas h3 = new HerramientasElectricas("Taladro", 201, 220);
        Herramientas h4 = new HerramientasElectricas("Amoladora", 202, 220);
        Herramientas h5 = new HerramientasManuales("Llave Francesa", 103, "Metal");

        Herramientas[] listado = { h1, h2, h3, h4, h5 };

        System.out.println("--- LISTADO DE HERRAMIENTAS ---");
        for (Herramientas h : listado) {
            System.out.println();
            h.usar();

            if (h instanceof HerramientasElectricas) {
                ((HerramientasElectricas) h).conectar1();
            }

            h.devolver();
            System.out.println("---------------------------------");
        }
    }
}