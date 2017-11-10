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
public class Fichero {
    protected int tamano;
    protected Date fecha;
    protected String HechoPor;
    protected String nombre;
    protected Carpeta perteneceA;

    public Fichero() {
        super();
    }

   

    public Fichero(int tamano, Date fecha, String HechoPor, String nombre, Carpeta perteneceA) {
        this.tamano = tamano;
        this.fecha = fecha;
        this.HechoPor = HechoPor;
        this.nombre = nombre;
        this.perteneceA = perteneceA;
    }

    

   

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHechoPor() {
        return HechoPor;
    }

    public void setHechoPor(String HechoPor) {
        this.HechoPor = HechoPor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carpeta getPerteneceA() {
        return perteneceA;
    }

    public void setPerteneceA(Carpeta perteneceA) {
        this.perteneceA = perteneceA;
    }

   

    @Override
    public String toString() {
        return "Fichero{" + "tamano=" + tamano + ", fecha=" + fecha + ", HechoPor=" + HechoPor + ", nombre=" + nombre + ", perteneceA=" + perteneceA + '}';
    }
    
    
}
