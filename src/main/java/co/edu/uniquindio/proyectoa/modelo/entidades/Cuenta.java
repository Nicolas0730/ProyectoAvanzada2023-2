package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.repository.cdi.Eager;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Cuenta implements Serializable {

    @Id
    private int id;

    private String correo;
    private String contrasena;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cuenta cuenta = (Cuenta) o;

        if (id != cuenta.id) return false;
        return Objects.equals(correo, cuenta.correo);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (correo != null ? correo.hashCode() : 0);
        return result;
    }
}
