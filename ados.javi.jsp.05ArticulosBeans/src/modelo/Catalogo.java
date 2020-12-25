/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author javi
 */
public class Catalogo {
    private ArrayList<Articulo> articulos;
    public Catalogo(){
        articulos = new ArrayList<>();
        cargarArticulos();
    }
    public ArrayList<Articulo> getArticulos(){
        return articulos;
    }
    
    public void cargarArticulos(){
        //Podria leer los articulos de un fichero
        articulos.add(new Articulo(1,"Azucar",0.85,10));
        articulos.add(new Articulo(2,"Sal",0.7,10));
        articulos.add(new Articulo(3,"Aceite",3.85,10));
        articulos.add(new Articulo(4,"Garanzos",0.90,10));
        articulos.add(new Articulo(5,"Alubias",0.95,10));
        articulos.add(new Articulo(6,"Arroz",1.25,10));
        articulos.add(new Articulo(7,"Vinagre",1.0,10));
        articulos.add(new Articulo(8,"Macarrones",0.75,10));
        articulos.add(new Articulo(9,"Leche",1.40,10));
        articulos.add(new Articulo(10,"Harina",0.5,10));
    }
    public void guardarArticulos(){
        //Podria guardar los articulos en un fichero
    }
}
