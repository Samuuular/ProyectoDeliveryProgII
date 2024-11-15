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

public class GestionPedidos {
    private List<Pedido> pedidos;

    public GestionPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado: " + pedido.getCliente().getNombre());
    }

    public void cancelarPedido(Pedido pedido) {
        if (pedidos.remove(pedido)) {
            System.out.println("Pedido cancelado: " + pedido.getCliente().getNombre());
        } else {
            System.out.println("El pedido no se encontró.");
        }
    }

    public void mostrarEstadoPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido de " + pedido.getCliente().getNombre() +
                               " - Estado: " + pedido.getEstado());
        }
    }

    public List<Pedido> obtenerPedidosPorEstado(boolean estado) {
        List<Pedido> pedidosPorEstado = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getEstado()==estado) {
                pedidosPorEstado.add(pedido);
            }
        }
        return pedidosPorEstado;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
}

