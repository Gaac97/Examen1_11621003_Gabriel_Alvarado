/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11621003_gabriel_alvarado;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Alvarado
 */
public class Carpeta extends Fichero {

    private ArrayList<Fichero> documentos = new ArrayList();

    public Carpeta() {
    }
    

    public Carpeta(int tamano, Date fecha, String HechoPor, String nombre, Carpeta perteneceA) {
        super(tamano, fecha, HechoPor, nombre, perteneceA);
    }

    

    public ArrayList<Fichero> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Fichero s) {
        documentos.add(s);
    }

    @Override
    public String toString() {
        return "Carpeta{" + "documentos=" + documentos + '}';
    }

}
