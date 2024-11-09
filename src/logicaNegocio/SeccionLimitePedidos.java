/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author EduPiry
 */
public class SeccionLimitePedidos extends SeccionCocina {
    private static final int LIMITE_PEDIDOS = 15;

    public SeccionLimitePedidos(int recetasPendientes) {
        super("Con Límite de Pedidos", new PoliticaLimitePedidos(LIMITE_PEDIDOS,recetasPendientes));
    }
}
