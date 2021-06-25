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
public class administrarHibrido {
    private ArrayList<Hibrido> listaHibrido = new ArrayList();
    private File archivo = null;

    public administrarHibrido(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hibrido> getListaHibrido() {
        return listaHibrido;
    }

    public void setListaHibrido(ArrayList<Hibrido> listaHibrido) {
        this.listaHibrido = listaHibrido;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaHibrido=" + listaHibrido;
    }

    //extra mutador
    public void setHibrido(Hibrido a) {
        this.listaHibrido.add(a);
    }

    public void cargarArchivo() {
        try {
            listaHibrido = new ArrayList();
            Hibrido temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hibrido) objeto.readObject()) != null) {
                        listaHibrido.add(temp);
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
            for (Hibrido a : listaHibrido) {
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
