/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cine que gestiona peliculas, usuarios y ventas de boletas permitiendo agregar, eliminar, buscar películas y gestionar usuarios
 *
 * @author sofia rudas
 * @since 07042025
 * @version 1.0.0
 */
public class Cine {
    
    //Es la lista de peliculas disponibles
    private List<Pelicula> peliculas;
    
    //Lista de usuarios 
    private List<Usuario> usuarios;
    
    /**
     * Crea una nueva instancia con listas vacías de películas y usuarios.
     */
    public Cine(){
        this.peliculas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    /**
     * Agrega una pelicula a la lista de peliculas del cine
     * 
     * @param pelicula la pelicula que se desea agregar
     */
    public void agregarPelicula (Pelicula pelicula){
        peliculas.add(pelicula);   
    }
    
     /**
     * Elimina una pelicula de la lista de peliculas del cine
     * 
     * @param pelicula la pelicula que se desea eliminar
     */
    public void eliminarPelicula (Pelicula pelicula){
        peliculas.remove(pelicula);   
    }
    
    /**
     * Busca una pelicula por su nombre
     * 
     * @param nombre el nombre de la pelicula a buscar
     * @return la pelicula encontrada, o es null si no existe
     */
    public Pelicula buscarPelicula (String nombre){
        for(Pelicula p : peliculas){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                return p;
            }
        }
        return null;
    }
    
    /**
     * Agrega o actualiza un usuario en la lista de usuarios del cine
     * Si el usuario ya existe se actualiza. Si no se agrega
     * 
     * @param usuario el usuario a gestionar
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    /**
     * Vende una boleta para una pelicula, funcion y usuario determinado
     * 
     * @param pelicula la pelicula para la que se vende la boleta
     * @param usuario el usuario que compra la boleta
     * @param funcion la funcion en la que se mostraraa la pelicula
     * @param cantidad la cantidad de boletas
     */
    public void venderBoleta(Pelicula pelicula, Usuario usuario, Funcion funcion, int cantidad) {
        Venta venta = new Venta();
        Factura factura = new Factura();
        
        for (int i = 0; i < cantidad; i++) {
            Boleta boleta = new Boleta(pelicula, funcion, usuario);
            venta.agregarBoleta(boleta);
            factura.agregarBoleta(boleta);
        }
        
        factura.mostrarFactura();
    } 
    
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
