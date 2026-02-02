package com.libreria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.entity.Articulo;

//proporciona una capa de accesibilidad sin repetir datos
public interface RepoArticulo extends JpaRepository<Articulo, Long> {

}
