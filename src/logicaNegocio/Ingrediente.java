/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author EduPiry
 */
public class Ingrediente {
    private String nombre;
    private double costo;
    private int cantidadEnStock;

    public Ingrediente(String nombre, double costo, int cantidadEnStock) {
        this.nombre = nombre;
        this.costo = costo;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Decrementa la cantidad del ingrediente en stock
    public void actualizarStock(int cantidadUsada) {
        if (cantidadEnStock >= cantidadUsada) {
            cantidadEnStock -= cantidadUsada;
        } else {
            System.out.println("No hay suficiente " + nombre + " en el stock.");
        }
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", cantidad=" + cantidadEnStock +
                '}';
    }
}
