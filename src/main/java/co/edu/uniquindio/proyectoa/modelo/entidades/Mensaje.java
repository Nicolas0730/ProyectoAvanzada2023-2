package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Mensaje implements Serializable {
    @Id
    private int codigo;
    private LocalDateTime fechaCreacion;
    private String mensaje;

    @ManyToOne
    private PQRS codigoPQRS;
    @ManyToOne
    private Cuenta codigoCuenta;
    @OneToOne
    private Mensaje codigo_Mensaje;

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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public PQRS getCodigoPQRS() {
        return codigoPQRS;
    }

    public void setCodigoPQRS(PQRS codigoPQRS) {
        this.codigoPQRS = codigoPQRS;
    }

    public Cuenta getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(Cuenta codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public Mensaje getCodigo_Mensaje() {
        return codigo_Mensaje;
    }

    public void setCodigo_Mensaje(Mensaje codigo_Mensaje) {
        this.codigo_Mensaje = codigo_Mensaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mensaje mensaje = (Mensaje) o;

        return codigo == mensaje.codigo;
    }

    @Override
    public int hashCode() {
        return codigo;
    }
}
