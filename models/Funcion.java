/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aplicacioncine.models;

/**
 * Representa una función de cine que puede aplicar un porcentaje de descuento sobre el costo de una boleta 
 * Es una clase abstracta que se implementa en los 3 tipos de funciones
 *
 *
 * @author sofia bermudez
 * @since 07042025
 * @version 1.0.0
 */
public abstract class Funcion {
    
    //Porcentaje de descuento de la funcion
    private double PORCENTAJE_DESCUENTO;
    
    /**
    * define cómo se calcula o retorna el porcentaje de descuento
    * 
    * @return El porcentaje de descuento aplicado
    */
    public abstract double getPorcentajeDescuento();
    
    /**
    * Asigna un porcentaje de descuento segun el tipo de funcion
    * 
    * @param porcentaje El valor del porcentaje de descuento 
    */
    public void setPORCENTAJE_DESCUENTO(double porcentaje) {
        this.PORCENTAJE_DESCUENTO = porcentaje;
    }
    
    /**
    * Obtiene el porcentaje de descuento asignado actualmente
    * 
    * @return El porcentaje de descuento
    */
    public double getPORCENTAJE_DESCUENTO() {
        return PORCENTAJE_DESCUENTO;
    }
      
}
