package co.edu.uniquindio.proyectoa.servicios.implementacion;

import co.edu.uniquindio.proyectoa.dto.InfoPQRSDTO;
import co.edu.uniquindio.proyectoa.dto.admin.CitaDTOAdmin;
import co.edu.uniquindio.proyectoa.dto.admin.MedicoDTOAdmin;
import co.edu.uniquindio.proyectoa.dto.admin.PQRSDTOAdmin;
import co.edu.uniquindio.proyectoa.dto.medico.InfoMedicoDTO;
import co.edu.uniquindio.proyectoa.dto.medico.MedicoDTO;
import co.edu.uniquindio.proyectoa.modelo.entidades.Medico;
import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.Ciudad;
import co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones.Especialidad;
import co.edu.uniquindio.proyectoa.repositorios.MedicoRepo;
import co.edu.uniquindio.proyectoa.servicios.interfaces.AdministradorServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //Con esta anotación, lombok evita crear los contructores a mano haciendolo automaticamente con los atributos de etiqueta 'final'
public class AdministradorServicioImpl implements AdministradorServicio {

    private final MedicoRepo medicoRepo;

    @Override
    public int crearMedico(MedicoDTO medico) throws Exception {
//        Medico medicoNuevo = new Medico();
//        medicoNuevo.setNombre(medico.nombre());
//        medicoNuevo.setCedula(medico.cedula());
//        medicoNuevo.setCiudad(Ciudad.values()[medico.codigoCiudad()]);
//        medicoNuevo.setTelefono(medico.telefono());
//        medicoNuevo.setUrlFoto(medico.urlFoto());
//        medicoNuevo.setEspecialidad(Especialidad.values()[medico.codigoEspecialidad()]);
//        medicoNuevo.setPassword(medico.password());
//        medicoNuevo.setCorreo(medico.correo());

        if (estaRepetidoCorreo(medico.correo())){
            throw new Exception("El correo ya se encuentra registrado");
        }
        if (estaRepetidoCedula(medico.cedula())){
            throw new Exception("La cedula ya se encuentra registrada");
        }


        //Medico medicoRegistrado = medicoRepo.save(medicoNuevo);


       // return medicoRegistrado.getCodigo();
        return 0;
    }

    private boolean estaRepetidoCedula(String cedula) {
        medicoRepo.buscarPorCedula(cedula);
        return false;
    }

    private boolean estaRepetidoCorreo(String correo) {
        medicoRepo.buscarPorCorreo(correo);
        return false;
    }




    @Override
    public int actualizarMedico(int codigo, MedicoDTO medico) throws Exception {
        return 0;
    }

    @Override
    public void eliminarMedico(int codigo) throws Exception {
    }

    @Override
    public List<MedicoDTOAdmin> listarMedicos() throws Exception {
        return null;
    }

    @Override
    public InfoMedicoDTO obtenerMedico(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<PQRSDTOAdmin> listarPQRS() throws Exception {
        return null;
    }

    @Override
    public String responderPQRS(int codigo) throws Exception {
        return null;
    }

    @Override
    public InfoPQRSDTO verDetallePQRS(int codigo) throws Exception {
        return null;
    }

    @Override
    public List<CitaDTOAdmin> listarCitas() throws Exception {
        return null;
    }

    @Override
    public void denegarSolicitudCitaPaciente(int codigo, int cantidadCancelaciones) throws Exception {

    }
}
