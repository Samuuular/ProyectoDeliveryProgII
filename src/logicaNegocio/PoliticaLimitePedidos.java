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
    private int stock;
    private static final String NOMBRE = "Politica Limite Pedidos";
    public PoliticaLimitePedidos(int limite, int stock) {
        this.limite = limite;
        this.stock = stock;
    }

    @Override
    public boolean acepta(Comida comida) {
        return stock < limite;
    }
    public String obtenerNombre(){
        return NOMBRE;
    }
}
