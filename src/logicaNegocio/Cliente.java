/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author EduPiry
 */
public class Cliente {
    private String nombre;
    private String direccion;
    //Constructor
    public Cliente(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
    }

    //Getters y Setters
    public String getNombre() {
            return nombre;
    }
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    public String getDireccion() {
            return direccion;
    }
    public void setDireccion(String direccion) {
            this.direccion = direccion;
    }

    //To String
    @Override
    public String toString() {
            return "Cliente [Nombre: " + nombre + ", Direccion: " + direccion + "]";
    }
}
