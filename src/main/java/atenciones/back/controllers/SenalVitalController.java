package atenciones.back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atenciones.back.Service.SenalVitalService;
import atenciones.back.model.SenalVital;

@RestController
@CrossOrigin
public class SenalVitalController {

    @Autowired
    private SenalVitalService senalVitalService;

    
    @PostMapping("/crear")
    public ResponseEntity<SenalVital> crearSenalVital(@RequestBody SenalVital senalVital) {
        SenalVital nuevaSenal = senalVitalService.crearSenalVital(senalVital);
        return new ResponseEntity<>(nuevaSenal, HttpStatus.CREATED);
    }

    // Endpoint para obtener todas las señales vitales
    @GetMapping("/todos")
    public ResponseEntity<List<SenalVital>> obtenerTodasSenalesVitales() {
        List<SenalVital> senalesVitales = senalVitalService.obtenerSenalesVitales();
        return new ResponseEntity<>(senalesVitales, HttpStatus.OK);
    }

    // Endpoint para obtener las señales vitales de un paciente por su RUT
    @GetMapping("/porRut/{rut}")
    public ResponseEntity<SenalVital> obtenerSenalVitalPorRut(@PathVariable String rut) {
        SenalVital senalVital = senalVitalService.obtenerSenalVitalPorRut(rut);
        if (senalVital != null) {
            return new ResponseEntity<>(senalVital, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
