/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncine.models;

/**
 * Representa una boleta de cine asociada a una pelicula, una funcion y usuario
 * La boleta calcula el costo con base en el costo de la película y el descuento aplicado al usuario
 * Si el descuento resulta en un costo negativo, se lanza una excepcion.
 *
 * @author sofia bermudez
 * @version 1.0.0
 * @since 07042025
 */
public class Boleta {
    
    //La pelicula asociada a la boleta
    private Pelicula pelicula;
    
    // el tipo de funcion de la pelicula
    private Funcion funcion;
    
    //el usuario que compra la boleta
    private Usuario usuario;
    
    //el costo que tiene la boleta
    private double costo;

    /**
     * Crea una boleta con la pelicula, funciin y usuario
     * El costo de la boleta se calcula automáticamente al momento de crearla.
     * 
     * @param pelicula la pelicula asociada a la boleta
     * @param funcion la funcion asociada a la boleta
     * @param usuario el usuario que compra la boleta
     * @throws IllegalArgumentException si el costo final es menor a 0
     */
    public Boleta(Pelicula pelicula, Funcion funcion, Usuario usuario) {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        calcularCosto();
    }
    
    /**
     * Calcula el costo de la boleta tomando el costo base de la película y el descuento del usuario
     * 
     */
    public void calcularCosto() {
        double costoBase = pelicula.getCostoBase();
        double descuentoUsuario = costoBase * usuario.getValorDescuento();
        double descuentoFuncion = costoBase * funcion.getPorcentajeDescuento();
        this.costo = costoBase - descuentoUsuario - descuentoFuncion;
        if (this.costo < 0) {
            this.costo = 0; 
        }
    }
    
    /**
    * Obtiene la pelicula asociada a esta boleta
    * 
     * @return La pelicula
    */
    public Pelicula getPelicula() {
        return pelicula;
    }
    
    /**
    * Asigna una pelicula a esta boleta y recalcula el costo
    * 
    * @param pelicula La pelicula a asignar
    */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        calcularCosto();
    }

    /**
    * Obtiene la funcion asociada a esta boleta
    * 
    * @return La funcion
    */
    public Funcion getFuncion() {
        return funcion;
    }
    
    /**
    * Asigna una funcion a esta boleta y recalcula el costo
    * 
    * @param funcion La funcion a asignar
    */
    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
        calcularCosto();
    }
    

    /**
    * Obtiene el usuario que compra esta boleta
    * 
    * @return El usuario
    */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
    * Asigna un usuario a esta boleta y recalcula el costo
    * 
    * @param usuario El usuario que compra la boleta
    */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        calcularCosto();
    }

    /**
    * Obtiene el costo final de la boleta
    * 
    * @return El costo de la boleta
    */
    public double getCosto() {
        return costo;
    }

    /**
    * Asigna un valor especifico al costo de la boleta
    * 
    * @param costo El costo a asignar
    * @throws ValorInvalidoException Si el valor del costo es negativo
    */
    public void setCosto(double costo) throws ValorInvalidoException {
        if (costo < 0) {
            throw new ValorInvalidoException("El costo no puede ser negativo");
        }
        this.costo = costo;
    }
     
    /**
    * representa la pelicula, funcion, usuario y costo de la boleta que compro la persona
    * 
    * @return Cadena que representa esta boleta
    */
    @Override
    public String toString() {
        return "Boleta{" +
                "pelicula='" + pelicula.getNombre() + '\'' +
                ", funcion=" + funcion.getClass().getSimpleName() +
                ", usuario=" + usuario.getNombre() + " (" + usuario.getTipo() + ")" +
                ", costo=" + costo +
                '}';
    }
}
