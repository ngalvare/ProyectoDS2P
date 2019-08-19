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
    
    public static String getProducto(String data, String cedula,String search){
        return "select distinct nombre,nombreCat,descripcion,precio,cantidad from \n" +
        "tblEmpleado\n" +
        "join tblLocal l using(idLocal)\n" +
        "join tblInventario i using(idInventario)\n" +
        "join tblProductoInv pi using (idInventario)\n" +
        "join tblProducto p using(idProducto)\n" +
        "join tblCategory using (idCat)\n" +
        "where cedulaEmp = \'"+cedula+"\' and "+search+" like \'%"+data+"%\';";
    }
    
}
