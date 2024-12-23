/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author EduPiry
 */

public class GestionIngredientes {
    private List<Ingrediente> ingredientes;

    public GestionIngredientes() {
        this.ingredientes = new ArrayList<>();
    }

    public GestionIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void registrarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

   

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    

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
