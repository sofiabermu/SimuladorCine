/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una factura generada a partir de la compra de una boleta (pelicula, usuario, descuentos aplicados, funcion)
 *
 * @author sofia bermudez
 * @since 07042025
 * @version 1.0.0
 */
public class Factura {
    
    //Lista de boletas que se deben incluir en la factura
    private List<Boleta> boleta;
    
    /**
     * Crea una factura con la lista de boletas
     */
    public Factura (){
        this.boleta = new ArrayList<>();
    }
    
     /**
     * Muestra el contenido de la factura (usuario, pelicula, funcion, costos)
     */
    public void mostrarFactura(){
        
        System.out.println("--FACUTA--");
        double total = 0;
        for (Boleta boletas : boleta) {
            System.out.println(boletas);
            total += boletas.getCosto();
        }
        System.out.println("Total: " + total); 
    }
    
    /**
     * Devuelve una copia de la lista de boletas incluidas en la factura
     * 
     * @return una lista de boletas
     */
    public List<Boleta> getBoletas(){
        return boleta;
    }
    
     /**
     * Asigna una lista completa de boletas al usuario
     * 
     * @param boleta Lista de boletas que se desean asignar
     */
    public void setBoletas(ArrayList<Boleta> boleta) {
        this.boleta = boleta;
    }
    
    /**
    * Agrega una boleta individual a la lista de boletas existentes
    * 
    * @param boleta La boleta que se desea agregar
    */
    public void agregarBoleta(Boleta boleta) {
        this.boleta.add(boleta);
    }
    
    /**
     * Determina el tipo de usuario segun la instancia proporcionada.
     * 
     * @param usuario el usuario del cual se desea conocer el tipo
     * @return una cadena representando el tipo de usuario
     */
    private Usuario getTipoUsuario(Usuario usuario){
        return usuario;
    }
    
    /**
     * Determina el tipo de funcion segun la instancia proporcionada
     * 
     * @param funcion la función de la cual se desea conocer el tipo
     * @return una cadena representando el tipo de funcion
     */
    private Funcion getTipoFuncion (Funcion funcion){
        return funcion;
    }
    
    /**
     * Obtiene el porcentaje de descuento de acuerdo a una funcion
     * 
     * @param funcion la funcion a evaluar
     * @return el porcentaje de descuento
     */
    private double getDescuentoFuncion (Funcion funcion){
        return funcion.getPorcentajeDescuento();
    }   
}
