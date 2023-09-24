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
public class Mensaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private LocalDateTime fechaCreacion;
    private String mensaje;

    @ManyToOne
    private PQRS codigoPQRS;
    @ManyToOne
    private Cuenta codigoCuenta;
    @OneToOne
    private Mensaje codigo_Mensaje;

}
