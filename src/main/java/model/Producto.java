package model;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{ 'Nombre producto':" + nombre + ", Precio producto:" + precio + ", stock Producto:" + stock + "}";
    }

    // El producto se quedó sin inventario
    public boolean estaSinInventario() {
        return this.stock == 0;
    }

    // El precio de un producto es mayor a un valor pasado por parámetro
    public boolean esMayorQue(double precio) {
        return this.precio > precio;
    }

    // El precio de un producto es menor o igual a un valor pasado por parámetro
    public boolean esMenorIgualQue(double precio) {
        return this.precio <= precio;
    }

    // El nombre del producto contiene una palabra pasada por parámetro
    public boolean contienePalabra(String palabra) {
        return this.nombre.contains(palabra);
    }
}
