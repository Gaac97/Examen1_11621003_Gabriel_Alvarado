/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11621003_gabriel_alvarado;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Alvarado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static ArrayList ListaRaiz = new ArrayList();
    static ArrayList<Archivo> ListArchivo = new ArrayList();
    static ArrayList<Carpeta> ListCarpeta = new ArrayList();
    static ArrayList<Fichero> ListFichero = new ArrayList();

    public static void main(String[] args) {
        String opcion = "";
        opcion = JOptionPane.showInputDialog("MENU\n"
                + "a.Sistema de archivo\n"
                + "b.Probar recursiva\n");
        if (opcion.equalsIgnoreCase("a")) {
            String op = "";
            while (!op.equalsIgnoreCase("g")) {
                op = JOptionPane.showInputDialog("MENU\n"
                        + "a.Entrar a una supcarpeta\n"
                        + "b.Regresar a carpeta anterior\n"
                        + "c.Crear un archivo\n"
                        + "d.Crear una carpeta\n"
                        + "e.Listar directorio\n"
                        + "f.Listar todo el file system\n"
                        + "g.salir");
                if (op.equalsIgnoreCase("a")) {
                    String h = "";
                    for (Carpeta r : ListCarpeta) {
                        h += ListCarpeta.indexOf(r) + "" + ((Carpeta) r);
                    }
                    JOptionPane.showMessageDialog(null, h);

                    int i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de la carpeta"));

                }
                if (op.equalsIgnoreCase("b")) {

                }
                if (op.equalsIgnoreCase("c")) {
                    String contenido = JOptionPane.showInputDialog("Ingrese contenido");
                    int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño"));
                    String hecho = JOptionPane.showInputDialog("Ingrese el autor del archivo");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
                    int fecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fecha"));
                    int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año"));

                    ListArchivo.add(new Archivo(contenido, tamaño, null, hecho, nombre, null));
                    ListFichero.add(new Fichero(tamaño, null, hecho, nombre, null));

                }
                if (op.equalsIgnoreCase("d")) {
                    String g = "";
                    for (Archivo a : ListArchivo) {
                        g += ListArchivo.indexOf(a) + "\t" + ((Archivo) a);
                    }
                    JOptionPane.showMessageDialog(null, g);

                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion"));
                    for (Carpeta c : ListCarpeta) {
                        c.setDocumentos(ListFichero.get(pos));
                    }

                }
                if (op.equalsIgnoreCase("e")) {
                    String f = "";
                    for (Carpeta g : ListCarpeta) {
                        f += ListCarpeta.indexOf(g) + "\t" + ((Carpeta) g);
                    }
                    JOptionPane.showMessageDialog(null, f);
                }
                if (op.equalsIgnoreCase("f")) {
                    String s = "";
                    for (Carpeta g : ListCarpeta) {
                        if (g instanceof Carpeta) {
                            JOptionPane.showMessageDialog(null, "Archivo"
                                    + g);

                        } else {
                            JOptionPane.showMessageDialog(null, "Ficheros" + g);
                        }

                    }

                }

            }
        }

        if (opcion.equalsIgnoreCase("b")) {
            int n;
            System.out.println("Ingrese el tamaño del arreglo");
            n = leer.nextInt();
            int a[] = new int[n];
            a = llenar(a);

          
        }

    }

    public static int MCD(int a[], int p, int q, int pos, int acum, int cont) {
        cont = 2;
        if (pos == a.length) {
            return p;
        } else {
            if (pos == a.length) {
                if (a[pos] % cont == 0) {
                    acum = a[pos] / 2;
                    if (true) {
                        
                    }

                }else{
                    cont++;
                }
            }
        }

        return 0;
    }

    public static int[] llenar(int[] a) {
        int n;
        char resp = 's';

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un numero");
            n = leer.nextInt();
            a[i] = n;

        }

        return a;
    }

}
