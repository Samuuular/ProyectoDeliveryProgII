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


public class GestionClientes {

    private List<Cliente> clientes;

    public GestionClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @SuppressWarnings("unchecked")
    public GestionClientes() {
        this.clientes = new ArrayList();
    }

    public void registrarCliente(Cliente nuevoCliente) {
        
        clientes.add(nuevoCliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente obtenerClienteId(int id){
        Cliente clienteAux = new Cliente();
        for (Cliente cliente : clientes) {
            if(cliente.getId()==id){
                clienteAux = cliente;
            }
        }
        return clienteAux;
    }

 
    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}
