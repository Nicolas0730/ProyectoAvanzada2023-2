package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(unique = true,nullable = false,updatable = false)
    private int codigo;

    @Column(unique = false,nullable = false,length = 20,updatable = false)
    private String dia;

    @Column(unique = false,nullable = false)
    @DateTimeFormat
    private LocalDateTime horaInicio;

    @Column(unique = false,nullable = false)
    @DateTimeFormat
    private LocalDateTime horaFin;

    @ManyToOne
    @JoinColumn(unique = true,nullable = false)
    private Medico codigoMedico;


}
