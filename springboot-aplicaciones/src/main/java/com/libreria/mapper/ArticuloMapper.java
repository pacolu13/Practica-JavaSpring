package com.libreria.mapper;

import com.libreria.DTOs.ArticuloDTO;
import com.libreria.entity.Articulo;

public class ArticuloMapper {

    public static ArticuloDTO toDTO(Articulo articulo) {
        return new ArticuloDTO(articulo.getId(), articulo.getNombre(),
                articulo.getPrecio(), articulo.getCantStock());
    };

    public static Articulo toEntity(ArticuloDTO articuloDTO) {
        Articulo articulo = new Articulo();
        articulo.setId(articuloDTO.getId());
        articulo.setNombre(articuloDTO.getNombre());
        articulo.setPrecio(articuloDTO.getPrecio());
        articulo.setCantStock(articuloDTO.getCantStock());
        return articulo;
    }
}
