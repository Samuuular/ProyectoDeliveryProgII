package presentacion;

import java.util.Scanner;

import accesoDatos.AccesoDatos;
import logicaNegocio.Cliente;
import logicaNegocio.GestionClientes;
import logicaNegocio.GestionIngredientes;
import logicaNegocio.Ingrediente;
import logicaNegocio.Logica;

public class vistaConsola {
    private final static String filePathPedidos = "Pedidos.txt";
    private final static String filePathClientes = "Clientes.txt";
    private final static String filePathRecetas = "Recetas.txt";
    private final static String filePathRecetasPendientes = "RecetasPendientes.txt";
    private final static String filePathIngredientes = "Ingredientes.txt";
    private final static String filePathComidas = "Comidas.txt";
    private final static String filePathSeccionesCocinas = "Secciones.txt";

   public static void main (String args []){
        AccesoDatos accesoDatos = new AccesoDatos(filePathPedidos, filePathClientes, filePathRecetas, filePathRecetasPendientes,filePathIngredientes, filePathComidas, filePathSeccionesCocinas);
        Logica logica = new Logica(accesoDatos); 
        GestionClientes gestionClientes = new GestionClientes(logica.loadClientes());
        GestionIngredientes gestionIngredientes = new GestionIngredientes(logica.loadIngredientes());


        Scanner input = new Scanner(System.in);
        System.out.println("\nBienvenido al servicio de Delivery de ...");
        System.out.println("\n1) Registrar un cliente \n2) Listado de clientes registrados \n3) Tomar un pedido \n4) Estado de los pedidos \n5) Cancelar un pedido \n6) Nueva receta \n7) Nueva receta dependiente\n8) Modificar receta \n9) Stock de ingredientes \n10) Nueva comida \nElija la operación:");

        int numOperacion = input.nextInt();
        
        switch (numOperacion) {
                 case 1 -> {

                 int id = gestionClientes.getClientes().size() + 1;
                 System.out.println("Cual es tu nombre pa? ");
                 String nombre = input.next();

                 System.out.println("Ahora decime donde vivis. ");
                 String direccion = input.next();
                
                 System.out.println("Número de id del cliente: " + id);
                 Cliente cliente = new Cliente(id, nombre, direccion);
                 gestionClientes.registrarCliente(cliente);
                 logica.saveClientes(gestionClientes.getClientes());

             }
            //  case 2 -> "hola";
            // case 3 -> 
            // case 4 -> 
            // case 5 -> 
               case 6 -> {

                System.out.println("Nombre del ingrediente: ");
                input.nextLine();
                String nombre = input.nextLine();
                System.out.println("Costo del ingrediente: ");
                double costo = input.nextDouble();

                System.out.println("Cantidad en stock: ");
                int cantidadEnStock = input.nextInt();

                System.out.println(nombre);
                System.out.println(cantidadEnStock);
                System.out.println(costo);

                Ingrediente ingrediente = new Ingrediente(nombre, costo, cantidadEnStock);
                gestionIngredientes.registrarIngrediente(ingrediente);
                logica.saveIngredientes(gestionIngredientes.getIngredientes());
               }
            // case 7 -> 
            // case 8 -> 
            // case 9 -> 
            // case 10 -> 
                
               
        
               default -> System.out.println("Numero incorrecto");
        }
    }
}