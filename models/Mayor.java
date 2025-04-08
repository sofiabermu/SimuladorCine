/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Clase que representa a un usuario de tipo mayor (hereda de la clase usuario)
 *
 * @author sofia rudas
 * @since 07042025
 * @version 1.0.0
 */
public class Mayor extends Usuario{
    
     /**
     * Crea una nueva instancia de un usuario de tipo mayor
     * 
     * @param nombre El nombre del usuario
     * @throws CampoVacioException Si el nombre proporcionado esta vacío o es invalido
     */
    public Mayor(String nombre) throws CampoVacioException {
        setNombre(nombre);
        setTIPO("Mayor");
        setVALOR_DESCUENTO(1000);
    }
    
     /**
     * Obtiene el valor del descuento aplicado a los usuarios de este tipo
     * 
     * @return El valor del descuento (1000)
     */
    @Override
    public double getValorDescuento() {
        return getVALOR_DESCUENTO();
    }
}
