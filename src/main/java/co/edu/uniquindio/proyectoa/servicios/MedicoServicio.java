package co.edu.uniquindio.proyectoa.servicios;

public interface MedicoServicio {
    void listarCitasPendientes();

    void atenderCita();

    void listarCitasPaciente(); //historial médico

    void agendarDiaLibre();

    void listarCitasRealizadasMedico();
}
