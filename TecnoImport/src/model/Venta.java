/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ANA
 */
public class Venta {
    
    private int id;
    private Cliente cliente;
    private List<Producto> productos;
    private PagoStrategy pago;
    private TipoVenta tipo;
    private Vendedor vendedor;
    private List<DocumentoElectronico> documentosElectronicos;
    private Date fecha;

    public Venta(int id, Cliente cliente, List<Producto> productos, PagoStrategy pago, TipoVenta tipo, Vendedor vendedor, List<DocumentoElectronico> documentosElectronicos, Date fecha) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.pago = pago;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.documentosElectronicos = documentosElectronicos;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public PagoStrategy getPago() {
        return pago;
    }

    public void setPago(PagoStrategy pago) {
        this.pago = pago;
    }

    public TipoVenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoVenta tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<DocumentoElectronico> getDocumentosElectronicos() {
        return documentosElectronicos;
    }

    public void setDocumentosElectronicos(List<DocumentoElectronico> documentosElectronicos) {
        this.documentosElectronicos = documentosElectronicos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void crearPago(PagoStrategy pago){
        System.out.println("Clase Venta Metodo crearPago");
    }
    
    public void seleccionarProducto(){
        System.out.println("Clase Venta Metodo seleccionarProducto");
    }
    
    public void agregarPago(PagoStrategy pago){
        System.out.println("Clase Venta Metodo agregarPago");
    }
    
    public void generarSolicitudDomicilio(){
        System.out.println("Clase Venta Metodo generarSolicitudDomicilio");
    }
    
    public void emitirDocumentoElectronico(){
        System.out.println("Clase Venta Metodo emitirDocumentoElectronico");
    }
    
    public void asociarCliente(Cliente c){
        System.out.println("Clase Venta Metodo asociarCliente");
    }
}
