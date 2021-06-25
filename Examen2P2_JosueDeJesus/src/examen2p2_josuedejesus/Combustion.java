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
public class Combustion extends Vehiculo{
    private  int cilindrada;
    private int cilindros;
    private int consumo;

    public Combustion() {
        super();
    }

    public Combustion(int cilindrada, int cilindros, int consumo, String categoria, String marca, String modelo, int vin, String carroceria) {
        super(categoria, marca, modelo, vin, carroceria);
        this.cilindrada = cilindrada;
        this.cilindros = cilindros;
        this.consumo = consumo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Combustion{" + "cilindrada=" + cilindrada + ", cilindros=" + cilindros + ", consumo=" + consumo + '}';
    }
    
    
}
