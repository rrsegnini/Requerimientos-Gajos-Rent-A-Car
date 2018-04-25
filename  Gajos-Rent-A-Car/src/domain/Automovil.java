/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author CASA
 */

public class Automovil {
    private String placa;
    private String modelo;
    private String marca;
    private String motor;
    private String transmisión;
    private String frenos;
    

    public Automovil(String placa, String modelo, String marca, String transmisión) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.transmisión = transmisión;
    }

       
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmisión() {
        return transmisión;
    }

    public void setTransmisión(String transmisión) {
        this.transmisión = transmisión;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }
        
    public String getName() {
        return this.marca + this.modelo + this.placa;
    }
    
    @Override
    public String toString(){
        return marca + " " + modelo + " " + placa; 
    }

}

