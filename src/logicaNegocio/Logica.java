/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import accesoDatos.AccesoDatos;
import java.util.List;

/**
 *
 * @author EduPiry
 */
public class Logica {
    private AccesoDatos datos;

    public Logica(AccesoDatos datos) {
        this.datos = datos;
    }
    
    public void savePedidos(List<Pedido> pedidos){
        datos.savePedidos(pedidos);
    }
    public List<Pedido> loadPedidos(){
        return datos.loadPedidos();
    }
    public void saveClientes(List<Cliente> clientes){
        datos.saveClientes(clientes);
    }
    public List<Cliente> loadClientes(){
        return datos.loadClientes();
    }
    public void saveRecetas(List<Receta> recetas){
        datos.saveRecetas(recetas);
    }
    public List<Receta> loadRecetas(){
        return datos.loadRecetas();
    }
    public void saveRecetasPendientes(List<Receta> recetas){
        datos.saveRecetasPendientes(recetas);
    }
    public List<Receta> loadRecetasPendientes(){
        return datos.loadRecetasPendientes();
    }
    public void saveIngredientes(List<Ingrediente> ingredientes){
        datos.saveIngredientes(ingredientes);
    }
    public List<Ingrediente> loadIngredientes(){
        return datos.loadIngredientes();
    }
    public void saveComidas(List<Comida> comidas){
        datos.saveComidas(comidas);
    }
    public List<Comida> loadComidas(){
        return datos.loadComidas();
    }
    public void saveSeccionesCocinas(List<SeccionCocina> secciones){
        datos.saveSeccionesCocinas(secciones);
    }
    public List<SeccionCocina> loadSeccionesCocinas(){
        return datos.loadSeccionesCocinas();
    }
    
    public Pedido obtenerPedido(int id){
        Pedido pedidoaux = null;
        for (Pedido pedido : datos.loadPedidos()) {
            if(pedido.getCliente().getId()==id){
                pedidoaux = pedido;
            }
        }
        return pedidoaux;
    }
    public Receta obtenerReceta(String nombre){
        Receta recetaaux=null;
        for (Receta receta : datos.loadRecetas()) {
            if(receta.getNombre().equalsIgnoreCase(nombre)){
                recetaaux = receta;
            }
        }
        return recetaaux;
    }
    public SeccionCocina obtenerSeccion(String nombre){
        SeccionCocina seccionAux = null;
        for (SeccionCocina seccion : datos.loadSeccionesCocinas()) {
            if(seccion.getNombre().equalsIgnoreCase(nombre)){
                seccionAux = seccion;
            }
        }
        return seccionAux;
    }
    public Comida obtenerComida(String nombre){
        Comida comidaAux = null;
        for (Comida comida : datos.loadComidas()) {
            if(comida.getNombre().equalsIgnoreCase(nombre)){
                comidaAux = comida;
            }
        }
        return comidaAux;
    }
    public Ingrediente obtenerIngrediente(String nombre){
        Ingrediente ingredienteAux= null;
        for (Ingrediente ingrediente : datos.loadIngredientes()) {
            if(ingrediente.getNombre().equalsIgnoreCase(nombre)){
                ingredienteAux = ingrediente;
            }
        }
        return ingredienteAux;
    }
}
