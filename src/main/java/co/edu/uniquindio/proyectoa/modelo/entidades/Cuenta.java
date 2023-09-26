package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(unique = true,nullable = false,updatable = false)
    private int id;

    @Column(unique = true,nullable = false,length = 25)
    @Email
    private String correo;

    @Column(nullable = false,length = 20)
    private String contrasenia;

    @OneToMany(mappedBy = "codigoCuenta")
    private List<Mensaje> listaMensajes;



}
