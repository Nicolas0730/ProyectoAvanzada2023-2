package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.enumeraciones.Ciudad;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Usuario implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String cedula;

    private String nombre;
    private String telefono;
    private String urlFoto;

    @Enumerated(EnumType.STRING)
    private Ciudad ciudad;

}
