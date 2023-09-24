package co.edu.uniquindio.proyectoa.dto.paciente;

import java.time.LocalDateTime;

public record PacienteDTO(LocalDateTime fechaNacimiento,
                          String alergias,
                          int codigoEps,
                          int codigoTipoSangre)
{
}
