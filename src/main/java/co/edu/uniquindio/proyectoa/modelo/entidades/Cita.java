package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.Estado;
import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.HistorialAsistencia;
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

    @Column(nullable = false)
    @DateTimeFormat
    private LocalDateTime fechaCreacion;

    @Column(nullable = false)
    @DateTimeFormat
    private LocalDateTime fechaCita;

    @Column(updatable = false)
    private String motivo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Paciente codigoPaciente;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Medico codigoMedico;

    @Column(nullable = false)
    private HistorialAsistencia codigoHistorial;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estadoCita;

    @OneToOne
    @JoinColumn(nullable = false)
    private DetalleCita detalleCita;

    @OneToMany(mappedBy = "codigoCita")
    private List<PQRS> listaPqrs;


}
