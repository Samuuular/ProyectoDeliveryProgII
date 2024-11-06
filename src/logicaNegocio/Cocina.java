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
public class Cocina {
    private List<SeccionCocina> secciones;

    public Cocina() {
        this.secciones = new ArrayList<>();
    }

    public void agregarSeccion(SeccionCocina seccion) {
        secciones.add(seccion);
    }

    public void distribuirComida(Comida comida) {
        for (SeccionCocina seccion : secciones) {
            if (seccion.aceptaComida(comida)) {
                seccion.prepararComida(comida);
                System.out.println("Comida " + comida.getNombre() + " asignada a la sección " + seccion.getNombre());
                return;
            }
        }
        System.out.println("No se pudo asignar " + comida.getNombre() + " a ninguna sección.");
    }

    public void mostrarEstadoSecciones() {
        for (SeccionCocina seccion : secciones) {
            System.out.println("Sección: " + seccion.getNombre() + ", Stock: " + seccion.getStockIngredientes());
        }
    }
}
