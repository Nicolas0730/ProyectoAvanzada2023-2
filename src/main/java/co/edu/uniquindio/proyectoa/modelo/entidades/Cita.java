package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Estado;
import co.edu.uniquindio.proyectoa.enumeraciones.HistorialAsistencia;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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
    @Column(unique = true,nullable = false,updatable = false)
    private int codigo;

    @Column(unique = false,nullable = false)
    @DateTimeFormat
    private LocalDateTime fechaCreacion;

    @Column(unique = false,nullable = false)
    @DateTimeFormat
    private LocalDateTime fechaCita;

    @Column(unique = false,nullable = true,updatable = false)
    private String motivo;

    @ManyToOne
    @JoinColumn(unique = true,nullable = false)
    private Paciente codigoPaciente;

    @ManyToOne
    @JoinColumn(unique = true,nullable = false)
    private Medico codigoMedico;

    @Enumerated(EnumType.STRING)
    @JoinColumn(unique = true,nullable = false)
    private HistorialAsistencia codigoHistorial;

    @Enumerated(EnumType.STRING)
    @JoinColumn(unique = true,nullable = false)
    private Estado estadoCita;

    @OneToOne
    @JoinColumn(unique = true,nullable = false)
    private DetalleCita detalleCita;

    @OneToMany(mappedBy = "codigoCita")
    @JoinColumn(unique = true,nullable = false)
    private List<PQRS> listaPqrs;


}
