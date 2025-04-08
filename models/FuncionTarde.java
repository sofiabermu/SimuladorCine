/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Representa una funcion de cine que se realiza en la tarde
 *
 * @author sofia bermudez
 * @since 07042025
 * @version 1.0.0
 */
public class FuncionTarde extends Funcion{
    
    /**
    * Inicializa la funcion con un descuento del 10%
    */
    public FuncionTarde() {
        setPORCENTAJE_DESCUENTO(0.1);
    }
    
    /**
    * Retorna el porcentaje de descuento para una funcion tarde.
    * 
    * @return El porcentaje de descuento (10% en este caso).
    */
    @Override
    public double getPorcentajeDescuento() {
        return getPORCENTAJE_DESCUENTO();
    }    
    
}
