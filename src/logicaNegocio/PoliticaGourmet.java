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

    @Override
    public boolean acepta(Comida comida) {
        return comida.getReceta().getTipo().equalsIgnoreCase("gourmet");
    }
}
