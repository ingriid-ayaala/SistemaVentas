/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;
import dominio.Producto;
/**
 *
 * @author ingri
 */
public class Orden {
    private int idOrden ;
    private Producto producto [];
    private static int contadorOrdenes ; 
    int maxProducto = 10;
    private final int id;
    
    //contructor

    public Orden() {
        this.id= ++Orden.contadorOrdenes;
    }
    
//    public void agregarProductos (producto: Producto){
//         
//       
//    }
    public void agregarProductos (Producto productos){
        int i=0;
        
            for ( i=0; i<producto.length; i++){
            
            if(producto[i]=0){
                
                producto [i] = productos ;
                ++Producto.contadorProductos ;
            }
            
            else{
                
            }
            
            }
    
    }


    //calcular
    //mostrar 
    

    

    
    
}
