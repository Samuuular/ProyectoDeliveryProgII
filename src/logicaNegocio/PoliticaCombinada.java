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
public class PoliticaCombinada implements PoliticaAceptacion {
    private PoliticaAceptacion politica1;
    private PoliticaAceptacion politica2;

    public PoliticaCombinada(PoliticaAceptacion politica1, PoliticaAceptacion politica2) {
        this.politica1 = politica1;
        this.politica2 = politica2;
    }

    @Override
    public boolean acepta(Comida comida) {
        return politica1.acepta(comida) && politica2.acepta(comida);
    }
}
