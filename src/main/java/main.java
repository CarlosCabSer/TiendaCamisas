import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Camisa> camisas = new ArrayList<Camisa>();
        Camisa camisa1 = new Camisa();
        camisa1.Precio = 190;
        camisa1.Descripcion = "Camisa de manga corta";
        Camisa camisa2 = new Camisa();
        camisa2.Precio = 230;
        camisa2.Descripcion = "Camisa casual de manga larga";
        Camisa camisa3 = new Camisa();
        camisa3.Precio = 310;
        camisa3.Descripcion = "Camisa formal de manga larga";
        Camisa camisa4 = new Camisa();
        camisa4.Precio = 310;
        camisa4.Descripcion = "Camisa formal de manga larga";
        Camisa camisa5 = new Camisa();
        camisa5.Precio = 310;
        camisa5.Descripcion = "Camisa formal de manga larga";
        Camisa camisa6 = new Camisa();
        camisa6.Precio = 190;
        camisa6.Descripcion = "Camisa de manga corta";
        camisas.add(camisa1);
        camisas.add(camisa2);
        camisas.add(camisa3);
        camisas.add(camisa4);
        camisas.add(camisa5);
        camisas.add(camisa6);
        Venta venta1 = new Venta();
        venta1.CalcularTotal(camisas);
        System.out.println("El descuento es de: "+venta1.Descuento);
        System.out.println("Total: "+venta1.Total);
    }
}
