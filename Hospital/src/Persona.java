public abstract class Persona {

        private String nombre;
        private String apellido;
        private String dni;

        // Constructor, getters y setters
    }

    class doctor extends Persona {
        public especialidadMedica especialidad;

    }

 class paciente extends Persona {
        public expedienteMedico expediente;

    }

