package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Calificacion;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class CalificacionMedico implements Serializable {

    @Id
    private int codigo;

    @Enumerated(EnumType.ORDINAL)
    private Calificacion calificacionMedico;

    @ManyToOne
    private Paciente codigoPaciente;

    @ManyToOne
    private Medico codigoMedico;

}
