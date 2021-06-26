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
public class Hibrido extends Vehiculo{
    private int kilometros;
    private int pasajeros;
    private int precio;

    public Hibrido() {
        super();
    }

    public Hibrido(String categoria, String marca, String modelo, int vin, String carroceria, int kilometros, int pasajeros, int precio) {
        super(categoria, marca, modelo, vin, carroceria);
        this.kilometros = kilometros;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hibrido{" + "kilometros=" + kilometros + ", pasajeros=" + pasajeros + ", precio=" + precio + '}';
    }
    
    
}
