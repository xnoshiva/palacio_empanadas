package com.palaciodelasempanadas.entidades;

public class DetalleStock {
  private   int cantProducto;
  private   Producto producto;

    public int getCantProducto() {
        return this.cantProducto;
    }
    public Producto getProducto(){
        return  this.producto;
    }

    public void setCantProducto(int cantProducto){
        this.cantProducto=cantProducto;
    }
    public void setProducto(Producto producto){
        this.producto=producto;
    }
}
