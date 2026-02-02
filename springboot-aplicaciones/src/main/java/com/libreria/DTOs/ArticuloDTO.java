package com.libreria.DTOs;


public class ArticuloDTO {
    private Long id;
    private String nombre;
    private Double precio;
    private Integer cantStock;


    public ArticuloDTO(Long id, String nombre, Double precio, Integer cantStock){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Double getPrecio() {
        return precio;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public Integer getCantStock() {
        return cantStock;
    }


    public void setCantStock(Integer cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArticuloDTO{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", cantStock=").append(cantStock);
        sb.append('}');
        return sb.toString();
    }

    
}
