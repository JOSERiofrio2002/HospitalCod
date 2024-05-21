public class Enfermero extends Persona {
    private CitaMedica citaMedica;

    public Enfermero(String nombre, String apellido, String dni, CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }
}
