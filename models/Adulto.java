/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Clase que representa a un usuario de tipo adulto(hereda de usuario)
 *
 * @author sofia rudas
 * @since 07042025
 * @version 1.0.0
 */
public class Adulto extends Usuario{
    
    /**
     * Crea una nueva instancia de un usuario de tipo adulto
     * 
     * @param nombre El nombre del usuario
     * @throws CampoVacioException Si el nombre proporcionado esta vacio o es invalido
     */
    public Adulto(String nombre) throws CampoVacioException {
        setNombre(nombre);
        setTIPO("Adulto");
        setVALOR_DESCUENTO(0.0);
    }
    
     /**
     * Obtiene el valor del descuento aplicado a los usuarios de este tipo
     * 
     * @return El valor del descuento (0.0)
     */
    @Override
    public double getValorDescuento() {
        return getVALOR_DESCUENTO();
    }
}
