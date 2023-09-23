package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Estado;
import co.edu.uniquindio.proyectoa.enumeraciones.HistorialAsistencia;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Cita implements Serializable {
    @Id
    private int codigo;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaCita;
    private String motivo;

    @ManyToOne
    private Paciente cedulapaciente;
    @ManyToOne
    private Medico cedulaMedico;
    private HistorialAsistencia codigoHistorial;
    private Estado estadoCita;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Paciente getCedulapaciente() {
        return cedulapaciente;
    }

    public void setCedulapaciente(Paciente cedulapaciente) {
        this.cedulapaciente = cedulapaciente;
    }

    public Medico getCedulaMedico() {
        return cedulaMedico;
    }

    public void setCedulaMedico(Medico cedulaMedico) {
        this.cedulaMedico = cedulaMedico;
    }

    public HistorialAsistencia getCodigoHistorial() {
        return codigoHistorial;
    }

    public void setCodigoHistorial(HistorialAsistencia codigoHistorial) {
        this.codigoHistorial = codigoHistorial;
    }

    public Estado getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(Estado estadoCita) {
        this.estadoCita = estadoCita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cita cita = (Cita) o;

        return codigo == cita.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
