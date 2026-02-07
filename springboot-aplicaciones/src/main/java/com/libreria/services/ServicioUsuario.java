package com.libreria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;

public class ServicioUsuario implements UserDetailsService {
    @Autowired
    Private Repo_Usuario repoUsuario;

    @Override
    public UserDetails cargaUsuario(String nombreUsuario) throws UsernameNotFoundException{
        var usuario = repoUsuario.findByUsername(nombreUsuario)
        .orElseThrow()
    }
}
