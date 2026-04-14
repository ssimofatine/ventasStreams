package App;

import entidades.Venta;
import utilidades.CsvLoader;

import java.util.List;

public class app {

    static void main() {

        //Cargar fichero ventas.csv
            List<Venta> ventas = CsvLoader.cargarVentas();
        ventas.forEach(System.out::println);

    }
}