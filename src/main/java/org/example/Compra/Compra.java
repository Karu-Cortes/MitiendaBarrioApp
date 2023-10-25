package org.example.Compra;
import org.example.Producto.Producto;
import java.util.Date;
import java.util.List;

public class Compra {

    private String idCompra;
    private int nitProveedor;
    String nombreProveedor;
    String fechaCompra;
    private Double valorUnitario;
    private Double valorTotal;
    private double cantidad;
    private Producto productosCompra;
    public Compra(String idCompra, String nombreProveedor, String fechaCompra, Double valorUnitario, Double valorTotal,
                  Double cantidad, Integer nitProveedor, Producto productosCompra) {
        this.idCompra = idCompra;
        this.nombreProveedor = nombreProveedor;
        this.fechaCompra = fechaCompra;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.cantidad = cantidad;
        this.nitProveedor = nitProveedor;
        this.productosCompra = productosCompra;

    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public int getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(int nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProductosCompra() {
        return productosCompra;
    }

    public void setProductosCompra(Producto productosCompra) {
        this.productosCompra = productosCompra;
    }

    @Override
    public String toString() {
        return "Compra:  " +
                "Id Compra ='" + idCompra + '\'' +
                "Nit Proveedor =" + nitProveedor +
                "Nombre Proveedor ='" + nombreProveedor + '\'' +
                "Fecha Compra ='" + fechaCompra + '\'' +
                "Id producto =" + this.productosCompra.getCodigoProducto() +
                "Nombre producto =" + this.productosCompra.getNombreProducto() +
                "Cantidad =" + cantidad +
                "Valor Unitario =" + valorUnitario +
                "Valor Total =" + valorTotal +
                " ";
    }
}