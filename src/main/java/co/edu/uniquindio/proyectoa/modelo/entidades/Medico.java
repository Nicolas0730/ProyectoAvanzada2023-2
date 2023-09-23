package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Especialidad;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Medico extends Usuario implements Serializable {

    @Id
    private int codigo;

    public Especialidad codigo_especialidad;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Especialidad getCodigo_especialidad() {
        return codigo_especialidad;
    }

    public void setCodigo_especialidad(Especialidad codigo_especialidad) {
        this.codigo_especialidad = codigo_especialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Medico medico = (Medico) o;

        return codigo == medico.codigo;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + codigo;
        return result;
    }
}
