/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author EduPiry
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionRecetas {
    private Set<Receta> recetas;

    public GestionRecetas() {
        this.recetas = new HashSet();
    }

    public void agregarReceta(Receta receta) {
        recetas.add(receta);
        System.out.println("Receta agregada: " + receta.getNombre());
    }

    public void definirRecetasDependientes(Receta receta, List<Receta> recetasDependientes) {
        if (recetas.contains(receta)) {
            receta.setRecetasDependientes(recetasDependientes);
            System.out.println("Recetas dependientes definidas para: " + receta.getNombre());
        } else {
            System.out.println("Receta no encontrada.");
        }
    }

    public void mostrarRecetas() {
        for (Receta receta : recetas) {
            System.out.println("Receta: " + receta.getNombre() +
                               " - Tipo: " + receta.getTipo() +
                               " - Complejidad: " + receta.getComplejidad() +
                               " - Dependencias: " + receta.getRecetasDependientes());
        }
    }

    public Set<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(Set<Receta> recetas) {
        this.recetas = recetas;
    }

    
    
}

