/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

import java.util.ArrayList;
import java.util.List;

/**
 * permite gestionar las boletas compradas y generar la factura correspondiente con todos los detalles y descuentos aplicados
 *
 * @author sofia bermudez
 * @since 07042025
 * @version 1.0.0
 */
public class Venta {
    
    //lista de boletas asociadas con las ventas
    private List<Boleta> boleta;

    /**
    * Crea una nueva instancia de Venta con una lista vacia de boletas
    */
    public Venta() {
        this.boleta = new ArrayList<>();
    }

    /**
     * Devuelve una copia de la lista de boletas asociadas a la venta
     * 
     * @return lista de boletas
     */
    public List<Boleta> getBoleta() {
        return boleta;
    }

    /**
     * Establece la lista de boletas para esta venta
     * 
     * @param boleta la nueva lista de boletas
     */
    public void setBoleta(ArrayList<Boleta> boleta) {
        this.boleta = boleta;
    }
    
    /**
     * permite eliminar una boleta de la venta
     */
    public void removerBoleta(Boleta boleta) {
        this.boleta.remove(boleta);
    }
    
    /**
     * Agrega una nueva boleta a la lista de la venta
     * 
     * @param boleta la boleta que se desea agregar
     */
    public void agregarBoleta (Boleta boleta){
        this.boleta.add(boleta);
    }
}
