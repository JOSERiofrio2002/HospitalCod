  public class Doctor extends Persona {
        private especialidadMedica especialidad;

        public Doctor(String nombre, String apellido, String dni, especialidadMedica especialidad) {
            this.especialidad = especialidad;
        }

        public especialidadMedica getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(especialidadMedica especialidad) {
            this.especialidad = especialidad;
        }
    }

