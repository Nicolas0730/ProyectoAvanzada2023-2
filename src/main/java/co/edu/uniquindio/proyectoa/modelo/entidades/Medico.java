package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Especialidad;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Medico extends Usuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Enumerated(EnumType.STRING)
    public List<Especialidad> codigo_especialidad;

    @OneToMany(mappedBy = "codigoMedico")
    private List<Horario> horarioMedico;

    @OneToMany(mappedBy = "codigoMedico")
    private List<DiaLibre> diaLibre;

    @OneToMany(mappedBy = "codigoMedico")
    private List<Cita> citaMedico;

    @OneToMany(mappedBy = "codigoMedico")
    private List<CalificacionMedico> calificacionMedico;
}
