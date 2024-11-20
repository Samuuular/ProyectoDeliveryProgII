/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author EduPiry
 */
public class GestionComidas {
    private List<Comida> comidas;

    public GestionComidas() {
        this.comidas = new ArrayList<>();
    }
    
    public void agregarComida(Comida comida){
        comidas.add(comida);
    }

    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }

    public double calcularPrecioPorComida(Comida comida){
        return comida.calcularPrecio();
    }
    
    
    
    
    
    
}
