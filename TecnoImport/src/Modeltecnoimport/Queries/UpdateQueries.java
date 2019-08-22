/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport.Queries;

import Modeltecnoimport.EstadoEnvio;

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

    
    public static String getIdRepbyCed(String numCedula){
        return "select idRepartidor from tblRepartidor where cedulaEmp="+numCedula+";";
    }
    public static String crearRuta(int idRep, boolean cerrada) {
        return "insert into tblRuta(idRepartidor,cerrada) value (\'"+idRep+"\',"+cerrada+");";
    }
    
    public static String idEstaRuta(){
        return "select @idEstaRuta";
    }
    
    public static String asignarRutaEnvio(int idEnvio, int idRuta){
        return "update tblEnvio set idRuta="+idRuta+" where idEnvio = "+idEnvio+";";
    }
    
    public static String cambiarEstadoEnvio(int idEnvio,EstadoEnvio estado){
        return "update tblEnvio set estado=\'"+estado+"\' where idEnvio = "+idEnvio+";";
    }

    public static String cambiarDisponible(int idRep, int disponible) {
        return "update tblRepartidor set disponible=\'"+disponible+"\' where idRepartidor = "+idRep+";";
    }
    
    public static String cambiarEstadoRuta(int idRuta, int cerrada){
        return "update tblRuta set cerrada=\'"+cerrada+"\' where idRuta = "+idRuta+";";
    }
    
    public static String cambiarEstadoEnviosRuta(int idRuta, EstadoEnvio estado){
        return "update tblEnvio set estado=\'"+estado+"\' where idRuta = "+idRuta+";";
    }
    
    public static String cambiarDisponibleRep(int idRuta, int disp){
        return "update tblRepartidor set disponible=\'"+disp+"\' where idRepartidor = (select idRepartidor from tblRuta where idRuta = \'"+idRuta+"\');";
    }
}
