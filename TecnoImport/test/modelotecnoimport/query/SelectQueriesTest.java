/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelotecnoimport.query;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicole Alvarez
 */
public class SelectQueriesTest {
    
    public SelectQueriesTest() {
    }
  
  
    /**
     * Test of getEmpCargo method, of class SelectQueries.
     */
    @Test
    public void testGetEmpCargo() {
        System.out.println("getEmpCargo");
        String ced = "0926687798";
        String cargo = "GERENTE";
        String expResult = "select * from tblGerente where cedulaEmp=\'"+ced+"\';";
        String result = SelectQueries.getEmpCargo(ced, cargo);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmpSimple method, of class SelectQueries.
     */
    @Test
    public void testGetEmpSimple() {
        System.out.println("getEmpSimple");
        String cedula = null;
        String expResult = " ";
        String result = SelectQueries.getEmpSimple(cedula);
        assertEquals(expResult, result);
    }

   

    /**
     * Test of getProductAll method, of class SelectQueries.
     */
    @Test
    public void testGetProductAll() {
        System.out.println("getProductAll");
        String cedula = "0927707798";
        String expResult = "";
        String result = SelectQueries.getProductAll(cedula);
        assertNotSame(expResult, result);
        
    }

   

    /**
     * Test of getEnvSimple method, of class SelectQueries.
     */
    @Test
    public void testGetEnvSimple() {
        System.out.println("getEnvSimple");
        int idEnvio = 0;
        String result = SelectQueries.getEnvSimple(idEnvio);
        assertNotNull(result);

    }

    /**
     * Test of getVenta method, of class SelectQueries.
     */
    @Test
    public void testGetVenta() {
        System.out.println("getVenta");
        int idVenta = 2345;
        String expResult = "select * from tblVenta where idVenta = \'"+idVenta+"\';";
        String result = SelectQueries.getVenta(idVenta);
        assertTrue(expResult.equals(result));
     
    }

    /**
     * Test of getCliente method, of class SelectQueries.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        String cedulaCl = null;
        String result = SelectQueries.getCliente(cedulaCl);
        assertNull(result);
    }

    /**
     * Test of getLocal method, of class SelectQueries.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        int idLocal = 0;
        String expResult = "";
        String result = SelectQueries.getLocal(idLocal);
        assertFalse(expResult.equals(result));
    }

    
}
