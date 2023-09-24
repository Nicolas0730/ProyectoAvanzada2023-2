package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

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
    private int codigo;

    private String dia;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;

    @ManyToOne
    private Medico codigoMedico;


}
