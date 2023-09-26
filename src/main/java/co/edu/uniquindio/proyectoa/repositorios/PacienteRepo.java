package co.edu.uniquindio.proyectoa.repositorios;

import co.edu.uniquindio.proyectoa.modelo.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepo extends JpaRepository<Paciente,Integer> {

}
