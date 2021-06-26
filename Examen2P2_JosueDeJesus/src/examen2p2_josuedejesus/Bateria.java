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
public class Bateria implements Serializable{

    private String marca;
    private int capacidad;
    private String autonomía;
    private int modulos;
    private int carga;
    private String categoria;
    private int ensamblaje;

    public Bateria() {
    }

    public Bateria(String marca, int capacidad, String autonomía, int modulos, int carga, String categoria, int ensamblaje) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.autonomía = autonomía;
        this.modulos = modulos;
        this.carga = carga;
        this.categoria = categoria;
        this.ensamblaje = ensamblaje;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getAutonomía() {
        return autonomía;
    }

    public void setAutonomía(String autonomía) {
        this.autonomía = autonomía;
    }

    public int getModulos() {
        return modulos;
    }

    public void setModulos(int modulos) {
        this.modulos = modulos;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEnsamblaje() {
        return ensamblaje;
    }

    public void setEnsamblaje(int ensamblaje) {
        this.ensamblaje = ensamblaje;
    }

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", capacidad=" + capacidad + ", autonom\u00eda=" + autonomía + ", modulos=" + modulos + ", carga=" + carga + ", categoria=" + categoria + ", ensamblaje=" + ensamblaje + '}';
    }
    
    
}
