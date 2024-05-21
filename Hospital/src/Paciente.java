public class Paciente extends Persona {
    private expedienteMedico expediente;

    public Paciente(String nombre, String apellido, String dni, expedienteMedico expediente) {
        this.expediente = expediente;
    }

    public expedienteMedico getExpediente() {
        return expediente;
    }

    public void setExpediente(expedienteMedico expediente) {
        this.expediente = expediente;
    }
}