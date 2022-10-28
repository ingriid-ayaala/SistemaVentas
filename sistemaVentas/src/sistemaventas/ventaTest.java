/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaventas;

import datos.Ordenes;
import datos.ImpAccDatosFichero;
import dominio.Orden;
import dominio.Producto;

/**
 *
 * @author ingri
 */
public class ventaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJECUTAR LA PRUEBA DE APLICACIONES
       Producto p1 = new Producto("pan",2.5);
       Producto p2 = new Producto("arroz",1.5);
       Producto p3 = new Producto("pan",2.5);
       Producto p4 = new Producto("patata",2.4);
       Producto p5 = new Producto("leche",2.54);
       Producto p6 = new Producto("fresa",2.58);
       Producto p7 = new Producto("naranjas",2.57);
       Producto p8 = new Producto("platano",2.57);
       Producto p9 = new Producto("queso",2.57);
       Producto p10 = new Producto("cafe",2.57);
       Producto p11 = new Producto("agua",2.57);
       
       //Metodos 
       //Agregar productos 
       Orden o1 = new Orden();
       o1.agregarProductos(p1);
       o1.agregarProductos(p2);
       o1.agregarProductos(p3);
       o1.agregarProductos(p4);
       o1.agregarProductos(p5);
       o1.agregarProductos(p6);
       o1.agregarProductos(p7);
       o1.agregarProductos(p8);
       o1.agregarProductos(p9);
       o1.agregarProductos(p10);
       o1.agregarProductos(p11);
       //mostrar productos 
       o1.mostrarOrden();
       
       //calcular el precio total del las ordenes 
       System.out.println("TOTAL: "+o1.calcularOrden()+"€");
      
       //o1.calcularOrden();
       //Manejo de ARCHIVOS
       Ordenes os1  = new Ordenes();
       String nombreArchivo = "Ordenes.txt";
       os1.crearArchivoOrden(nombreArchivo);
       //os1.agregarArchivoOrden("Ordenes.txt", o1.);
       
       
//       {
//           @Override
//           public void crearArchivoOrden(String nombre) {
//               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//           }
//
//           @Override
//           public void agregarArchivoOrden(String nombre, String contenido) {
//               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//           }
//
//           @Override
//           public void leerArchivoOrden(String nombre) {
//               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//           }
//       };
      
      
    }
    
    
    
}
