/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author EduPiry
 */
import java.util.Map;

public class PoliticaGourmet implements PoliticaAceptacion {
    private static final String NOMBRE = "Politica Gourmet";
    @Override
    public boolean acepta(Comida comida) {
        return comida.getReceta().getTipo().equalsIgnoreCase("gourmet");
    }
    public String obtenerNombre(){
        return NOMBRE;
    }
}
