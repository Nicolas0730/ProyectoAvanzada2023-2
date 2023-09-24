package co.edu.uniquindio.proyectoa.dto.medico;

import co.edu.uniquindio.proyectoa.dto.HorarioDTO;

import java.util.List;
public record InfoMedicoDTO(
        int codigo,
        String nombre,
        String cedula,
        int codigoCiudad,
        int codigoEspecialidad,
        String telefono,
        String correo,
        List<HorarioDTO> horarios
) {
}
