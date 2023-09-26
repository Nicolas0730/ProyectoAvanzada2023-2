package co.edu.uniquindio.proyectoa.servicios.interfaces;

public interface MedicoServicio {
    void listarCitasPendientes();

    void atenderCita();

    void listarCitasPaciente(); //historial médico

    void agendarDiaLibre();

    void listarCitasRealizadasMedico();
}
