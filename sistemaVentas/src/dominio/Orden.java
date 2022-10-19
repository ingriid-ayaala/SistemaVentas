/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;
import dominio.Producto;
import java.util.ArrayList;
/**
 *
 * @author ingri
 */
public class Orden {
    //private int idOrden ;
    private ArrayList<Producto> producto = new ArrayList<Producto>();
    private static int contadorOrdenes ; 
    static int maxProducto = 10;
    private int idOrden;
    
    //contructor

    public Orden() {
        this.idOrden= ++Orden.contadorOrdenes;
        //this.producto = new ArrayList<Producto>();
    }
    
    //agregar productos
    public void agregarProductos (Producto p){
       if (maxProducto<=producto.size()) {
            System.out.println("El limite de productos es 10");
            
       }else{
             this.producto.add(p);
       }
        //System.out.println("");
        //this.producto.add(p);
        
    }

    //calcular
    public double calcularOrden (){
        double cont =0;
        for (Producto p : producto) {
            cont += p.getPrecio();
            //cont = cont+ p.getPrecio();
        }
        
        return cont;
    }
    //mostrar 
    public void mostrarOrden(){
        
        System.out.println("Orden"+ idOrden+" Productos"+producto);
    }
    
}
