/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author EduPiry
 */
public class Cocina {
    private List<SeccionCocina> secciones;
    private GestionPedidos pedidos;

    public Cocina() {
        this.secciones = new ArrayList<>();
        this.pedidos = new GestionPedidos();
    }

    public void agregarSeccion(SeccionCocina seccion) {
        secciones.add(seccion);
    }

    public void distribuirComidaDelPedido() {
        Iterator <Pedido> pedidosIterator = pedidos.getPedidos().iterator();
        while (pedidosIterator.hasNext()) {
            Pedido pedido = pedidosIterator.next();
            int comidasAceptadas = 0;
            for (Comida comida : pedido.getComidas()) {
                for (SeccionCocina seccion : secciones) {
                    if (seccion.aceptaComida(comida)) {
                        seccion.prepararComida(comida);
                        comidasAceptadas ++;
                        System.out.println("Comida " + comida.getNombre() + " asignada a la sección " + seccion.getNombre());
                        break;
                    }
                }
                if (comidasAceptadas == pedido.getComidas().size()){
                    pedido.setEstado(true);
                }else{
                    System.out.println("Pedido en pendiente por no ser aceptado en las secciones");
                }
                
            }
        }
    }

    public void mostrarSecciones() {
        for (SeccionCocina seccion : secciones) {
            System.out.println("Sección: " + seccion.getNombre());
        }
    }
}
