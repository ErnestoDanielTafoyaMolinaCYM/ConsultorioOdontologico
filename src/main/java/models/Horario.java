package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_horario;
    private String horario_inicia;
    private String horario_fin;

    public Horario() {
    }

    public Horario(int id_horario, String horario_inicia, String horario_fin) {
        this.id_horario = id_horario;
        this.horario_inicia = horario_inicia;
        this.horario_fin = horario_fin;
    }
    
    

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorario_inicia() {
        return horario_inicia;
    }

    public void setHorario_inicia(String horario_inicia) {
        this.horario_inicia = horario_inicia;
    }

    public String getHorario_fin() {
        return horario_fin;
    }

    public void setHorario_fin(String horario_fin) {
        this.horario_fin = horario_fin;
    }
    
    
}
