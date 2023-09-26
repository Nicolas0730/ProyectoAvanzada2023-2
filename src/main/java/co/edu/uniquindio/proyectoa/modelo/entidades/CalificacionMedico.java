package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.Calificacion;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class CalificacionMedico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(unique = true,nullable = false,updatable = false)
    private int codigo;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(nullable = false)
    private Calificacion calificacionMedico;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Paciente codigoPaciente;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Medico codigoMedico;

}
