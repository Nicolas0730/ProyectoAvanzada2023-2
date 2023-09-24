package co.edu.uniquindio.proyectoa.servicios;

import co.edu.uniquindio.proyectoa.dto.CalificacionDTO;

public interface PacienteServicio {
    void registrarse();

    void editarPerfil();

    void eliminarCuenta();

    void enviarLinkRecuperacion();

    void cambiarPassword();

    void agendarCita();

    void crearPQRS();

    void listarPQRSPaciente();

    void responderPQRS();

    void listarCitasPaciente();

    void filtrarCitasPorFecha();

    void filtrarCitasPorMedico();

    void verDetalleCita();

    void calificarServicioMedico(int codigoMedico, CalificacionDTO calificacionDTO);
}
