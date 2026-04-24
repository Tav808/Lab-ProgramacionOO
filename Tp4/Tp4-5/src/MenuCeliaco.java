public class MenuCeliaco extends Menu {
    public String certificadoSinTACC;

    public MenuCeliaco(String diaSemana, int caloriasTotales, String certificadoSinTACC) {
        super(diaSemana, caloriasTotales);
        this.certificadoSinTACC = certificadoSinTACC;
    }

    public String getCertificadoSinTACC() {
        return certificadoSinTACC;
    }

    public void setCertificadoSinTACC(String certificadoSinTACC) {
        this.certificadoSinTACC = certificadoSinTACC;
    }
}
