/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacioncine;

import aplicacioncine.models.Adulto;
import aplicacioncine.models.CampoVacioException;
import aplicacioncine.models.Cine;
import aplicacioncine.models.Funcion;
import aplicacioncine.models.FuncionNoche;
import aplicacioncine.models.FuncionTarde;
import aplicacioncine.models.Mayor;
import aplicacioncine.models.Nino;
import aplicacioncine.models.Pelicula;
import aplicacioncine.models.PrimeraFuncion;
import aplicacioncine.models.Usuario;
import aplicacioncine.models.ValorInvalidoException;
import java.util.List;
import java.util.Scanner;

/**
 * clase principal que simula una venta de boletas de cine a distintos tipos de usuarios aplicando descuentos segun el tipo de usuario y la funcion elegida
 *
 * @author sofia rudas
 * @version 1.0.0
 * @since 07042025
 */
public class AplicacionCine {

    public static void main(String[] args) throws CampoVacioException {
        
        Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine();
        
        boolean salir = false;
        
        while (!salir) {
            // Mostrar menú
            System.out.println("\n SISTEMA DE CINE ");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Vender boleta");
            System.out.println("4. Listar peliculas");
            System.out.println("5. Listar usuarios");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");
            
            try {
                int opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 0:
                        salir = true;
                        System.out.println("¡Gracias por usar el Sistema de Cine!");
                        break;
                        
                    case 1: // Agregar película
                        System.out.println("\n AGREGAR PELICULA ");
                        System.out.print("Nombre de la pelicula: ");
                        String nombrePelicula = scanner.nextLine();
                        
                        System.out.print("Costo base: ");
                        double costoBase = Double.parseDouble(scanner.nextLine());
                        
                        try {
                            Pelicula nuevaPelicula = new Pelicula(nombrePelicula, costoBase);
                            cine.agregarPelicula(nuevaPelicula);
                            System.out.println("PelIcula agregada con Exito");
                        } catch (CampoVacioException | ValorInvalidoException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case 2: // Registrar usuario
                        System.out.println("\n REGISTRAR USUARIO ");
                        System.out.print("Nombre del usuario: ");
                        String nombreUsuario = scanner.nextLine();
                        
                        System.out.println("Tipo de usuario:");
                        System.out.println("1. Niño");
                        System.out.println("2. Adulto");
                        System.out.println("3. Mayor");
                        System.out.print("Seleccione una opcion: ");
                        int tipoUsuario = Integer.parseInt(scanner.nextLine());
                        
                        try {
                            Usuario nuevoUsuario;
                            switch (tipoUsuario) {
                                case 1:
                                    nuevoUsuario = new Nino(nombreUsuario);
                                    break;
                                case 2:
                                    nuevoUsuario = new Adulto(nombreUsuario);
                                    break;
                                case 3:
                                    nuevoUsuario = new Mayor(nombreUsuario);
                                    break;
                                default:
                                    System.out.println("Tipo de usuario no valido");
                                    continue;
                            }
                            
                            cine.agregarUsuario(nuevoUsuario);
                            System.out.println("Usuario registrado con exito");
                        } catch (CampoVacioException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                        
                    case 3: // Vender boleta
                        System.out.println("\n VENDER BOLETA ");
                        
                        List<Pelicula> peliculas = cine.getPeliculas();
                        if (peliculas.isEmpty()) {
                            System.out.println("No hay peliculas disponibles");
                            continue;
                        }
                        
                        System.out.println("Peliculas disponibles:");
                        for (int i = 0; i < peliculas.size(); i++) {
                            System.out.println((i+1) + ". " + peliculas.get(i).getNombre() + " - $" + peliculas.get(i).getCostoBase());
                        }
                        
                        System.out.print("Seleccione el numero de la pelicula: ");
                        int peliculaIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        
                        if (peliculaIndex < 0 || peliculaIndex >= peliculas.size()) {
                            System.out.println("Numero de pelicula no valido");
                            continue;
                        }
                        
                        List<Usuario> usuarios = cine.getUsuarios();
                        if (usuarios.isEmpty()) {
                            System.out.println("No hay usuarios registrados");
                            continue;
                        }
                        
                        System.out.println("Usuarios registrados:");
                        for (int i = 0; i < usuarios.size(); i++) {
                            System.out.println((i+1) + ". " + usuarios.get(i).getNombre() + " (" + usuarios.get(i).getTipo() + ")");
                        }
                        
                        System.out.print("Seleccione el numero del usuario: ");
                        int usuarioIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        
                        if (usuarioIndex < 0 || usuarioIndex >= usuarios.size()) {
                            System.out.println("Numero de usuario no valido");
                            continue;
                        }
                        
                        System.out.println("Funciones disponibles:");
                        System.out.println("1. Primera Función (50% descuento)");
                        System.out.println("2. Funcion Tarde (10% descuento)");
                        System.out.println("3. Funcion Noche (sin descuento)");
                        
                        System.out.print("Seleccione la funcion: ");
                        int funcionOpcion = Integer.parseInt(scanner.nextLine());
                        
                        Funcion funcionSeleccionada;
                        switch (funcionOpcion) {
                            case 1:
                                funcionSeleccionada = new PrimeraFuncion();
                                break;
                            case 2:
                                funcionSeleccionada = new FuncionTarde();
                                break;
                            case 3:
                                funcionSeleccionada = new FuncionNoche();
                                break;
                            default:
                                System.out.println("Funcion no valida");
                                continue;
                        }
                        
                        System.out.print("Cantidad de boletas: ");
                        int cantidad = Integer.parseInt(scanner.nextLine());
                        
                        if (cantidad <= 0) {
                            System.out.println("La cantidad debe ser mayor a cero");
                            continue;
                        }
                        
                        cine.venderBoleta(peliculas.get(peliculaIndex), usuarios.get(usuarioIndex), funcionSeleccionada, cantidad);
                        break;
                        
                    case 4: // Listar películas
                        System.out.println("\n PELICULAS DISPONIBLES ");
                        List<Pelicula> listaPeliculas = cine.getPeliculas();
                        
                        if (listaPeliculas.isEmpty()) {
                            System.out.println("No hay peliculas registradas");
                        } else {
                            for (int i = 0; i < listaPeliculas.size(); i++) {
                                Pelicula p = listaPeliculas.get(i);
                                System.out.println((i+1) + ". " + p.getNombre() + " - Costo base: $" + p.getCostoBase());
                            }
                        }
                        break;
                        
                    case 5: // Listar usuarios
                        System.out.println("\n USUARIOS REGISTRADOS ");
                        List<Usuario> listaUsuarios = cine.getUsuarios();
                        
                        if (listaUsuarios.isEmpty()) {
                            System.out.println("No hay usuarios registrados");
                        } else {
                            for (int i = 0; i < listaUsuarios.size(); i++) {
                                Usuario u = listaUsuarios.get(i);
                                System.out.println((i+1) + ". " + u.getNombre() + " - Tipo: " + u.getTipo() + 
                                        " - Descuento: " + (u.getValorDescuento() * 100) + "%");
                            }
                        }
                        break;
                        
                    default:
                        System.out.println("Opcion no valida, Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un numero valido");
            }
        }
    } 
}
