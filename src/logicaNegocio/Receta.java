/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList; 
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author EduPiry
 */
public class Receta {
    private List<Ingrediente> ingredientes;
    private int tiempoCoccion;
    private boolean modoPreparacion;
    private String tipo; 
    private String complejidad; 
    private List<Receta> recetasDependientes;
    private String nombre;

    public Receta(List<Ingrediente> ingredientes, int tiempoCoccion, boolean modoPreparacion, String tipo, String complejidad, List<Receta> recetasDependientes, String nombre) {
        this.ingredientes = new ArrayList<>();
        this.tiempoCoccion = tiempoCoccion;
        this.modoPreparacion = modoPreparacion;
        this.tipo = tipo;
        this.complejidad = complejidad;
        this.recetasDependientes = recetasDependientes;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public boolean getModoPreparacion() {
        return modoPreparacion;
    }

    public void setModoPreparacion(boolean modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public List<Receta> getRecetasDependientes() {
        return recetasDependientes;
    }

    public void setRecetasDependientes(List<Receta> recetasDependientes) {
        this.recetasDependientes = recetasDependientes;
    }


    public void agregarRecetaDependiente(Receta receta) {
        this.recetasDependientes.add(receta); 
    }
    
    
    public void establecerComplejidad(int opcion) {
        switch (opcion) {
            case 1:
                this.complejidad = "baja";
                break;
            case 2:
                this.complejidad = "media";
                break;
            case 3:
                this.complejidad = "alta";
                break;
            default:
                this.complejidad = "Por favor elige entre 1 (Baja), 2 (Media) o 3 (Alta).";
                break;
        }
    }


    @Override
    public String toString() {
        return "Receta [ingredientes=" + ingredientes + ", tiempoCoccion=" + tiempoCoccion + ", modoPreparacion="
                + modoPreparacion + ", tipo=" + tipo + ", complejidad=" + complejidad + ", recetasDependientes="
                + recetasDependientes + "]";
    }
}
