/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Clase que representa a un usuario de tipo niño(hereda de usuario)
 *
 * @author sofia rudas
 * @since 07042025
 * @version 1.0.0
 */
public class Nino extends Usuario{
    
    /**
     * Crea una nueva instancia de un usuario de tipo niño
     * 
     * @param nombre El nombre del usuario
     * @throws CampoVacioException Si el nombre proporcionado esta vacio o es invalido
     */
    public Nino(String nombre) throws CampoVacioException {
        setNombre(nombre);
        setTIPO("Niño");
        setVALOR_DESCUENTO(500);
    }
    
     /**
     * Obtiene el valor del descuento aplicado a los usuarios de este tipo
     * 
     * @return El valor del descuento (500)
     */
    @Override
    public double getValorDescuento() {
        return getVALOR_DESCUENTO();
    }
    
}
