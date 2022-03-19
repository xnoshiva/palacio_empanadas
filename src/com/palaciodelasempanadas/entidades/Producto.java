package com.palaciodelasempanadas.entidades;

public class Producto {
    private int id;
    private long precio;
    private String nombre;
    private String tipo;

    public int getId(){
        return this.id;
    }

    public long getPrecio(){
        return this.precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}



