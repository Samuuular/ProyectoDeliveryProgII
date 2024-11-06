/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author EduPiry
 */
import java.util.HashMap;
import java.util.Map;

public class GestionClientes {

    private Map<String, Cliente> clientes;

    public GestionClientes() {
        this.clientes = new HashMap<>();
    }

    public void registrarCliente(String nombre, String direccion) {
        if (!clientes.containsKey(nombre)) {
            Cliente nuevoCliente = new Cliente(nombre, direccion);
            clientes.put(nombre, nuevoCliente);
        } else {
            System.out.println("El cliente con el nombre " + nombre + " ya está registrado.");
        }
    }

    public Cliente consultarCliente(String nombre) {
        return clientes.get(nombre);
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes.values()) {
                System.out.println(cliente);
            }
        }
    }
}
