package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class DetalleCita implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include

    private int codigo;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    @OneToOne
    private Cita codigoCita;


}
