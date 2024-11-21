/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.io.Serializable;

/**
 *
 * @author EduPiry
 */
public class Comida implements Serializable{
    private static final long serialVersionUID = 2L;
    private String nombre;
    private Receta receta;
    private double precio;
    public Comida(String nombre, Receta receta) {
        this.nombre = nombre;
        this.receta = receta;
        this.precio = calcularPrecio();
    }

    public Comida() {
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Receta getReceta() {
        return receta;
    }
    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public double calcularPrecio() {
        precio = 0;
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            precio += ingrediente.getCosto();
        }
        for (Receta receta : receta.getRecetasDependientes()) {
            for (Ingrediente ingrediente1 : receta.getIngredientes()) {
                precio += ingrediente1.getCosto();
            }
        }
        switch (receta.getTipo()) {
            case "horno":
                precio += 2000;
                break;
            case "gourmet":
                precio += 2500;
                break;
            case "ensalada":
                precio += 1000;
                break;
            case "postre":
                precio += 1500;
                break;
            default:
                break; 
        }
        switch (receta.getComplejidad()){
            case "alta":
                precio += 2000;
                break;
            case "media":
                precio += 1000;
                break;
            case "baja":
                precio += 500;
        }
        return precio;
    }
    
    @Override
    public String toString() {
        return "Comida [nombre=" + nombre + ", receta=" + receta + "]";
    }
}
