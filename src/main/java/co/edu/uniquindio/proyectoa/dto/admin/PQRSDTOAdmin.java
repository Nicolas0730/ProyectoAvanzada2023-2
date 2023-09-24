package co.edu.uniquindio.proyectoa.dto.admin;

import java.time.LocalDateTime;

public record PQRSDTOAdmin (int codigo,
                            String estado,
                            LocalDateTime fecha,
                            String nombrePaciente)
{
}
