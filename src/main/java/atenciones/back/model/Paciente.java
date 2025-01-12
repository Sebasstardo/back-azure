package atenciones.back.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Puedes usar otra estrategia según tu base de datos
    @Column(name = "id")
    private Long id;
    @Column(name = "paciente_rut", unique = true, nullable = false)    
    private String paciente_rut;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Column(name = "sexo")
    private String sexo;
    
    @OneToMany(mappedBy = "paciente")
    private List<SenalVital> senalesVitales;

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<SenalVital> getSenalesVitales() {
        return senalesVitales;
    }

    public void setSenalesVitales(List<SenalVital> senalesVitales) {
        this.senalesVitales = senalesVitales;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaciente_rut() {
        return paciente_rut;
    }

    public void setPaciente_rut(String paciente_rut) {
        this.paciente_rut = paciente_rut;
    }
}
