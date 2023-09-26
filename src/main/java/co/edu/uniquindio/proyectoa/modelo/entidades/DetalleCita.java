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
    @Column(unique = true,nullable = false,updatable = false)
    private int codigo;

    @Column(nullable = false)
    private String diagnostico;
    @Column(nullable = false)
    private String tratamiento;
    @Column(nullable = false)
    private String observaciones;

    @OneToOne
    @JoinColumn(unique = true,updatable = false,nullable = false)
    private Cita codigoCita;


}
