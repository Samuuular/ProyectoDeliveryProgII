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
    private boolean estado; //pendientes o completados

    //Constructor

    public Pedido(Cliente cliente) {
            this.cliente = cliente;
            this.comidas = new ArrayList<>();
            this.estado = false;
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

    public boolean getEstado() {
            return estado;
    }

    public void setEstado(boolean estado) {
            this.estado = estado;
    }

    //To String
    @Override
    public String toString() {
            return "Pedido [Cliente: " + cliente + ", Estado: " + estado + ", Comidas: " + comidas + " , Precio Total: " + calcularPedido() + "]";
    }
}
