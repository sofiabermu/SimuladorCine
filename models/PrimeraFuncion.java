/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Representa la primera funcion que se realiza en el cine
 *
 * @author sofia bermudez
 * @since 07042025
 * @version 1.0.0
 */
public class PrimeraFuncion extends Funcion {
    
    /**
    * Inicializa la funcion con descuento del 50%
    */
    public PrimeraFuncion() {
        setPORCENTAJE_DESCUENTO(0.5);
    }
    
    /**
    * Retorna el porcentaje de descuento para la primera funcion
    * 
    * @return El porcentaje de descuento (50% en este caso).
    */
    @Override
    public double getPorcentajeDescuento() {
        return getPORCENTAJE_DESCUENTO();
    }
    
}
