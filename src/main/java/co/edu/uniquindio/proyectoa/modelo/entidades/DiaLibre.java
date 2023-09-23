package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Entity
public class DiaLibre implements Serializable {

    @Id
    private int codigo;
    private String dia;
    @ManyToOne
    private Medico codigo_Medico;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int id) {
        this.codigo = id;
    }

    public Medico getCodigo_Medico() {
        return codigo_Medico;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setCodigo_Medico(Medico codigo_Medico) {
        this.codigo_Medico = codigo_Medico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiaLibre diaLibre = (DiaLibre) o;

        return codigo == diaLibre.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
