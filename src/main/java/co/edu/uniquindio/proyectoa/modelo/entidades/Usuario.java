package co.edu.uniquindio.proyectoa.modelo.entidades;

import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.Ciudad;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass

public class Usuario extends Cuenta implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(unique = true,nullable = false,updatable = false)
    private String cedula;

    @Column(unique = true,nullable = false,length = 40)
    private String nombre;
    @Column(unique = true,nullable = false,length = 12)
    private String telefono;
    @Column(unique = true,nullable = false,length = 500)
    private String urlFoto;

    @Enumerated(EnumType.STRING)
    private Ciudad ciudad;

}
