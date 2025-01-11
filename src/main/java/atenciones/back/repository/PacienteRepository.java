package atenciones.back.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import atenciones.back.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findByRut(String rut);    
} 
