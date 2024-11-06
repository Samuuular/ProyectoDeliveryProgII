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
public class PoliticaLimitePedidos implements PoliticaAceptacion {
    private int limite;
    
    public PoliticaLimitePedidos(int limite) {
        this.limite = limite;
    }

    @Override
    public boolean acepta(Comida comida) {
        return stock.size() < limite;
    }
}
