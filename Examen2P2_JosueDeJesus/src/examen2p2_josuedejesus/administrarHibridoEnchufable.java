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
public class administrarHibridoEnchufable {
    private ArrayList<HibridoEnchufable> listaHibridoEnchufable = new ArrayList();
    private File archivo = null;

    public administrarHibridoEnchufable(String path) {
        archivo = new File(path);
    }

    public ArrayList<HibridoEnchufable> getListaHibridoEnchufable() {
        return listaHibridoEnchufable;
    }

    public void setListaHibridoEnchufable(ArrayList<HibridoEnchufable> listaHibridoEnchufable) {
        this.listaHibridoEnchufable = listaHibridoEnchufable;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaHibridoEnchufable=" + listaHibridoEnchufable;
    }

    //extra mutador
    public void setHibridoEnchufable(HibridoEnchufable a) {
        this.listaHibridoEnchufable.add(a);
    }

    public void cargarArchivo() {
        try {
            listaHibridoEnchufable = new ArrayList();
            HibridoEnchufable temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (HibridoEnchufable) objeto.readObject()) != null) {
                        listaHibridoEnchufable.add(temp);
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
            for (HibridoEnchufable a : listaHibridoEnchufable) {
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
