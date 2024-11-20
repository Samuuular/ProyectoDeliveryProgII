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
public class Cliente implements Serializable {
    private static final long serialVersionUID = 2L;
    private int id;
    private String nombre;
    private String direccion;
    //Constructor

    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Cliente() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //To String
    @Override
    public String toString() {
            return "Cliente [Nombre: " + nombre + ", Direccion: " + direccion + "]";
    }
}
