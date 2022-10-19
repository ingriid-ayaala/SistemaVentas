/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

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
public class ImpAccDatosFichero implements Ordenes {
    //ORDENES
    @Override
    public void crearArchivoOrden(String nombre){
        File archivo = new File(nombre);
        try {
            
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
     @Override
    public void agregarArchivoOrden(String nombre, String contenido){
        //escribimos en el archivo 
        PrintWriter salida = null;
        File archivo= new File(nombre);
        try {
             salida =  new PrintWriter(new FileWriter(nombre, true));
             salida.println(contenido);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }finally{//este bloque siempre se ejecuta
            salida.close();
        }
        
    }
    public static void leerArchivoOrden(String nombre){
        BufferedReader entrada = null;
        //1 declaramos el file
        File archivo = new File (nombre);
        try {
            //2 creamos un descriptor de lectura del fichero
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            //3 ahora recorremos lectura
            while(lectura != null){
                System.out.println("lectura = "+ lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
        
    }
    public static void leerArchivoPorPalabraOrden(String nombre){
        File archivo = new File(nombre);
        try {
            Scanner entrada = new Scanner(archivo);
            int cont = 0;
            //recorro el fichero hasta fin
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont = cont +1;
            }
            System.out.println("Numero de palabras de mi fichero = "+ cont);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    
    
    }
    //PRODUCTOS
    public static void crearArchivoProducto(String nombre){
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void agregarArchivoProducto(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo= new File(nombre);
        
        try {
             salida =  new PrintWriter(new FileWriter(nombre, true));
             salida.println(contenido);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }finally{//este bloque siempre se ejecuta
            salida.close();
        }
        
    }
    public static void leerArchivoProducto(String nombre){
        BufferedReader entrada = null;
        //1 declaramos el file
        File archivo = new File (nombre);
        try {
            //2 creamos un descriptor de lectura del fichero
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            //3 ahora recorremos lectura
            while(lectura != null){
                System.out.println("lectura = "+ lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
        
    }
    public static void leerArchivoPorPalabraProducto(String nombre){
        File archivo = new File(nombre);
        try {
            Scanner entrada = new Scanner(archivo);
            int cont = 0;
            //recorro el fichero hasta fin
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont = cont +1;
            }
            System.out.println("Numero de palabras de mi fichero = "+ cont);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    
    
    }
}
