package atenciones.back.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class SenalVital {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carta_seq")
    @SequenceGenerator(name = "carta_seq", sequenceName = "carta_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @Column(name = "temperatura")
    private Double temperatura;
    @Column(name = "pulso")
    private Integer pulso;
    @Column(name = "ritmo_respiratorio")
    private Integer ritmoRespiratorio;
    @Column(name = "presion_arterial")
    private String presionArterial;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "paciente_estado")
    private String pacienteEstado;

    @ManyToOne
    @JoinColumn(name = "paciente_rut", referencedColumnName = "rut")
    private Paciente paciente;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }
    public Integer getPulso() {
        return pulso;
    }
    public void setPulso(Integer pulso) {
        this.pulso = pulso;
    }
    public Integer getRitmoRespiratorio() {
        return ritmoRespiratorio;
    }
    public void setRitmoRespiratorio(Integer ritmoRespiratorio) {
        this.ritmoRespiratorio = ritmoRespiratorio;
    }
    public String getPresionArterial() {
        return presionArterial;
    }
    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getPacienteEstado() {
        return pacienteEstado;
    }
    public void setPacienteEstado(String pacienteEstado) {
        this.pacienteEstado = pacienteEstado;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
