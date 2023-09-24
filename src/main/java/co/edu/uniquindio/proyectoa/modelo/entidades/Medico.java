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
@DiscriminatorValue("Medico")
public class Medico extends Usuario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false,updatable = false)
    private int codigo;

    @Enumerated(EnumType.STRING)
    @JoinColumn(unique = true,nullable = false)
    public List<Especialidad> codigo_especialidad;

    @OneToMany(mappedBy = "codigoMedico")
    @JoinColumn(unique = true,nullable = false)
    private List<Horario> horarioMedico;

    @OneToMany(mappedBy = "codigoMedico")
    @JoinColumn(unique = true,nullable = false)
    private List<DiaLibre> diaLibre;

    @OneToMany(mappedBy = "codigoMedico")
    @JoinColumn(unique = true,nullable = false)
    private List<Cita> citaMedico;

    @OneToMany(mappedBy = "codigoMedico")
    @JoinColumn(unique = true,nullable = false)
    private List<CalificacionMedico> calificacionMedico;
}
