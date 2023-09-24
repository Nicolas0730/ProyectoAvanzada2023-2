package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Estado;
import co.edu.uniquindio.proyectoa.enumeraciones.HistorialAsistencia;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Cita implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaCita;
    private String motivo;

    @ManyToOne
    private Paciente codigoPaciente;

    @ManyToOne
    private Medico codigoMedico;

    @Enumerated(EnumType.STRING)
    private HistorialAsistencia codigoHistorial;

    @Enumerated(EnumType.STRING)
    private Estado estadoCita;

    @OneToOne
    private DetalleCita detalleCita;

    @OneToMany(mappedBy = "codigoCita")
    private List<PQRS> listaPqrs;


}
