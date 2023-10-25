package org.example;

import model.ProductoModel;
import model.ProductsArray;
import org.example.Administracion.Administracion;
import org.example.Compra.Compra;
import org.example.Producto.Producto;
import org.example.Venta.Venta;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        /*System.out.println(" ");
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

        ProductoModel producto = new ProductoModel("Leche Entera Alpina", 3100, 30);

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
        */





        Administracion administracion = new Administracion();
        int opciones = ejecutarMenu();
        while (opciones != 7){
            switch (opciones) {
                case 1 :
                    crearProducto(administracion);
                    break;
                case 2 :
                    modificarProducto(administracion);
                    break;
                case 3 :
                    consultarProducto(administracion);
                    break;
                case 4 :
                    agregarCompra(administracion);
                    break;
                case 5 :
                    modificarCompra(administracion);
                    break;
                case 6 :
                    buscarCompra(administracion);
                    break;
                case 7 :
                    agregarVenta(administracion);
                case 8 :
                    modificarVenta(administracion);
                    break;
                case 9 :
                    buscarVenta(administracion);
                    break;
                case 10 :
                    System.out.println("Saliendo de menú ");
                    break;
            }
            opciones = ejecutarMenu();
        }

    }


    public static void crearProducto(Administracion administracion)
    {
        //REGISTRAR NUEVO PRODUCTO
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO : ");
        String codigoProducto = scanner.nextLine();


        System.out.println("INGRESA EL NOMBRE DEL PRODUCTO: ");
        String nombreProducto = scanner.nextLine();

        System.out.println("INGRESA  LA MARCA DEL PRODUCTO: ");
        String marcaProducto =  scanner.nextLine();

        System.out.println("INGRESA EL TIPO DE EMPAQUE DEL PRODUCTO: ");
        String tipoEmpaque = scanner.nextLine();

        System.out.println("INGRESA LA MEDIDA DEL PRODUCTO: ");
        Double medidaProducto = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("INGRESA EL TIPO DE MEDIDA DEL PRODUCTO: ");
        String tipoMedidaProducto = scanner.nextLine();

        System.out.println("INGRESA LA ETIQUETA DEL PRODUCTO: ");
        String etiquetaProducto=  scanner.nextLine();

        System.out.println("INGRESA  LA CATEGORIA DEL PRODUCTO : ");
        String  categoriaProducto =  scanner.nextLine();


        Double cantidadProducto = 0.0;
        Producto producto = new Producto(codigoProducto, nombreProducto, marcaProducto, tipoEmpaque,medidaProducto,tipoMedidaProducto,etiquetaProducto,categoriaProducto,cantidadProducto) {
        };
        administracion.agregarProducto(producto);
        System.out.println(producto.toString());

    }

    public static void modificarProducto(Administracion administracion)
    {

        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoProducto = scanner.next();
        scanner.nextLine();

        Optional<Producto> productoEncontrado = administracion.buscarProducto(codigoProducto);
        if (productoEncontrado.isPresent()) {
            System.out.println(productoEncontrado.get());
            System.out.println(" ");
        } else {
            System.out.println("Producto con eL ID: " + codigoProducto  + " no encontrado");
        }

        if (productoEncontrado.isPresent()) {
            System.out.println("Seleccione el campo del producto que desee modificar: ");
            System.out.println("1. Nombre del Producto");
            System.out.println("2. Marca del Producto");
            System.out.println("3. Tipo de Empaque");
            System.out.println("4. Medida");
            System.out.println("5. Tipo de medida");
            System.out.println("6. Etiqueta Producto");
            System.out.println("7. Categoria Producto");



            String opcion = scanner.nextLine();

            System.out.println(" ");
            System.out.println("Ingresa la información a modificar: ");
            String nuevoValor = scanner.nextLine();

            Optional<Producto> productoModificado = administracion.modificarProducto(
                    codigoProducto,
                    opcion,
                    nuevoValor
            );

            if (productoModificado.isPresent()) {
                System.out.println("Producto modificado exitosamente.");
                System.out.println(" ");
                System.out.println(productoEncontrado.get());
                System.out.println(" ");
            } else {
                System.out.println("No se pudo modificar el producto.");
                System.out.println(" ");
            }
        } else {
            System.out.println("Producto no encontrado.");
            System.out.println(" ");
        }


    }

    public static void  consultarProducto(Administracion administracion)
    {
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A BUSCAR : ");
        Scanner scanner = new Scanner(System.in);
        String codigoProducto = scanner.next();
        scanner.nextLine();

        Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto );
        if (productoOptional.isPresent()) {
            System.out.println(productoOptional.get());
        } else {
            System.out.println("Producto con eL ID: " + codigoProducto  + " no encontrado");
        }
    }

    public static void agregarCompra(Administracion administracion){

        //REGISTRAR NUEVA COMPRA DE PRODUCTO
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA  LA FECHA DE LA COMPRA: ");
        String fechaCompra =  scanner.nextLine();
        System.out.println("INGRESA EL CODIGO DE LA COMPRA : ");
        String idCompra = scanner.nextLine();
        System.out.println("INGRESA EL NIT DEL PROVEEDOR : ");
        int nitProveedor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INGRESA EL NOMBRE DEL PROVEEDOR: ");
        String nombreProveedor = scanner.nextLine();
        System.out.println("INGRESA EL CODIGO DEL PRODUCTO A COMPRAR: ");
        String codigoProducto = scanner.nextLine();


        Optional<Producto> productoOptional = administracion.buscarProducto(codigoProducto );
        if (productoOptional.isPresent() ) {
            Producto productosCompra = productoOptional.get();
            System.out.println(productosCompra.getNombreProducto());

            System.out.println("INGRESA EL VALOR UNITARIO DEl PRODUCTO: ");
            Double valorUnitario = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("INGRESA LA CANTIDAD A COMPRAR : ");
            double cantidad= scanner.nextInt();
            scanner.nextLine();
            productosCompra.setCantidadProducto(productosCompra.getCantidadProducto() + cantidad);
            double valorTotal = valorUnitario * cantidad;

            Compra compra = new Compra(idCompra,nombreProveedor,fechaCompra,valorUnitario,valorTotal,cantidad,nitProveedor, productosCompra);
            administracion.agregarCompra(compra);
            System.out.println(compra.toString());

        } else {
            System.out.println("Producto con eL ID: " + codigoProducto  + " no encontrado");
        }


    }
        public static void modificarCompra(Administracion administracion) {
            System.out.println("INGRESA EL CODIGO DE LA COMPRA A MODIFICAR : ");
            Scanner scanner = new Scanner(System.in);
            String codigoCompra = scanner.nextLine();


            Optional<Compra> compraEncontrada = administracion.buscarCompra(codigoCompra);
            if (compraEncontrada.isPresent()) {
                Compra compra = compraEncontrada.get();
                System.out.println("Compra encontrada:");
                System.out.println(compra);


                if (compraEncontrada.isPresent()) {
                    System.out.println("Seleccione el campo de la compra  que deseas modificar: ");

                    System.out.println("1. Nombre del Proveedor");
                    System.out.println("2. Nit del Proveedor");
                    System.out.println("3. Producto, cantidad y valor unitario");

                    int opcion = scanner.nextInt();

                    String nuevoValor = scanner.nextLine();

                    Optional<Compra> compramodificada = administracion.modificarCompra(codigoCompra, opcion, nuevoValor);
                    if (compramodificada.isPresent()) {
                        System.out.println("Producto modificado exitosamente.");
                        System.out.println(compraEncontrada.get());
                    } else {
                        System.out.println("No se pudo modificar el producto.");

                    }
                } else {
                    System.out.println("Producto no encontrado.");
                    System.out.println(" ");
                }
            }
        }


    public static void buscarCompra (Administracion administracion){

            System.out.println("INGRESA EL CODIGO DE LA COMPRA A BUSCAR : ");
            Scanner scanner = new Scanner(System.in);
            String idCompra = scanner.next();
            scanner.nextLine();

            Optional<Compra> compraOptional = administracion.buscarCompra(idCompra);
            if (compraOptional.isPresent()) {
                System.out.println(compraOptional.get());
            } else {
                System.out.println("Producto con eL ID: " + idCompra  + " no encontrado");
            }

        }


    public static void agregarVenta(Administracion administracion){

    }
    public static void modificarVenta(Administracion administracion){

    }
    public static void buscarVenta(Administracion administracion){

    }
    public static int ejecutarMenu()
    {
        System.out.println(" ");
        System.out.println("Por favor digita una opcion del siguiente menú");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Modificar producto                    |");
        System.out.println("3. Buscar productos                      |");
        System.out.println("4. Agregar Compra                        |");
        System.out.println("5. Modificar Compra                      |");
        System.out.println("6. Buscar Compra                         |");
        System.out.println("7. Agregar venta                         |");
        System.out.println("8. Buscar venta                          |");
        System.out.println("9. Modificar venta                       |");
        System.out.println("10.Salir menú                            |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 10)  ");

        Scanner scanner = new Scanner(System.in);
        int opciones =10;
        try {
            opciones = scanner.nextInt();
            if (opciones < 1 || opciones > 10 )
            {
                System.out.println("La opcion seleccionada no es válida");
                ejecutarMenu();
            }
        }
        catch (Exception e)
        {
            System.out.println("La opcion seleccionada no es válida");
            ejecutarMenu();
        }
        return opciones;
    }

}




