/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author EduPiry
 */
public class SeccionCocina {
    protected String nombre;
    protected PoliticaAceptacion politica;
    protected Set<Ingrediente> ingredientes;
    protected List<Receta> recetasPendientes;

    public SeccionCocina(String nombre, PoliticaAceptacion politica) {
        this.nombre = nombre;
        this.politica = politica;
        this.ingredientes = new HashSet();
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

    public Set<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public boolean aceptaComida(Comida comida) {
        return politica.acepta(comida);
    }

    public void prepararComida(Comida comida) {
        if (aceptaComida(comida)) {
            for (Ingrediente ingredienteStock : ingredientes) {
                for (Ingrediente ingredienteReceta : comida.getReceta().getIngredientes()) {
                    if(ingredienteStock.getNombre().equalsIgnoreCase(ingredienteReceta.getNombre())){
                        ingredienteStock.actualizarStock(ingredienteReceta.getCantidadEnStock());
                    }
                }
            }
        }    
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }
}
