package org.actividad2;

import java.util.List;

public class CalcularCantidad implements CalculoDescuento{

    public Double descuento(List<DetalleDTO> detalleDTOS) {
        int cantidadPlatos = 0;
        for (DetalleDTO detalle : detalleDTOS) {
            cantidadPlatos += detalle.getCantidad();
        }
        if (cantidadPlatos<= 5) {
            return 0.0;
        } else if (cantidadPlatos< 10) {
            return 0.03;
        } else if (cantidadPlatos <= 15) {
            return 0.05;
        } else {
            return 0.3;
        }

    }


}
