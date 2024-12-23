/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EduPiry
 */
public abstract class SeccionCocina implements Serializable{
    private static final long serialVersionUID = 2L;
    protected String nombre;
    protected PoliticaAceptacion politica;
    protected GestionIngredientes ingredientes;
    protected List<Receta> recetasPendientes;

    public SeccionCocina(String nombre, PoliticaAceptacion politica) {
        this.nombre = nombre;
        this.politica = politica;
        this.ingredientes = new GestionIngredientes();
        this.recetasPendientes = new ArrayList<>();
    }

    public SeccionCocina() {
    }
    
    public List<Receta> getRecetasPendientes() {
        return recetasPendientes;
    }

    public void setRecetasPendientes(List<Receta> recetasPendientes) {
        this.recetasPendientes = recetasPendientes;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PoliticaAceptacion getPolitica() {
        return politica;
    }

    public void setPolitica(PoliticaAceptacion politica) {
        this.politica = politica;
    }

    public GestionIngredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(GestionIngredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    
    

    public boolean aceptaComida(Comida comida) {
        return politica.acepta(comida);
    }

    public void prepararComida(Comida comida) {
        
        if (aceptaComida(comida)) {
            try {
                ingredientes.actualizarStockGestion(comida);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
           
    }

}
