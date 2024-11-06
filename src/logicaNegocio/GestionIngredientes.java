/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EduPiry
 */

public class GestionIngredientes {
    private Map<String, Ingrediente> ingredientes;

    public GestionIngredientes() {
        this.ingredientes = new HashMap<>();
    }

    public void registrarIngrediente(String nombre, double costo, int cantidadEnStock) {
        if (ingredientes.containsKey(nombre)) {
            System.out.println("El ingrediente " + nombre + " ya está registrado.");
        } else {
            Ingrediente ingrediente = new Ingrediente(nombre, costo, cantidadEnStock);
            ingredientes.put(nombre, ingrediente);
            System.out.println("Ingrediente registrado: " + nombre);
        }
    }

    // Actualiza el stock de un ingrediente al aceptar un pedido
    public void actualizarStock(String nombre, int cantidad) {
        Ingrediente ingrediente = ingredientes.get(nombre);
        if (ingrediente != null) {
            if (ingrediente.getCantidadEnStock() >= cantidad) {
                ingrediente.actualizarStock(cantidad);
                System.out.println("Stock de " + nombre + " actualizado. Cantidad restante: " + ingrediente.getCantidadEnStock());
            } else {
                System.out.println("No hay suficiente stock de " + nombre + " para esta operación.");
            }
        } else {
            System.out.println("El ingrediente " + nombre + " no está registrado.");
        }
    }

    // Muestra la información de todos los ingredientes registrados
    public void mostrarIngredientes() {
        if (ingredientes.isEmpty()) {
            System.out.println("No hay ingredientes registrados.");
        } else {
            System.out.println("Ingredientes registrados:");
            for (Ingrediente ingrediente : ingredientes.values()) {
                System.out.println(ingrediente);
            }
        }
    }

}
