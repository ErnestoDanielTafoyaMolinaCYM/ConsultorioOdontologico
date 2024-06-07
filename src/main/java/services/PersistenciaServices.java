package services;

import models.Usuario;
import percistenceModel.HorarioJpaController;
import percistenceModel.OdontologoJpaController;
import percistenceModel.PacienteJpaController;
import percistenceModel.PersonaJpaController;
import percistenceModel.ResponsableJpaController;
import percistenceModel.SecretarioJpaController;
import percistenceModel.TurnoJpaController;
import percistenceModel.UsuarioJpaController;


public class PersistenciaServices {
    
    HorarioJpaController horarioJPA = new HorarioJpaController();
    OdontologoJpaController odontoJPA = new OdontologoJpaController();
    PacienteJpaController pacienteJPA = new PacienteJpaController();
    PersonaJpaController personaJPA = new PersonaJpaController();
    ResponsableJpaController responsableJPA = new ResponsableJpaController();
    SecretarioJpaController secretarioJPA = new SecretarioJpaController();
    TurnoJpaController turnoJPA = new TurnoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
        usuarioJPA.create(usuario);
    }
    
}
