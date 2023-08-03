package org.actividad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

 DetalleDTO d1= new DetalleDTO("sopa", 3);
        DetalleDTO d2 =new DetalleDTO("taquitos",10);
        DetalleDTO d3= new DetalleDTO("quesadillas",13);
        DetalleDTO d4 = new DetalleDTO("frijolito", 15);
         List<DetalleDTO> ds = new ArrayList<>();
         ds.add(d2) ;
         ds.add(d3);
         ds.add(d4);

         CalcularCantidad calcularCantidad= new CalcularCantidad();
         double descuento = calcularCantidad.descuento(ds);
         System.out.println("Porcentaje descuento por cantidad de platos "+ descuento*100 );
    }
}