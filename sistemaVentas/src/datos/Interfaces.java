/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import datos.Implementar.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ingri
 */
public class Interfaces {
    //CRUD
    public static void main (String[] args){
        String nombreArchivo = "Ordenes.txt";
        //String contenido = "hola mundo";
        Implementar.crearArchivoOrden(nombreArchivo);
        //ManejoArchivos.escribirArchivo(nombreArchivo,"hola mundo");
//        Implementar.agregarArchivoOrden(nombreArchivo, " que tal ?");
//        Implementar.leerArchivoOrden(nombreArchivo);
//        Implementar.leerArchivoPorPalabraOrden(nombreArchivo);
    }
}
