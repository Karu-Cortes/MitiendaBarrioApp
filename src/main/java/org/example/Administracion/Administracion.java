package org.example.Administracion;

import org.example.Compra.Compra;
import org.example.Producto.Producto;
import org.example.Venta.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Administracion {

    private List <Producto> productoList = new ArrayList<>();
    private List <Compra> compraList = new ArrayList<>();
    private List <Venta> ventaList = new ArrayList<>();

    public void agregarProducto(Producto producto){
        if (!productoList.contains(producto)) {
            productoList.add(producto);
        }
    }

    public Optional<Producto> buscarProducto(String codigoProducto){
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto()!= null && producto.getCodigoProducto().equals(codigoProducto))
                .findAny();
    }

    public Optional<Producto> modificarProducto(String codigoProducto, String opcion, String nuevoValor) {
        return productoList.stream()
                .filter(producto -> producto.getCodigoProducto().equals(codigoProducto))
                .findFirst()
                .map(productoEncontrado -> {
                    switch (opcion) {
                        case "1":
                            productoEncontrado.setNombreProducto(nuevoValor);
                            break;
                        case "2":
                            productoEncontrado.setMarcaProducto(nuevoValor);
                            break;
                        case "3":
                            productoEncontrado.setTipoEmpaque(nuevoValor);
                            break;
                        case "4":
                            productoEncontrado.setMedidaProducto(Double.valueOf(nuevoValor));
                            break;
                        case "5":
                            productoEncontrado.setTipoMedidaProducto(nuevoValor);
                            break;
                        case "6":
                            productoEncontrado.setEtiquetaProducto(nuevoValor);
                            break;
                        case "7":
                            productoEncontrado.setCategoriaProducto(nuevoValor);
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    return Optional.of(productoEncontrado);
                })
                .orElse(Optional.empty());
    }

    public void agregarCompra(Compra compra)
    {
        if (!compraList.contains(compra)) {
            compraList.add(compra);
        }
    }

    public Optional<Compra> buscarCompra (String idCompra){
        return compraList.stream()
                .filter(compra -> compra.getIdCompra()!= null && compra.getIdCompra().equals(idCompra))
                .findAny();
    }


    public Optional<Compra> modificarCompra(String codigoCompra,int  opcion, String nuevoValor) {

        Scanner scanner = new Scanner(System.in);
        return compraList.stream()
                .filter(compra -> compra.getIdCompra().equals(codigoCompra))
                .findFirst()
                .map(compraEncontrada -> {

                    switch (opcion) {
                        case 1:
                            System.out.println("INGRESA EL NOMBRE DEL PROVEEDOR");
                            compraEncontrada.setNombreProveedor(nuevoValor);
                            break;
                        case 2:
                            System.out.println("INGRESE EL NIT DEL PROVEEDOR");
                            compraEncontrada.setNitProveedor(Integer.parseInt(nuevoValor));
                            break;
                        case 3:
                            System.out.println("Eliminar el ID del producto actual.");

                            Producto productoCompra = compraEncontrada.getProductosCompra();

                            if (productoCompra != null) {

                                productoCompra.setCodigoProducto((null));

                                System.out.println("Ingresa el codigo del producto: ");
                                String codigoProducto  = scanner.nextLine();

                                Optional<Producto> productoOptional = buscarProducto(codigoProducto);

                                if (productoOptional.isPresent() ) {
                                    Producto productosCompra = productoOptional.get();
                                    compraEncontrada.setProductosCompra(productosCompra);
                                    System.out.println(productosCompra);


                                    System.out.println("POR FAVOR INGRESA LA CANTIDAD ");
                                    Double nuevaCantidad = scanner.nextDouble();
                                    scanner.nextLine();

                                    compraEncontrada.setCantidad(nuevaCantidad);
                                    productosCompra.setCantidadProducto(productosCompra.getCantidadProducto() + nuevaCantidad);

                                    System.out.println("POR FAVOR INGRESA EL PRECIO UNITARIO");
                                    Double nuevoPrecio = scanner.nextDouble();
                                    scanner.nextLine();
                                    compraEncontrada.setValorUnitario(nuevoPrecio);
                                    double valorTotal = nuevoPrecio * nuevaCantidad;
                                    compraEncontrada.setValorTotal(valorTotal);

                                } else {
                                    System.out.println("Producto con eL ID: " + codigoProducto  + " no encontrado");
                                }

                            }else{
                                System.out.println("La compra no tiene un producto asociado.");
                            }
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    return Optional.of(compraEncontrada);
                })
                .orElse(Optional.empty());
    }
}




