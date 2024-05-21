public class CitaMedica {

        private doctor doctor;
        private Paciente paciente;
        private estadoCita estado;


        public CitaMedica(doctor doctor, Paciente paciente, estadoCita estado) {
            this.doctor = doctor;
            this.paciente = paciente;
            this.estado = estado;
        }


        public doctor getDoctor() {
            return doctor;
        }

        public void setDoctor(doctor doctor) {
            this.doctor = doctor;
        }

        public Paciente getPaciente() {
            return paciente;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }

        public estadoCita getEstado() {
            return estado;
        }

        public void setEstado(estadoCita estado) {
            this.estado = estado;
        }
    }

