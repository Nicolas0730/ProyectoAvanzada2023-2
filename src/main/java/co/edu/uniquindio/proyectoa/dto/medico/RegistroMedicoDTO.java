package co.edu.uniquindio.proyectoa.dto.medico;

import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.Ciudad;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record RegistroMedicoDTO(

        //Se valida aquí para evitar hacerlo en la implementación  del servicio que invoque a este DTO
        @NotNull @Length(max = 200) String nombre,
        @NotNull String cedula,
        @NotNull @Min(0) @Max(3) int ciudad,
        @NotNull int codigoEspecialidad,
        @NotNull @Email @Length(max = 20) String telefono,
        @NotNull String correo,
        @NotNull String password
) {

}
