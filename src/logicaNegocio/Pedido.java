/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EduPiry
 */
public class Pedido {
    private Cliente cliente;
    private List<Comida> comidas;
    private String estado; //pendientes, en preparacion o completados

    //Constructor

    public Pedido(Cliente cliente) {
            this.cliente = cliente;
            this.comidas = new ArrayList<>();
            this.estado = "pendiente";
    }

    //Metodos

    public void agregarComida(Comida comida) {
            comidas.add(comida);
    }

    public void eliminarComida(Comida comida) {
            comidas.remove(comida);
    }

    public double calcularPedido() {
            double total = 0;
            for (Comida comida : comidas) {
                    total += comida.getPrecio();
            }
            return total;
    }

    public void cambiarEstado(String nuevoEstado) {
            if (nuevoEstado.equals("pendiente") || nuevoEstado.equals("en preparacion") || nuevoEstado.equals("completado")) {
                    this.estado = nuevoEstado;
            }
            else {
                    System.out.println("Estado no valido");
            }
    }

    //Getters y Setters

    public Cliente getCliente() {
            return cliente;
    }

    public void setCliente(Cliente cliente) {
            this.cliente = cliente;
    }

    public List<Comida> getComidas() {
            return comidas;
    }

    public void setComidas(List<Comida> comidas) {
            this.comidas = comidas;
    }

    public String getEstado() {
            return estado;
    }

    public void setEstado(String estado) {
            this.estado = estado;
    }

    //To String
    @Override
    public String toString() {
            return "Pedido [Cliente: " + cliente + ", Estado: " + estado + ", Comidas: " + comidas + " , Precio Total: " + calcularPedido() + "]";
    }
}
