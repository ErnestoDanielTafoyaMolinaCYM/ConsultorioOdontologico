package models;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Paciente extends Persona {
    
//    private int id_paciente;
    private boolean tiene_os;
    private String tipo_sangre;
    private Responsable unResponsable;
    private List<Turno> turnos;
    
    public Paciente() {
    }

//    public Paciente(int id_paciente, boolean tiene_os, String tipo_sangre, Responsable unResponsable, List<Turno> turnos, String dni, String nombre, String apellido, String telefono, String dirección, Date fecha_nac) {
//        super(dni, nombre, apellido, telefono, dirección, fecha_nac);
//        this.id_paciente = id_paciente;
//        this.tiene_os = tiene_os;
//        this.tipo_sangre = tipo_sangre;
//        this.unResponsable = unResponsable;
//        this.turnos = turnos;
//    }

    public Paciente(boolean tiene_os, String tipo_sangre, Responsable unResponsable, List<Turno> turnos, String dni, String nombre, String apellido, String telefono, String dirección, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, dirección, fecha_nac);
        this.tiene_os = tiene_os;
        this.tipo_sangre = tipo_sangre;
        this.unResponsable = unResponsable;
        this.turnos = turnos;
    }
    

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }


//    public int getId_paciente() {
//        return id_paciente;
//    }
//
//    public void setId_paciente(int id_paciente) {
//        this.id_paciente = id_paciente;
//    }

    public boolean isTiene_os() {
        return tiene_os;
    }

    public void setTiene_os(boolean tiene_os) {
        this.tiene_os = tiene_os;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    
    
    
}
