package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.EstadoPQRS;
import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.TipoPQRS;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

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
    @Column(unique = true,nullable = false,updatable = false)
    private int codigo;

    @Column(nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(nullable = false,length = 300)
    private String motivo;

    @Enumerated(EnumType.STRING)
    private TipoPQRS tipo;

    @ManyToOne
    @JoinColumn(unique = true,nullable = false)
    private Cita codigoCita;

    @Enumerated(EnumType.STRING)
    private EstadoPQRS codigoPQRS;

    @OneToMany(mappedBy = "codigoPQRS")
    private List<Mensaje> listaMensaje;
}
