public class Main {
    public static void main(String[] args) {
        // Crear un expediente médico
        expedienteMedico expediente = new expedienteMedico();

        // Crear un paciente con el expediente médico
        Paciente paciente = new Paciente("Jose", "Riofrio", "1104289184", expediente);

        // Crear una especialidad médica
        especialidadMedica especialidad = especialidadMedica.CARDIOLOGIA;

        // Crear un doctor con la especialidad médica
        Doctor doctor = new Doctor("Santiago", "Naranjo", "2653246", especialidad);

        // Crear una cita médica con el doctor, el paciente y el estado de la cita
        CitaMedica citaMedica = new CitaMedica(doctor, paciente, estadoCita.PROGRAMADA);

        // Crear un enfermero con la cita médica
        Enfermero enfermero = new Enfermero("Paula", "Vivanco", "62652329", citaMedica);


        System.out.println("Paciente: " + paciente.getNombre() + " " + paciente.getApellido());
        System.out.println("Doctor: " + doctor.getNombre() + " " + doctor.getApellido());
        System.out.println("Enfermero: " + enfermero.getNombre() + " " + enfermero.getApellido());
        System.out.println("Estado de la cita: " + citaMedica.getEstado());
    }
}