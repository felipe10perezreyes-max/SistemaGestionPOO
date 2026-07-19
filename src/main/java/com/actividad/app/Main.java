package com.actividad.app;



import com.actividad.model.*;
import com.actividad.utils.LectorArchivos;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Cargamos los datos desde el archivo .txt
        List<Registrable> listaPersonas = LectorArchivos.cargarDatos("datos.txt");
        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("=== SISTEMA DE GESTIÓN POO INICIADO ===");
        System.out.println("Se cargaron " + listaPersonas.size() + " registros desde el archivo.\n");

        do {
            System.out.println("------ MENÚ PRINCIPAL ------");
            System.out.println("1. Mostrar todos los registros (Polimorfismo)");
            System.out.println("2. Buscar persona por número de RUT");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: "); // <-- CORREGIDO AQUÍ
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.\n");
                continue;
            }

            System.out.println(); 

            switch (opcion) {
                case 1:
                    System.out.println("=== LISTADO DE REGISTROS ===");
                    if (listaPersonas.isEmpty()) {
                        System.out.println("No hay datos cargados.");
                    } else {
                        for (Registrable r : listaPersonas) {
                            System.out.println(r.mostrarDatos());
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Ingrese el número de RUT a buscar (sin puntos ni guion): ");
                    try {
                        int rutBuscar = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = false;

                        for (Registrable r : listaPersonas) {
                            if (r instanceof Persona) {
                                Persona p = (Persona) r;
                                
                                if (p.getRut().getNumero() == rutBuscar) {
                                    System.out.println("\n¡Registro Encontrado!");
                                    
                                    if (p instanceof Cliente) {
                                        System.out.println("Tipo: Cliente");
                                    } else if (p instanceof Empleado) {
                                        System.out.println("Tipo: Empleado");
                                    }
                                    
                                    System.out.println(p.mostrarDatos());
                                    encontrado = true;
                                    break;
                                }
                            }
                        }

                        if (!encontrado) {
                            System.out.println("No se encontró ninguna persona con el RUT " + rutBuscar);
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("RUT inválido. Debe ingresar solo números.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema... ¡Buen trabajo en la actividad!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.\n");
            }

        } while (opcion != 3);

        scanner.close();
    }
}