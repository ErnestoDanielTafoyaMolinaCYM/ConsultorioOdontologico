package controllers;

import models.Usuario;
import services.PersistenciaServices;


public class Controllers {
    
    PersistenciaServices services = new PersistenciaServices();
    
    public void  crearUsuario(int id, String nombre, String contrasenia, String rol){
        Usuario usuario = new Usuario(id, nombre, contrasenia, rol);
        services.crearUsuario(usuario);
    }
}
