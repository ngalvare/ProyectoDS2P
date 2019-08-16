/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author ANA
 */
public class RutaEntrega {
    
    private int id;
    private List<Envio> envios;
    private Repartidor repartidor;
    private boolean esExitosa;

    public RutaEntrega(int id, List<Envio> envios, Repartidor repartidor, boolean esExitosa) {
        this.id = id;
        this.envios = envios;
        this.repartidor = repartidor;
        this.esExitosa = esExitosa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
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
        return new ArrayList<Envio>;
    }
}
