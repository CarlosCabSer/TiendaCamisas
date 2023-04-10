import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VentaTest {
    private Venta venta;

    @BeforeEach
    void setUp() {
        venta = new Venta();
    }

    @Test
    void calcularTotal() {
        Camisa camisa1 = new Camisa();
        camisa1.Precio = 190;
        Camisa camisa2 = new Camisa();
        camisa2.Precio = 230;
        Camisa camisa3 = new Camisa();
        camisa3.Precio = 310;
        List<Camisa>camisas = new ArrayList<Camisa>();
        camisas.add(camisa1);
        camisas.add(camisa2);
        camisas.add(camisa3);
        assertEquals(693.5,venta.CalcularTotal(camisas));
    }
}