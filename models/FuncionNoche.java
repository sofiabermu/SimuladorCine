/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Representa una funcion de cine que se realiza en la noche
 *
 * @author sofia bermudez
 * @version 1.0.0
 * @since 07042025
 */
public class FuncionNoche extends Funcion{
    
    /**
    * Inicializa la funcion sin descuentyo(las funciones de noche no tienen descuento)
    */
    public FuncionNoche() {
        setPORCENTAJE_DESCUENTO(0); 
    }
    
    /**
    * Retorna el porcentaje de descuento para una funcion nocturna
    * 
    * @return El porcentaje de descuento (0.0 en este caso)
    */
    @Override
    public double getPorcentajeDescuento() {
        return getPORCENTAJE_DESCUENTO();
    }    
}
