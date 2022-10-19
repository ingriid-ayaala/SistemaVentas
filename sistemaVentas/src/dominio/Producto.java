/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;
import dominio.Orden;
/**
 *
 * @author ingri
 */
public class Producto {
    private int idProducto ;
    private String nombre;
    private double precio;
    private static int contadorProductos; 
    

    public Producto() {
        this.idProducto= ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this.idProducto = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        //this.contadorProductos = contadorProductos;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "\nId:  " + idProducto + ", Nombre:  " + nombre + ", Precio: " + precio + "€";
    }

   
    
    
    
    
}
