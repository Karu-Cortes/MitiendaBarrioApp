package org.example.Compra;
import org.example.Producto.Producto;
import java.util.Date;
import java.util.Optional;

public class Compra {

    private String idCompra;
    private int nitProveedor;
    String nombreProveedor;
    private Date fechaCompra;
    private Double valorUnitario;
    private Double valorTotal;
    private double cantidad;
    private Optional<Producto> productosCompra;

    public Compra(String idCompra, String nombreProveedor, Date fechaCompra, Double valorUnitario, Double valorTotal,
                  Double cantidad, Integer nitProveedor, Optional<Producto> productosCompra) {
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


    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
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

    public Optional<Producto> getProductosCompra() {
        return productosCompra;
    }

    public void setProductosCompra(Optional<Producto> productosCompra) {
        this.productosCompra = productosCompra;
    }

    @Override
    public String toString() {
        String productoInfo = productosCompra.isPresent() ?
                "Id producto =" + this.productosCompra.get().getCodigoProducto() +
                        "Nombre producto =" + this.productosCompra.get().getNombreProducto() :
                "Producto no asociado";

        return "Compra:  " +
                "Id Compra ='" + idCompra + '\'' +
                "Nit Proveedor =" + nitProveedor +
                "Nombre Proveedor ='" + nombreProveedor + '\'' +
                "Fecha Compra ='" + fechaCompra + '\'' +
                productoInfo +
                "Cantidad =" + cantidad +
                "Valor Unitario =" + valorUnitario +
                "Valor Total =" + valorTotal +
                " ";
    }
}