package co.edu.uniquindio.proyectoa.dto;

import java.time.LocalDateTime;
import java.util.List;

public record DetallePQRSDTO(
        int codigo,
        EstadoPQRSDTO estado,
        String motivoPQRS,
        String nombrePaciente,
        String nombreMedico,
        String especialidad,
        LocalDateTime fecha,
        List<RespuestaDTO> mensajes

) {
}
