/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ANA
 */
public class Venta {
    
    private int id;
    private Cliente cliente;
//    private List<Producto> productos;
//    private PagoStrategy pago;
//    private TipoVenta tipo;
    private Vendedor vendedor;
//    private List<DocumentoElectronico> documentosElectronicos;
    private Date fecha;

    public Venta(int id, Cliente cliente, Date fecha) {
        this.id = id;
        this.cliente = cliente;
//        this.productos = productos;
////        this.pago = pago;
//        this.tipo = tipo;
//        this.vendedor = vendedor;
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

   

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
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
