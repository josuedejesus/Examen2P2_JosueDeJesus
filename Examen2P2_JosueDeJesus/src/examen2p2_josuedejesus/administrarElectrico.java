/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_josuedejesus;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class administrarElectrico {
    private ArrayList<Electrico> listaElectrico = new ArrayList();
    private File archivo = null;

    public administrarElectrico(String path) {
        archivo = new File(path);
    }

    public ArrayList<Electrico> getListaElectrico() {
        return listaElectrico;
    }

    public void setListaElectrico(ArrayList<Electrico> listaElectrico) {
        this.listaElectrico = listaElectrico;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaElectrico=" + listaElectrico;
    }

    //extra mutador
    public void setElectrico(Electrico a) {
        this.listaElectrico.add(a);
    }

    public void cargarArchivo() {
        try {
            listaElectrico = new ArrayList();
            Electrico temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Electrico) objeto.readObject()) != null) {
                        listaElectrico.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Electrico a : listaElectrico) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
