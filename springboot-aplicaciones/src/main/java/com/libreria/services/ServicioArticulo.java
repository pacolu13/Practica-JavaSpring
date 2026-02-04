package com.libreria.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.DTOs.ArticuloDTO;
import com.libreria.entity.Articulo;
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

    public ArticuloDTO buscarPorId(Long id) {
    Articulo articulo = repositorio.findById(id).orElseThrow();
    return ArticuloMapper.toDTO(articulo);
}


    public ArticuloDTO insertarArticulo(ArticuloDTO dto){
        Articulo articulo = ArticuloMapper.toEntity(dto);
        Articulo insertado = repositorio.save(articulo);
        return ArticuloMapper.toDTO(insertado);
    }

    public ArticuloDTO actualizarArticulo(Long id, ArticuloDTO dto){
        Optional<Articulo> existe = repositorio.findById(id);
        if(existe.isPresent()){
            Articulo articulo = existe.get();
            articulo.setNombre(dto.getNombre());
            articulo.setPrecio(dto.getPrecio());
            articulo.setCantStock(dto.getCantStock());

            Articulo actualizado = repositorio.save(articulo);
            return ArticuloMapper.toDTO(actualizado);
        }else{
            throw new RuntimeException("Articulo no encuentrado con id:" + id);
        }
    }

    public StringBuilder eliminarArticulo(Long id){
        StringBuilder sb = new StringBuilder();
        if (repositorio.existsById(id)){
            repositorio.deleteById(id);
            sb.append("Se elimino correctamente");
        } else{
            sb.append("No se encontro un articulo");
        }
        return sb;
    }
}

