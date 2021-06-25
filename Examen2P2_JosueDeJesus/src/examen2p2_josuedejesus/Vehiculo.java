/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josuedejesus;

import java.io.Serializable;

/**
 *
 * @author josue
 */
public class Vehiculo implements Serializable{
    private String categoria;
    private String marca;
    private String modelo;
    private int vin;
    private String carroceria;

    public Vehiculo() {
    }
    
    private static final long SerialVersionUID = 777L;

    public Vehiculo(String categoria, String marca, String modelo, int vin, String carroceria) {
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "categoria=" + categoria + ", marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + '}';
    }
    
    
}
