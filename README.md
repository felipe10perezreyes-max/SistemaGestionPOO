# Sistema de Gestión POO - Semana 9

## Descripción General
Este sistema es una aplicación de consola desarrollada en Java utilizando NetBeans y Maven. Consolida los principios de la Programación Orientada a Objetos (POO) mediante la gestión de registros de Clientes y Empleados cargados dinámicamente desde un archivo plano.

## Estructura del Proyecto (Paquetes)
* **`com.actividad.model`**: Contiene las entidades del dominio (`Persona`, `Cliente`, `Empleado`, `Rut`, `Direccion`), la interfaz `Registrable` y la excepción personalizada `RutInvalidoException`.
* **`com.actividad.utils`**: Contiene la clase `LectorArchivos` encargada de parsear los datos de prueba de `datos.txt`.
* **`com.actividad.app`**: Contiene la clase `Main` con el menú interactivo por consola.

## Conceptos de POO Aplicados
* **Encapsulamiento:** Atributos privados con métodos de acceso público (Getters y Setters).
* **Composición:** La clase `Persona` contiene instancias de `Rut` y `Direccion`.
* **Herencia:** `Cliente` y `Empleado` extienden de la clase padre `Persona`.
* **Polimorfismo:** Uso de la interfaz `Registrable` para el almacenamiento y recorrido de listas genéricas.
* **Validación en tiempo de ejecución:** Uso del operador `instanceof` para determinar el tipo de objeto al buscar por RUT.

## Instrucciones de Ejecución
1. Clonar el repositorio.
2. Asegurarse de tener el archivo `datos.txt` en la raíz del proyecto.
3. Ejecutar la clase `Main.java` desde NetBeans presionando `Shift + F6`.
