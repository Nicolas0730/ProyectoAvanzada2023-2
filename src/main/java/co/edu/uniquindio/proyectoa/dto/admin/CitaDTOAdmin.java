package co.edu.uniquindio.proyectoa.dto.admin;

import java.time.LocalDateTime;

public record CitaDTOAdmin(

        int codigoCita,
        String nombrePaciente,
        String nombreMedico,
        LocalDateTime fecha,
        String motivo

) {
}
