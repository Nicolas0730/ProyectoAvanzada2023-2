package co.edu.uniquindio.proyectoa.dto.medico;

import co.edu.uniquindio.proyectoa.dto.HorarioDTO;

import java.util.List;

public record DetalleMedicoDTO(
        String cedula,
        String nombre,
        String telefono,
        String ciudad,
        String correo,
        String especialidad,
        List<HorarioDTO> horarioDTO
) {
}
