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
public class Electrico extends Vehiculo {

    private int coeficienteAerodinamico;
    private int motores;
    private int recarga;

    public Electrico() {
        super();
    }

    public Electrico(String categoria, String marca, String modelo, int vin, String carroceria, int coeficienteAerodinamico, int motores, int recarga) {
        super(categoria, marca, modelo, vin, carroceria);
        this.coeficienteAerodinamico = coeficienteAerodinamico;
        this.motores = motores;
        this.recarga = recarga;
    }

    public int getCoeficienteAerodinamico() {
        return coeficienteAerodinamico;
    }

    public void setCoeficienteAerodinamico(int coeficienteAerodinamico) {
        this.coeficienteAerodinamico = coeficienteAerodinamico;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }

    @Override
    public String toString() {
        return "Electrico{" + "coeficienteAerodinamico=" + coeficienteAerodinamico + ", motores=" + motores + ", recarga=" + recarga + '}';
    }

}
