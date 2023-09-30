package model;


import java.util.ArrayList;
import java.util.Collections;

public class ProductsArray {

    ArrayList<String> listaProductos;

    public ProductsArray() {
        listaProductos = new ArrayList<>();

        listaProductos.add("Leche Entera Alpina");
        listaProductos.add("Leche Alpina Deslactosada");
        listaProductos.add("Leche Alpina Semi-Descremada");
        listaProductos.add("Leche Alpina Deslactosada-Descremada");
        listaProductos.add("Leche Alpina Descremada");
        listaProductos.add("Leche Colanta Entera");
        listaProductos.add("Leche Colanta Deslactosada");
        listaProductos.add("Leche Colanta Entera");
        listaProductos.add("Leche Colanta Deslactosada");
        listaProductos.add("Yogurt Alpina Fresa");
        listaProductos.add("Yogurt Alpina Melocoton");
        listaProductos.add("Yogo Yogo Litro Mora");
        listaProductos.add("Papas Super Ricas Fritas Natural");
        listaProductos.add("Papas Super Ricas Todo Rico BBQ");
        listaProductos.add("Mortadela Zenu");
        listaProductos.add("Mortadela Zenu Pollo");
        listaProductos.add("Jamon Zenu");
        listaProductos.add("Salchicha Zenu Perro Caliente");
        listaProductos.add("Leche Alpin Chocolate");
        listaProductos.add("Leche Alpin Fresa");
    }

    public void mostrarProductos(char letra) {
        for (String lproducto : listaProductos) {
            if (lproducto.charAt(0) == letra) {
                System.out.println(lproducto);
            }
        }
    }

    public void imprimirListaOrdenada() {
        Collections.sort(listaProductos, String.CASE_INSENSITIVE_ORDER);

        for (String lproducto : listaProductos) {
            System.out.println(lproducto);
        }
    }

}
