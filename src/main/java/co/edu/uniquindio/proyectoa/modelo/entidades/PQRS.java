package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.EstadoPQRS;
import co.edu.uniquindio.proyectoa.enumeraciones.TipoPQRS;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class PQRS implements Serializable {

    @Id
    private int codigo;

    private LocalDateTime fechaCreacion;
    private TipoPQRS tipo;
    private String motivo;

    @ManyToOne
    private Cita codigoCita;
    private EstadoPQRS codigoPQRS;

}
