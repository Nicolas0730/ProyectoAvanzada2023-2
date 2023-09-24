package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.EPS;
import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.TipoSangre;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@DiscriminatorValue("Paciente")
public class Paciente extends Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private Date fechaNacimiento;

    @Column(unique = true,nullable = false,length = 40)
    private String  alergias;

    @Enumerated(EnumType.STRING)
    private EPS codigoEps;

    @Enumerated(EnumType.STRING)
    private TipoSangre codigoTipoSangre;

    @OneToMany(mappedBy = "codigoPaciente")
    @JoinColumn(unique = true,nullable = false)
    private List<Cita> listaCitas;

    @OneToMany(mappedBy = "codigoPaciente")
    @JoinColumn(unique = true,nullable = false)
    private List<CalificacionMedico> calificacionMedico;
}
