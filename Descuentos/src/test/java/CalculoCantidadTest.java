import org.actividad2.CalcularCantidad;
import org.actividad2.DetalleDTO;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculoCantidadTest {
    @Test
    void testDescuentoSinDescuento() {
        List<DetalleDTO> detalles = Arrays.asList(new DetalleDTO("Sopa", 2, 4));
        CalcularCantidad calculoCantidad = new CalcularCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.0, descuento, 0.001);
    }
}
