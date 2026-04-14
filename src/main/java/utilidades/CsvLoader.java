package utilidades;

import entidades.Venta;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CsvLoader {

    public static List<Venta> cargarVentas(String rutaFichero) {

        Path ruta = Paths.get("src/main/resources/ventas.csv");
        List<Venta> ventas = null;

        try {
            List<String> filas = Files.readAllLines(ruta);




        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return ventas;
    }

}
