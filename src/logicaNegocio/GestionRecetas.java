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
import java.util.List;

public class GestionRecetas {
    private List<Receta> recetas;

    public GestionRecetas() {
        this.recetas = new ArrayList();
    }

    public void agregarReceta(Receta receta) {
        recetas.add(receta);
        System.out.println("Receta agregada: " + receta.getNombre());
    }
    public void modificarReceta(Receta receta){
        Receta recetaAux = new Receta();
        int indice = -1;
        for (int i = 0; i < recetas.size(); i++) {
            if(recetas.get(i).getNombre().equalsIgnoreCase(receta.getNombre())){
                indice = i;
                break;
            }
        }
        recetas.set(indice, receta);
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

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    

    
    
}

