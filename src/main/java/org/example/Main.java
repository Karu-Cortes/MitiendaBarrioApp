package org.example;
import model.Producto;
import java.util.Scanner;
import model.ProductsArray;



public class Main {


    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Creación de Mi Tienda De Barrio App");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        // variables inventario
        String nombresProducto = "Leche Entera Alpina";
        String tipoEmpaque = "Bolsa";
        double medida = 1.100;
        String tipoMedida = "ml";
        String categoria = "Lacteo/Huevos y refrigerados";
        String etiqueta = "Leches";
        int cantidad = 30;
        long precio = 3100;
        String urlFoto = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";


        System.out.println(" ");
        System.out.println("Nombre del producto: " + nombresProducto);
        System.out.println("Descripción de la producto: " + tipoEmpaque + " " + medida + " " + tipoMedida + " ");
        System.out.println("Categoria del producto: " + categoria);
        System.out.println("Etiqueta del producto: " + etiqueta);
        System.out.println("Cantidad disponible del producto: " + cantidad);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Foto del producto: " + urlFoto);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(" ");
        System.out.println("***********************************************************************************************************");
        solicitarImprimir();
        System.out.println(" ");


        // importación de la clase Producto a main.

        Producto producto = new Producto("Leche Entera Alpina", 3100, 30);

        System.out.println("***********************************************************************************************************");
        System.out.println("métodos de la clase Producto");

        System.out.println("El producto está sin inventario: " + producto.estaSinInventario());
        System.out.println("El precio del producto es mayor a 2500: " + producto.esMayorQue(2500));
        System.out.println("El precio del producto es menor o igual a 3000: " + producto.esMenorIgualQue(3000));
        System.out.println("El nombre del producto contiene la palabra 'Leche': " + producto.contienePalabra("Leche"));
        System.out.println(" ");


        System.out.println("***********************************************************************************************************");

        ProductsArray nombreProducto = new ProductsArray();

        System.out.println("Productos que comienzan por la letra 'Y':");
        nombreProducto.mostrarProductos('Y');
        System.out.println(" ");

        System.out.println("Lista de productos en orden alfabético:");
        nombreProducto.imprimirListaOrdenada();

    }



    public static int construirMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("** Menú de opciones para inventario **");
        System.out.println("1. Listar productos");
        System.out.println("2. Agregar producto");
        System.out.println("3. Modificar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
        return sc.nextInt();
    }

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Listando productos...");
                System.out.println(" ");
                break;
            case 2:
                System.out.println("Agregando producto...");
                System.out.println(" ");
                break;
            case 3:
                System.out.println("Modificando producto...");
                System.out.println(" ");
                break;
            case 4:
                System.out.println("Eliminando producto...");
                System.out.println(" ");
                break;
            case 5:
                System.out.println("Saliendo del menú...");
                System.out.println(" ");
                break;
            default:
                System.out.println("Opción no válida.");
                System.out.println(" ");
                break;
        }
        }


    public static void solicitarImprimir(){

        int opcion;
        do {
            opcion = construirMenu();
            ejecutarOpcion(opcion);
        } while (opcion != 5);
    }

}




