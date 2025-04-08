/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aplicacioncine.models;

/**
 * Representa a un usuario del sistema de cine (niño, adulto, mayor) con diferentes tipos de descuentos
 *
 * @author sofia rudas
 * @version 1.0.0
 * @since 07042025
 */
public abstract class Usuario {
    
    // Nombre del usuario
    private String nombre;
    
    // descuento segun el tipo de usuario
    private double VALOR_DESCUENTO;
    
    // tipo de usuario
    private String TIPO;
    
    /**
    * retorna el valor de descuento segun el tipo de usuario
    * 
    * @return El valor del descuento
    */
    public abstract double getValorDescuento();
    
    /**
    * Obtiene el nombre del usuario
    * 
    * @return El nombre del usuario
    */
    public String getNombre() {
        return nombre;
    }
    
    /**
    * Establece el nombre del usuario
    * 
    * @param nombre El nombre a asignar
    * @throws CampoVacioException Si el nombre esta vacio o es nulo
    */
    public void setNombre(String nombre) throws CampoVacioException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new CampoVacioException("El nombre del usuario no puede estar vacío");
        }
        this.nombre = nombre;
    }
    
    /**
    * Obtiene el valor del descuento asignado al usuario
    * 
    * @return El valor del descuento 
    */
    public double getVALOR_DESCUENTO() {
        return VALOR_DESCUENTO;
    }
    
    /**
    * Establece el valor del descuento para el usuario
    * 
    * @param valor El valor del descuento
    */
    public void setVALOR_DESCUENTO(double valor) {
        this.VALOR_DESCUENTO = valor;
    }
    
    /**
    * Obtiene el tipo del usuario
    * 
    * @return El tipo de usuario
    */
    public String getTipo() {
        return TIPO;
    }
    
    /**
    * Establece el tipo de usuario
    * 
    * @param tipo El tipo de usuario a asignar
    */
    public void setTIPO(String tipo) {
        this.TIPO = tipo;
    }
    
}
