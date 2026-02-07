package com.libreria.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.entity.Usuario;

public interface Repo_Usuario extends JpaRepository<Usuario, Long>{
    Optional<Usuario>findByUsuario(String usuario);

}
