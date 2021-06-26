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
public class administrarEnsamblados {
    private ArrayList<Ensamblado> listaEnsamblados = new ArrayList();
    private File archivo = null;

    public administrarEnsamblados(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ensamblado> getListaEnsamblados() {
        return listaEnsamblados;
    }

    public void setListaEnsamblados(ArrayList<Ensamblado> listaEnsamblados) {
        this.listaEnsamblados = listaEnsamblados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaEnsamblados=" + listaEnsamblados;
    }

    //extra mutador
    public void setEnsamblado(Ensamblado a) {
        this.listaEnsamblados.add(a);
    }

    public void cargarArchivo() {
        try {
            listaEnsamblados = new ArrayList();
            Ensamblado temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Ensamblado) objeto.readObject()) != null) {
                        listaEnsamblados.add(temp);
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
            for (Ensamblado a : listaEnsamblados) {
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
