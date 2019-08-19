/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport.Queries;

/**
 *
 * @author scmz2607
 */
public class SelectQueries {
    public static String getUser(String id, String psw){
        return "select * from tblUser where idUser=\'"+id+"\' and psw=\'"+psw+"\';";
    }
    
    public static String getEmpCargo(String ced, String cargo){
        String tabla = "";
        switch (cargo){
            case "GERENTE":
                tabla = "tblGerente";
                break;
            case "JEFE":
                tabla = "tblJefe";
                break;
            case "VENDEDOR":
                tabla = "tblVendedor";
                break;
            case "REPARTIDOR":
                tabla = "tblRepartidor";
                break;
        }
//        System.out.println("select * from "+tabla+" where cedulaEmp=\'"+ced+"\';");
        return "select * from "+tabla+" where cedulaEmp=\'"+ced+"\';";
    }
    
    public static String getEmpSimple(String cedula){
        return "select * from tblEmpleado where cedulaEmp=\'"+cedula+"\';";
    }
    
}
