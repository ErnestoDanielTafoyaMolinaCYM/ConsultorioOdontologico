package models;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Odontologo extends Persona{
    
//    private int id_odontologo;
    private String especialidad;
    private List<Turno> turnos;
    private Usuario unUsuario;
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> turnos, Usuario unUsuario, Horario horario, String dni, String nombre, String apellido, String telefono, String dirección, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, dirección, fecha_nac);
        this.especialidad = especialidad;
        this.turnos = turnos;
        this.unUsuario = unUsuario;
        this.horario = horario;
    }
    
    

//    public Odontologo(int id_odontologo, String especialidad, List<Turno> turnos, Usuario unUsuario, Horario horario, String dni, String nombre, String apellido, String telefono, String dirección, Date fecha_nac) {
//        super(dni, nombre, apellido, telefono, dirección, fecha_nac);
//        this.id_odontologo = id_odontologo;
//        this.especialidad = especialidad;
//        this.turnos = turnos;
//        this.unUsuario = unUsuario;
//        this.horario = horario;
//    }

//    public int getId_odontologo() {
//        return id_odontologo;
//    }
//
//    public void setId_odontologo(int id_odontologo) {
//        this.id_odontologo = id_odontologo;
//    }

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
