import java.util.List;

public class Venta {
    public int Cantidad;
    public float Descuento;
    public float Total;

    public float CalcularTotal(List<Camisa> camisas) {
        Cantidad = camisas.size();
        for (Camisa camisa : camisas) {
            Total += camisa.Precio;
        }
        if (Cantidad > 2 && Cantidad < 6) {
            Descuento = Total * 0.05f;
        } else if (Cantidad > 5) {
            Descuento = Total * 0.08f;
        } else {
            Descuento = 0;
        }
        Total -= Descuento;
        return Total;
    }
}
