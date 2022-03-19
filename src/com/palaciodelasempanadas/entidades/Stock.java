package com.palaciodelasempanadas.entidades;

import java.util.ArrayList;

public class Stock {
    private ArrayList<DetalleStock> listaProducto;

    public Stock(){
        this.listaProducto = new ArrayList();
    }

    public void  modifcarListaProducto(int cantProducto,int idProducto){
        for (int x=0; x<listaProducto.size() ; x++){
            DetalleStock elemento = listaProducto.get(x);
            Producto proElemento = elemento.getProducto();
            int idElemento = proElemento.getId();
            if(idProducto==idElemento){
                elemento.setCantProducto(cantProducto);
            }
        }
    }
    public void agregarProducto(int cantProducto, int idProducto){


    }
    public  void restarProducto(int cantProducto, int idProducto){


    }

    public  ArrayList<DetalleStock> mostrarListaProducto(){

    }

}
