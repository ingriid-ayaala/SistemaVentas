/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaventas;

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
       Producto p7 = new Producto("nata",2.57);
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
       //mostrar productos 
       o1.mostrarOrden();
        System.out.println("TOTAL: "+o1.calcularOrden());
       //o1.calcularOrden();
    }
    
}
