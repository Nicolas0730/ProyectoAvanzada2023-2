package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Administrador extends Cuenta implements Serializable {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrador that = (Administrador) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
