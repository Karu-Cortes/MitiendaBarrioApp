package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Creación de Mi Tienda De Barrio App");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        // variables inventario
        String nombreProducto = "Leche Entera Alpina";
        String tipoEmpaque = "Bolsa";
        double medida = 1.100;
        String tipoMedida = "ml";
        String categoria = "Lacteo/Huevos y refrigerados";
        String etiqueta = "Leches";
        int cantidad = 30;
        long precio = 3100;
        String urlFoto = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";


        System.out.println(" ");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Descripción de la producto: " +tipoEmpaque+ " " +medida+ " " +tipoMedida+ " ");
        System.out.println("Categoria del producto: " +categoria );
        System.out.println("Etiqueta del producto: " +etiqueta);
        System.out.println("Cantidad disponible del producto: " +cantidad);
        System.out.println("Precio del producto: " +precio);
        System.out.println("Foto del producto: " +urlFoto);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}