package com.actividad.utils;

import com.actividad.model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivos {

    public static List<Registrable> cargarDatos(String rutaArchivo) {
        List<Registrable> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split("_");
                String tipo = datos[0];

                try {
                    String nombre = datos[1];
                    int numRut = Integer.parseInt(datos[2]);
                    char dv = datos[3].charAt(0);
                    
                    String calle = datos[4];
                    int numDireccion = Integer.parseInt(datos[5]);
                    String ciudad = datos[6];

                    Rut rutObj = new Rut(numRut, dv);
                    Direccion dirObj = new Direccion(calle, numDireccion, ciudad);

                    if (tipo.equalsIgnoreCase("CLIENTE")) {
                        int puntos = Integer.parseInt(datos[7]);
                        Cliente c = new Cliente(nombre, rutObj, dirObj, puntos);
                        lista.add(c);
                    } else if (tipo.equalsIgnoreCase("EMPLEADO")) {
                        String cargo = datos[7];
                        Empleado e = new Empleado(nombre, rutObj, dirObj, cargo);
                        lista.add(e);
                    }

                } catch (RutInvalidoException e) {
                    System.out.println("Error al procesar fila debido a RUT inválido: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error en el formato de la línea: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }

        return lista;
    }
}