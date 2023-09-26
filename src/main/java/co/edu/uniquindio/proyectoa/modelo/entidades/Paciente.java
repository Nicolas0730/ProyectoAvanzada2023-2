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
@ToString
public class Paciente extends Usuario implements Serializable {

    private Date fechaNacimiento;

    @Column(nullable = false,length = 40)
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
