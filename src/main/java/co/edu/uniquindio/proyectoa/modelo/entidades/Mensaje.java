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
public class Mensaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(unique = true,nullable = false,updatable = false)
    private int codigo;

    private LocalDateTime fechaCreacion;

    @Column(nullable = false,updatable = false)
    private String mensaje;

    @ManyToOne
    @JoinColumn(unique = true,nullable = false)
    private PQRS codigoPQRS;

    @ManyToOne
    @JoinColumn(unique = true,nullable = false)
    private Cuenta codigoCuenta;

    @OneToOne
    @JoinColumn(unique = true,nullable = false)
    private Mensaje codigoMensaje;

}
