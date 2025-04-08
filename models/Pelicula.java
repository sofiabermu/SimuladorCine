/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Representa una pelicula disponible en el cine que contiene el nombre de la pelicula y el costo base de la misma
 *
 * @author sofia rudas
 * @version 1.0.0
 * @since 07042025
 */
public class Pelicula {

    //Nombre de la pelicula
    private String nombre;
    
    //el costo base de la pelicula (sin descuentos)
    private double costoBase;

    /**
     * Crea una nueva instancia de pelicula con el nombre y costo base
     * 
     * @param nombre el nombre de la pelicula
     * @param costoBase el costo base de la pelicula
     */
    public Pelicula() {
        this.nombre = "";
        this.costoBase = 0.0;
    }
    
    /**
    * Crea una nueva instancia de Pelicula con un nombre y un costo base
    * 
    * @param nombre El nombre de la pelicula
    * @param costoBase El costo base de la pelicula, antes de aplicar descuentos o recargos
    * @throws CampoVacioException Si el nombre de la pelicula esta vacio o es nulo
    * @throws ValorInvalidoException Si el costo base es negativo o invalido
    */
    public Pelicula(String nombre, double costoBase) throws CampoVacioException, ValorInvalidoException {
        setNombre(nombre);
        setCostoBase(costoBase);
    }

     /**
     * Obtiene el nombre de la pelicula
     * 
     * @return el nombre de la pelicula
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la pelicula
     * 
     * @param nombre el nuevo nombre de la pelicula
     */
     public void setNombre(String nombre) throws CampoVacioException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new CampoVacioException("El nombre de la película no puede estar vacío");
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene el costo base de la pelicula
     * 
     * @return el costo base
     */
    public double getCostoBase() {
        return costoBase;
    }

     /**
     * Establece un nuevo costo base para la pelicula
     * 
     * @param costoBase el nuevo costo base
     */
    public void setCostoBase(double costoBase) throws ValorInvalidoException {
        if (costoBase < 0) {
            throw new ValorInvalidoException("El costo base no puede ser negativo");
        }
        this.costoBase = costoBase;
    } 
}
