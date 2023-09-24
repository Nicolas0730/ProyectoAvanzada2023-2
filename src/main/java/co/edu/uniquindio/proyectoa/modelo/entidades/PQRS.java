package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.EstadoPQRS;
import co.edu.uniquindio.proyectoa.enumeraciones.TipoPQRS;
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
public class PQRS implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private LocalDateTime fechaCreacion;
    private String motivo;

    @Enumerated(EnumType.STRING)
    private TipoPQRS tipo;

    @ManyToOne
    private Cita codigoCita;

    @Enumerated(EnumType.STRING)
    private EstadoPQRS codigoPQRS;

}
