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
import logicaNegocio.Comida;
import logicaNegocio.Ingrediente;
import logicaNegocio.Pedido;
import logicaNegocio.Receta;
import logicaNegocio.SeccionCocina;
/**
 *
 * @author EduPiry
 */
public class AccesoDatos {
    private final String filePathPedidos; 
    private final String filePathClientes;
    private final String filePathRecetas;
    private final String filePathRecetasPendientes;
    private final String filePathIngredientes;
    private final String filePathComidas;
    private final String filePathSeccionesCocinas;

    public AccesoDatos(String filePathPedidos, String filePathClientes, String filePathRecetas, String filePathRecetasPendientes, String filePathIngredientes, String filePathComidas, String filePathSeccionesCocinas) {
        this.filePathPedidos = filePathPedidos;
        this.filePathClientes = filePathClientes;
        this.filePathRecetas = filePathRecetas;
        this.filePathRecetasPendientes = filePathRecetasPendientes;
        this.filePathIngredientes = filePathIngredientes;
        this.filePathComidas = filePathComidas;
        this.filePathSeccionesCocinas = filePathSeccionesCocinas;
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
            System.out.println("Recetas guardados en: " + file.getAbsolutePath());
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
            System.out.println("Recetas Pendientes guardados en: " + file.getAbsolutePath());
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
    
    public void saveIngredientes(List<Ingrediente> ingredientes) {
        File file = new File(filePathIngredientes);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(ingredientes);
            System.out.println("Ingredientes guardados en: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Ingrediente> loadIngredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        File file = new File(filePathIngredientes);

        if (!file.exists()) {
            System.out.println("El archivo de ingredientes no existe, retornando lista vacía.");
            return ingredientes;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            ingredientes = (List<Ingrediente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ingredientes;
    }
    
    public void saveComidas(List<Comida> Comidas) {
        File file = new File(filePathComidas);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(Comidas);
            System.out.println("Comidas guardados en: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Comida> loadComidas() {
        List<Comida> comidas = new ArrayList<>();
        File file = new File(filePathComidas);

        if (!file.exists()) {
            System.out.println("El archivo de ingredientes no existe, retornando lista vacía.");
            return comidas;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            comidas = (List<Comida>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return comidas;
    }
    
    public void saveSeccionesCocinas(List<SeccionCocina> secciones) {
        File file = new File(filePathSeccionesCocinas);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(secciones);
            System.out.println("Secciones de Cocinas guardados en: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<SeccionCocina> loadSeccionesCocinas() {
        List<SeccionCocina> secciones = new ArrayList<>();
        File file = new File(filePathSeccionesCocinas);

        if (!file.exists()) {
            System.out.println("El archivo de ingredientes no existe, retornando lista vacía.");
            return secciones;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            secciones = (List<SeccionCocina>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return secciones;
    }
    
}
