package atenciones.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import atenciones.back.model.SenalVital;

public interface ServiceRepository extends JpaRepository<SenalVital, Long> {
    SenalVital findByRut(String rut);    
} 
