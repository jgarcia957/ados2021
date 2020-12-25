/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Javi
 */
public class Articulo {
    private int id;
    private String descripcion;
    private double precio;
    private int stock;
    
    public Articulo(){}
    public Articulo(int idArticulo, String descripcion, double precio, int stock){
        this.id = idArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

   
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

  
    public String getDescripcion() {
        return descripcion;
    }

   
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    public double getPrecio() {
        return precio;
    }

   
    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
    public int getStock() {
        return stock;
    }

    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
