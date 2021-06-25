/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josuedejesus;

/**
 *
 * @author josue
 */
public class HibridoEnchufable extends Vehiculo{
    private int capacidadMaletero;
    private int combustible;

    public HibridoEnchufable() {
        super();
    }

    public HibridoEnchufable(int capacidadMaletero, int combustible, String categoria, String marca, String modelo, int vin, String carroceria) {
        super(categoria, marca, modelo, vin, carroceria);
        this.capacidadMaletero = capacidadMaletero;
        this.combustible = combustible;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "HibridoEnchufable{" + "capacidadMaletero=" + capacidadMaletero + ", combustible=" + combustible + '}';
    }
    
    
}
