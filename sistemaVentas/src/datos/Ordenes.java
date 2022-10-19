/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import datos.ImpAccDatosFichero.*;
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
public interface Ordenes {

    public void crearArchivoOrden(String nombre);
    
    public void agregarArchivoOrden(String nombre, String contenido);
    //creamos metodos sque juntes implementar con los objetos de venta test 
   
     
    
}
