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
public class Ensamblado extends Vehiculo implements Serializable{
    private int capacidad;
    private String autonomía;
    private int modulos;
    private int carga;
    private int ensamblaje;

    public Ensamblado() {
        super();
    }
    
    private static final long SerialVersionUID = 777L;

    public Ensamblado(String categoria, String marca, String modelo, int vin, String carroceria, int capacidad, String autonomía, int modulos, int carga, int ensamblaje) {
        super(categoria, marca, modelo, vin, carroceria);
        this.capacidad = capacidad;
        this.autonomía = autonomía;
        this.modulos = modulos;
        this.carga = carga;
        this.ensamblaje = ensamblaje;
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

    public int getEnsamblaje() {
        return ensamblaje;
    }

    public void setEnsamblaje(int ensamblaje) {
        this.ensamblaje = ensamblaje;
    }

    @Override
    public String toString() {
        return "Ensamblado{" + "capacidad=" + capacidad + ", autonom\u00eda=" + autonomía + ", modulos=" + modulos + ", carga=" + carga + ", ensamblaje=" + ensamblaje + '}';
    }
    
    
}
