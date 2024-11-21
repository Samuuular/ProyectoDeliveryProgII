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
public class PoliticaEnsaladas implements PoliticaAceptacion {
    private static final String NOMBRE = "PoliticaEnsaladas";
    @Override
    public boolean acepta(Comida comida) {
        return comida.getReceta().getTipo().equals("ensalada");
    }
    public String obtenerNombre(){
        return NOMBRE;
    }
}
