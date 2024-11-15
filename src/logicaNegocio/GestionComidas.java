/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author EduPiry
 */
public class GestionComidas {
    private Set<Comida> comidas;

    public GestionComidas() {
        this.comidas = new HashSet<>();
    }

    public Set<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(Set<Comida> comidas) {
        this.comidas = comidas;
    }
    
    
    
    
    
}
