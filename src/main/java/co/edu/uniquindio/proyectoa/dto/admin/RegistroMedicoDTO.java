package co.edu.uniquindio.proyectoa.dto.admin;

import co.edu.uniquindio.proyectoa.dto.HorarioDTO;

import java.util.List;

public record RegistroMedicoDTO(
        String nombre,
        String cedula,
        int codifoCiudad,
        int codigoEspecialidad,
        String telefono,
        String correo,
        String password,
        String urlFoto,
        List<HorarioDTO> hotarios)
{
}
