/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import logicaNegocio.Cliente;
import logicaNegocio.Pedido;
import logicaNegocio.Receta;
/**
 *
 * @author EduPiry
 */
public class AccesoDatos {
    private final String filePathPedidos; 
    private final String filePathClientes;
    private final String filePathRecetas;
    private final String filePathRecetasPendientes;

    public AccesoDatos(String filePathPedidos, String filePathClientes, String filePathRecetas, String filePathRecetasPendientes) {
        this.filePathPedidos = filePathPedidos;
        this.filePathClientes = filePathClientes;
        this.filePathRecetas = filePathRecetas;
        this.filePathRecetasPendientes = filePathRecetasPendientes;
    }

    

    public void savePedidos(List<Pedido> pedidos) {
        File file = new File(filePathPedidos);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(pedidos);
            System.out.println("Pedidos guardados en: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Pedido> loadPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        File file = new File(filePathPedidos);

        if (!file.exists()) {
            System.out.println("El archivo de pedidos no existe, retornando lista vacía.");
            return pedidos;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            pedidos = (List<Pedido>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
    public void saveClientes(List<Cliente> clientes) {
        File file = new File(filePathClientes);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(clientes);
            System.out.println("Clientes guardados en: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Cliente> loadClientes() {
        List<Cliente> clientes = new ArrayList<>();
        File file = new File(filePathClientes);

        if (!file.exists()) {
            System.out.println("El archivo de clientes no existe, retornando lista vacía.");
            return clientes;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    public void saveRecetas(List<Receta> recetas) {
        File file = new File(filePathRecetas);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(recetas);
            System.out.println("Clientes guardados en: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Receta> loadRecetas() {
        List<Receta> recetas = new ArrayList<>();
        File file = new File(filePathRecetas);

        if (!file.exists()) {
            System.out.println("El archivo de recetas no existe, retornando lista vacía.");
            return recetas;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            recetas = (List<Receta>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return recetas;
    }
    public void saveRecetasPendientes(List<Receta> recetas) {
        File file = new File(filePathRecetasPendientes);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(recetas);
            System.out.println("Clientes guardados en: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Receta> loadRecetasPendientes() {
        List<Receta> recetas = new ArrayList<>();
        File file = new File(filePathRecetasPendientes);

        if (!file.exists()) {
            System.out.println("El archivo de recetas pendientes no existe, retornando lista vacía.");
            return recetas;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            recetas = (List<Receta>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return recetas;
    }
    
}
