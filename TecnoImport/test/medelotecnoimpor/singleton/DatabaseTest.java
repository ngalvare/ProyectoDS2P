/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medelotecnoimpor.singleton;


import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import modelotecnoimport.Cliente;
import modelotecnoimport.Empleado;
import modelotecnoimport.Envio;
import modelotecnoimport.Local;
import modelotecnoimport.Producto;
import modelotecnoimport.Repartidor;
import modelotecnoimport.RutaEntrega;
import modelotecnoimport.Usuario;
import modelotecnoimport.Venta;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Nicole Alvarez
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }

   
    
    /**
     * Test of getInstance method, of class Database.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Database expResult = null;
        Database result = Database.getInstance();
        assertNotSame(expResult, result);
    }



    /**
     * Test of validaInicio method, of class Database.
     */
    @Test
    public void testValidaInicio() {
        System.out.println("validaInicio");
        String usr = null;
        String psw = "";
        Usuario result = Database.validaInicio(usr, psw);
        assertNull(result);
    }


    /**
     * Test of getPrivAdmin method, of class Database.
     */
    @Test
    public void testGetPrivAdmin() {
        System.out.println("getPrivAdmin");
        String cedula = null;
        boolean result = Database.getPrivAdmin(cedula);
        assertFalse(result);
    }

    
}
