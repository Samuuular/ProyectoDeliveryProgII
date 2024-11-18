/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author EduPiry
 */

public class GestionIngredientes {
    private Set<Ingrediente> ingredientes;

    public GestionIngredientes() {
        this.ingredientes = new HashSet<>();
    }

    public void registrarIngrediente(String nombre, double costo, int cantidadEnStock) {
        
        Ingrediente ingrediente = new Ingrediente(nombre, costo, cantidadEnStock);
        ingredientes.add(ingrediente);
        System.out.println("Ingrediente registrado: " + nombre);
        
    }

    // Actualiza el stock de un ingrediente al aceptar un pedido
    public void actualizarStockGestion(Comida comida) {
        Iterator<Ingrediente> iterator = ingredientes.iterator();

        while (iterator.hasNext()) {
            Ingrediente ingredienteRestaurante = iterator.next();

            for (Ingrediente ingrediente : comida.getReceta().getIngredientes()) {
                if (ingredienteRestaurante.getNombre().equalsIgnoreCase(ingrediente.getNombre())) {
                    ingredienteRestaurante.actualizarStock(ingrediente.getCantidadNecesaria());

                    if (ingredienteRestaurante.getCantidadEnStock() <= 0) {
                        iterator.remove();
                    }
                }
            }
        }
    }

    // Muestra la información de todos los ingredientes registrados
    public void mostrarIngredientes() {
        if (ingredientes.isEmpty()) {
            System.out.println("No hay ingredientes registrados.");
        } else {
            System.out.println("Ingredientes registrados:");
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(ingrediente);
            }
        }
    }

}
