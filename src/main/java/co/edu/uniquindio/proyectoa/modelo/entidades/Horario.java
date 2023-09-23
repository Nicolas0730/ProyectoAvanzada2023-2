package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Horario implements Serializable {

    @Id
    private int codigo;

    private String dia;
    private LocalDateTime hora_inicio;
    private LocalDateTime hora_fin;
    @ManyToOne
    private Medico codigo_medico;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalDateTime getHora_fin() {
        return hora_fin;
    }

    public LocalDateTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_fin(LocalDateTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public void setHora_inicio(LocalDateTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Medico getCodigo_medico() {
        return codigo_medico;
    }

    public void setCodigo_medico(Medico codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horario horario = (Horario) o;

        return codigo == horario.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
