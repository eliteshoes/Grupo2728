package com.elite.shoes.ShoesApplication.servicios;

import com.elite.shoes.ShoesApplication.entidades.Usuario;
import com.elite.shoes.ShoesApplication.repositorios.repositorioUsuarios;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiciosUsuario {

    private repositorioUsuarios repositorioUs;

    public ServiciosUsuario(repositorioUsuarios repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    public repositorioUsuarios getRepositorioUs() {
        return repositorioUs;
    }

    public void setRepositorioUs(repositorioUsuarios repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    //Metodos Funcionales

    //Funcion que busca al Usuario
    public Usuario buscarPorEmail(String email){
        return this.repositorioUs.findByEmail(email);
    }

    //Funcion que guarda al Usuario
    public Usuario crearUsuario(Usuario nuevoUsuario){
        return this.repositorioUs.save(nuevoUsuario);
    }


    public Usuario getCreateUsuario(Map<String, Object> DatosUsuario){
        String email =(String) DatosUsuario.get("email");
        Usuario usuario = buscarPorEmail(email);
        if (usuario == null){
            String alias = (String) DatosUsuario.get("nickname");
            String imagen = (String) DatosUsuario.get("picture");
            String auth0Id = (String) DatosUsuario.get("sub");

            Usuario nuevoUsuario = new Usuario(email=email, imagen=imagen, auth0Id=auth0Id);
            return crearUsuario(nuevoUsuario);
        }
        System.out.println(usuario.getEmail());
        return usuario;
    }
}
