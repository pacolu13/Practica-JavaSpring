package com.libreria.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.DTOs.ArticuloDTO;
import com.libreria.mapper.ArticuloMapper;
import com.libreria.repositories.RepoArticulo;

@Service
public class ServicioArticulo {
    @Autowired
    private RepoArticulo repositorio;

    public List<ArticuloDTO> consulta(){
        return repositorio.findAll().stream().map(ArticuloMapper::toDTO)
        .collect(Collectors.toList());
    }
}
