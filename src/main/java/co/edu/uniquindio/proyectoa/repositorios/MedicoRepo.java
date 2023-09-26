package co.edu.uniquindio.proyectoa.repositorios;

import co.edu.uniquindio.proyectoa.modelo.entidades.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepo extends JpaRepository<Medico,Integer> {

    @Query ("SELECT m FROM Medico m WHERE m.cedula = :cedula")
    Medico buscarPorCedula(String cedula);

    @Query ("SELECT m FROM Medico m WHERE m.correo = :correo")
    Medico buscarPorCorreo(String correo);
}
