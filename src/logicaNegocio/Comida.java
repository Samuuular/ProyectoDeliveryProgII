/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author EduPiry
 */
public class Comida {
    private String nombre;
    private Receta receta;
    public Comida(String nombre, Receta receta) {
        this.nombre = nombre;
        this.receta = receta;
    }
    
    public double getPrecio(){
        return receta.calcularPrecio();
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
    
    @Override
    public String toString() {
        return "Comida [nombre=" + nombre + ", receta=" + receta + "]";
    }
}
