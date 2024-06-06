package models;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Secretario extends Persona {
//    private int id_secretario;
    private String sector;
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario unUsuario, String dni, String nombre, String apellido, String telefono, String dirección, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, dirección, fecha_nac);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }
    
    

//    public int getId_secretario() {
//        return id_secretario;
//    }
//
//    public void setId_secretario(int id_secretario) {
//        this.id_secretario = id_secretario;
//    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
}
