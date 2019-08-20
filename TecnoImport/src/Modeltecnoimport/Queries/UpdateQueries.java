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
public class UpdateQueries {
    public static String cambiarIsAdmin(String cedula, boolean setAdmin){
        return "update tblUser "
                +"set isAdmin="+setAdmin
                +" where cedulaEmp=\'"+cedula+"\';";
    }
}
