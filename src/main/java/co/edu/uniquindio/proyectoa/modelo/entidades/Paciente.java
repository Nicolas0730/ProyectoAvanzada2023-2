package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.EPS;
import co.edu.uniquindio.proyectoa.enumeraciones.TipoSangre;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Paciente implements Serializable {

    @Id
    private int codigo;

    private Date fechaNacimiento;
    private EPS codigo_eps;
    private String  alergias;
    private TipoSangre codigo_tipo_sangre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public EPS getCodigo_eps() {
        return codigo_eps;
    }

    public void setCodigo_eps(EPS idEPS) {
        this.codigo_eps = idEPS;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public TipoSangre getCodigo_tipo_sangre() {
        return codigo_tipo_sangre;
    }

    public void setCodigo_tipo_sangre(TipoSangre tipoSangre) {
        this.codigo_tipo_sangre = tipoSangre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        return codigo == paciente.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
