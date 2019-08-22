/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeltecnoimport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANA
 */
public class RutaEntrega {
    
    private int id;
//    private List<Envio> envios;
//    private Repartidor repartidor;
    private String nombreRep;
    private boolean esExitosa;

    public RutaEntrega(int id, String nombreRep, boolean esExitosa) {
        this.id = id;
        this.nombreRep = nombreRep;
        this.esExitosa = esExitosa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRep() {
        return nombreRep;
    }

    public void setNombreRep(String nombreRep) {
        this.nombreRep = nombreRep;
    }

    
    public boolean isEsExitosa() {
        return esExitosa;
    }

    public void setEsExitosa(boolean esExitosa) {
        this.esExitosa = esExitosa;
    }
    
    public void agregarEnvio(Envio e){
        System.out.println("Clase RutaEntrega Metodo agregarEnvio");
    }
    
    public void actualizarEnvios(){
        System.out.println("Clase RutaEntrega Metodo actualizarEnvios");
    }
    
    public List<Envio> obtenerEnviosFallidos(){
        System.out.println("Clase RutaEntrega Metodo obtenerEnviosFallidos");
        return new ArrayList<>();
    }
}
