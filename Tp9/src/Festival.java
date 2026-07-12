public class Festival {

    private String nombreFestival;

    public Festival(String nombreFestival) {
        this.nombreFestival = nombreFestival;
    }

    public String getNombreFestival() {
        return nombreFestival;
    }

    public void setNombreFestival(String nombreFestival) {
        this.nombreFestival = nombreFestival;
    }

    public void realizarSoundcheck(Cantante c) throws EspectaculoCortoException {

        if (c.getCantidadCanciones() < 5) {
            throw new EspectaculoCortoException();
        }

        System.out.println("Soundcheck realizado con exito para " + c.getNombre() + " (" + c.getCantidadCanciones() + " canciones)");
    }
}
