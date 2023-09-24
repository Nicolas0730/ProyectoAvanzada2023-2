package co.edu.uniquindio.proyectoa.dto;

import java.time.LocalDateTime;

public record PQRSAdminDTO(

        int codigo,
        String tipo,
        LocalDateTime fecha,
        EstadoPQRSDTO estadoPqrs
) {
}
