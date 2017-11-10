/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11621003_gabriel_alvarado;

import java.util.Date;

/**
 *
 * @author Gabriel Alvarado
 */
public class Archivo extends Fichero {

    private String contenido;

    public Archivo() {
        super();
    }

    public Archivo(String contenido, int tamano, Date fecha, String HechoPor, String nombre, Carpeta perteneceA) {
        super(tamano, fecha, HechoPor, nombre, perteneceA);
        this.contenido = contenido;
    }

   

    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Archivo{" + "contenido=" + contenido + '}';
    }

}
