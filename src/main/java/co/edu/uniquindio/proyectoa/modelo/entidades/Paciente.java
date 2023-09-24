package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.EPS;
import co.edu.uniquindio.proyectoa.enumeraciones.TipoSangre;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private Date fechaNacimiento;
    private String  alergias;

    @Enumerated(EnumType.STRING)
    private EPS codigoEps;

    @Enumerated(EnumType.STRING)
    private TipoSangre codigoTipoSangre;

    @OneToMany(mappedBy = "codigoPaciente")
    private List<Cita> listaCitas;

    @OneToMany(mappedBy = "codigoPaciente")
    private List<CalificacionMedico> calificacionMedico;
}
