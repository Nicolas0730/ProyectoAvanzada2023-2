package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Ciudad;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Usuario implements Serializable {
    @Id
    private String cedula;
    private String nombre;
    private String telefono;
    private String url_foto;

    private Ciudad ciudad;

    public Usuario(){
        super();
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return cedula.equals(usuario.cedula);
    }

    @Override
    public int hashCode() {
        return cedula.hashCode();
    }
}
