public class MenuVegano extends Menu {
    public String proteinaVegetal;

    public MenuVegano(String diaSemana, int caloriasTotales, String proteinaVegetal) {
        super(diaSemana, caloriasTotales);
        this.proteinaVegetal = proteinaVegetal;
    }

    public String getProteinaVegetal() {
        return proteinaVegetal;
    }

    public void setProteinaVegetal(String proteinaVegetal) {
        this.proteinaVegetal = proteinaVegetal;
    }
}
