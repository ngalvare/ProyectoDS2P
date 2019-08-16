/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

/**
 *
 * @author Nicole Alvarez
 */
public class UsuarioAdmin extends UsuarioDecorator{
    
    public UsuarioAdmin(Usuario usuario) {
        super(usuario);
    }
    
    public void editarEmpleado(){
        System.out.println("AdmineditarEmpleado");
    }
    
    public void editarCliente(){
       System.out.println("AdmineditarCliente");
    }
    
    public void editarProducto(){
       System.out.println("AdmineditarProducto");
    }
    
    public void crearEmpleado(){
       System.out.println("AdmincrearEmpleado");
    }

    public void crearCliente(){
       System.out.println("AdmincrearCliente");
    }
    
    public void crearProducto(){
       System.out.println("AdmincrearProducto");
    }
    
    public void eliminarCliente(){
       System.out.println("AdmineliminarCliente");
    }

    public void eliminarEmpelado(){
       System.out.println("AdmineliminarEmpelado");
    }

    public void eliminarProducto(){
       System.out.println("AdmineliminarProducto");
    }

    public void consultarEmpleado(){
       System.out.println("AdminconsultarEmpleado");
    }

    public void consultarCliente(){
       System.out.println("AdminconsultarCliente");
    }

   
}
