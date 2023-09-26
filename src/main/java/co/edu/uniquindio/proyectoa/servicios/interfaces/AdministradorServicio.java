package co.edu.uniquindio.proyectoa.servicios.interfaces;

import co.edu.uniquindio.proyectoa.dto.InfoPQRSDTO;
import co.edu.uniquindio.proyectoa.dto.admin.CitaDTOAdmin;
import co.edu.uniquindio.proyectoa.dto.admin.MedicoDTOAdmin;
import co.edu.uniquindio.proyectoa.dto.admin.PQRSDTOAdmin;
import co.edu.uniquindio.proyectoa.dto.medico.InfoMedicoDTO;
import co.edu.uniquindio.proyectoa.dto.medico.MedicoDTO;

import java.util.List;

public interface AdministradorServicio {
    int crearMedico(MedicoDTO medico) throws Exception;

    int actualizarMedico(int codigo, MedicoDTO medico) throws Exception;

    void eliminarMedico(int codigo) throws Exception;

    List<MedicoDTOAdmin> listarMedicos() throws Exception;

    InfoMedicoDTO obtenerMedico(int codigo) throws Exception;

    List<PQRSDTOAdmin> listarPQRS() throws Exception;

    String responderPQRS(int codigo) throws Exception;

    InfoPQRSDTO verDetallePQRS(int codigo) throws Exception;

    List<CitaDTOAdmin> listarCitas() throws Exception;

    void denegarSolicitudCitaPaciente(int codigo,int cantidadCancelaciones) throws Exception; //Si el paciente ha cancelado 2 veces en el ultimo mes, inhabilitar funcion de solicitud de agenda de cita
}
