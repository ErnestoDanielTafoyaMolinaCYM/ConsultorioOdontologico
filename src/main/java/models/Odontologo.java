package models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable{
    
//    private int id_odontologo;
    private String especialidad;
    @OneToMany(mappedBy = "odonto")
    private List<Turno> turnos;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> turnos, Usuario unUsuario, Horario horario, int id, String dni, String nombre, String apellido, String telefono, String dirección, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, dirección, fecha_nac);
        this.especialidad = especialidad;
        this.turnos = turnos;
        this.unUsuario = unUsuario;
        this.horario = horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
     
    
}
