/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.util.Map;

/**
 *
 * @author EduPiry
 */
public class PoliticaPostres implements PoliticaAceptacion {
    private static final String NOMBRE = "Politica Postres";
    @Override
    public boolean acepta(Comida comida) {
        return comida.getReceta().getTipo().equals("postre");
    }
    @Override
    public String obtenerNombre(){
        return NOMBRE;
    }
}
