/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author USER
 */
public class Carrito {
        public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*DESCUENTO;
            mensajePagar(Total);
            mensajeEnviado();
        }else {
            Total = precioProducto*DESCUENTO_BASICO;
            mensajePagar(Total);
            mensajeEnviado();
        }   

    }
    public static final double DESCUENTO_BASICO = 0.95;
    public static final double DESCUENTO = 0.8;

    public void mensajeEnviado() {
        System.out.println("Enviado");
    }

    public void mensajePagar(double Total) {
        System.out.println("El total a pagar es:"+Total);
    }
}
