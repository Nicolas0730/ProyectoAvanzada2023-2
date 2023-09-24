package co.edu.uniquindio.proyectoa.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor

public class Administrador extends Cuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;

    //git remote add origin git@github.com:SU_USERNAME/NOMBRE_PROYECTO.git
    //git remote add origin git@github.com:Nicolas0730/ProyectoAvanzada2023-2.git
    //git push --set-upstream origin ramaTrabajo


}
