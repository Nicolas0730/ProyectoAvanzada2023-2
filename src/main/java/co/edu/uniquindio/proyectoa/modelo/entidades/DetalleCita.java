package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Entity
public class DetalleCita implements Serializable {

    @Id
    private int codigo;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    @OneToOne
    private Cita codigoCita;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cita getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(Cita codigoCita) {
        this.codigoCita = codigoCita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetalleCita that = (DetalleCita) o;

        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
