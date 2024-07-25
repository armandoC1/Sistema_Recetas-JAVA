
package entidaddenegocio;

public class Recetas {
    private int id;
    private String paciente;
    private String medico;
    private String medicamentos;
    private String fecha_emision;
    private String indicaciones;

    public Recetas() {
    }

    public Recetas(int id, String paciente, String medico, String medicamentos, String fecha_emision, String indicaciones) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamentos = medicamentos;
        this.fecha_emision = fecha_emision;
        this.indicaciones = indicaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
}
