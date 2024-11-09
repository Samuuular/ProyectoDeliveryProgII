/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author EduPiry
 */
public class SeccionCocina {
    protected String nombre;
    protected PoliticaAceptacion politica;
    protected Map<Ingrediente, Integer> stockIngredientes;
    protected List<Receta> recetasPendientes;

    public SeccionCocina(String nombre, PoliticaAceptacion politica) {
        this.nombre = nombre;
        this.politica = politica;
        this.stockIngredientes = new HashMap<>();
        this.recetasPendientes = new ArrayList<>();
    }

    public List<Receta> getRecetasPendientes() {
        return recetasPendientes;
    }

    public void setRecetasPendientes(List<Receta> recetasPendientes) {
        this.recetasPendientes = recetasPendientes;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PoliticaAceptacion getPolitica() {
        return politica;
    }

    public void setPolitica(PoliticaAceptacion politica) {
        this.politica = politica;
    }

    public Map<Ingrediente, Integer> getStockIngredientes() {
        return stockIngredientes;
    }

    public void setStockIngredientes(Map<Ingrediente, Integer> stockIngredientes) {
        this.stockIngredientes = stockIngredientes;
    }
    

    public boolean aceptaComida(Comida comida) {
        return politica.acepta(comida);
    }

    public void prepararComida(Comida comida) {
        if (aceptaComida(comida)) {
            // Marca la receta como pendiente en la lista de recetas
            recetasPendientes.add(comida.getReceta());

            Map<Ingrediente, Integer> ingredientesNecesarios = comida.getReceta().getIngredientes();
            boolean suficienteStock = true;
            Map<Ingrediente, Integer> stockTemporal = new HashMap<>(stockIngredientes);

            // Verifica y actualiza el stock para cada ingrediente en una sola iteración
            for (Map.Entry<Ingrediente, Integer> entry : ingredientesNecesarios.entrySet()) {
                Ingrediente ingrediente = entry.getKey();
                int cantidadNecesaria = entry.getValue();
                int cantidadDisponible = stockTemporal.getOrDefault(ingrediente, 0);

                if (cantidadDisponible < cantidadNecesaria) {
                    suficienteStock = false;
                    System.out.println("Stock insuficiente de " + ingrediente.getNombre() + " en la sección " + nombre);
                    break;
                }
                stockTemporal.put(ingrediente, cantidadDisponible - cantidadNecesaria);
            }

            if (suficienteStock) {
                // Aplica el cambio al stock real
                stockIngredientes.putAll(stockTemporal);
                System.out.println("Comida " + comida.getNombre() + " preparada en la sección " + nombre);

                // Marca la comida como preparada (estado a true o 1)
                comida.setPreparada(true);
            } else {
                System.out.println("No se puede preparar la comida " + comida.getNombre() + " en la sección " + nombre + " debido a falta de ingredientes.");
                
                // Marca la comida como no preparada (estado a false o 0)
                comida.setPreparada(false);
            }
        } else {
            System.out.println("Comida " + comida.getNombre() + " no aceptada en la sección " + nombre);
        }
    }

    public void agregarIngrediente(Ingrediente ingrediente, int cantidad) {
        stockIngredientes.put(ingrediente, stockIngredientes.getOrDefault(ingrediente, 0) + cantidad);
    }
}
