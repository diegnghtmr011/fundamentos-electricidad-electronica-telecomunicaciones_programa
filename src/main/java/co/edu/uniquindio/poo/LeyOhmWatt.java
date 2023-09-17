/**
 * Clase que contiene el menú del apartado de calculadora
 * @author Área de programación UQ Diego Flores - Maya Sanchez - Daniel Narváez
 * @since 17/09/2023
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

import java.util.Scanner;

public class LeyOhmWatt {

     /**
     * Método que representa al menú del apartado de calculadora y contiene el acceso a 12 formulas 
     * que sirven para hallar 4 valores distintos de la ley de ohm y watt
     * Muestra los diferentes formulas a partir de la elecciones del usuario
     */

    public static void menuLeyOmhWatt() {
        Scanner sc = new Scanner(System.in);

        mensajeAsignacion();

        int opcion = sc.nextInt();
            
        switch (opcion) {
            case 1:
                calcularVoltaje();
                break;
            case 2:
                calcularResistencia();
                break;
            case 3:
                calcularPotencia();
                break;
            case 4:
                calcularCorriente();
                break;
            default:
                throw new IllegalArgumentException("Opción no válida. Por favor ingrese un número entre 1 y 4 incluyéndolos");
        }
        sc.close();
    }

    public static void mensajeAsignacion() {
        System.out.println("\nBienvenido al apartado de calculadora, en este lugar podrás interactuar\n"
                + "con los siguientes 4 tópicos, ingresando a estos teniendo en cuenta lo siguiente:\n"
                + "VOLTAJE: Ingrese 1\n"
                + "RESISTENCIA: Ingrese 2\n"
                + "POTENCIA: Ingrese 3\n"
                + "CORRIENTE: Ingrese 4\n");
    }

    public static void calcularVoltaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la fórmula para calcular el Voltaje (V):");
        System.out.println("1. V = I * R");
        System.out.println("2. V = P / I");
        System.out.println("3. V = sqrt(P * R)");

        int opcion = sc.nextInt();
        double resultado = 0.0;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor de la Corriente (I):");
                double corriente = sc.nextDouble();
                System.out.println("Ingrese el valor de la Resistencia (R):");
                double resistencia = sc.nextDouble();
                resultado = corriente * resistencia;
                break;
            case 2:
                System.out.println("Ingrese el valor de la Potencia (P):");
                double potencia = sc.nextDouble();
                System.out.println("Ingrese el valor de la Corriente (I):");
                corriente = sc.nextDouble();
                resultado = potencia / corriente;
                break;
            case 3:
                System.out.println("Ingrese el valor de la Potencia (P):");
                potencia = sc.nextDouble();
                System.out.println("Ingrese el valor de la Resistencia (R):");
                resistencia = sc.nextDouble();
                resultado = Math.sqrt(potencia * resistencia);
                break;
            default:
                throw new IllegalArgumentException("Opción no válida. Por favor ingrese un número entre 1 y 3 icluyéndolos.");
        }

        System.out.println("El Voltaje (V) es: " + resultado + " Voltios (V)");

        sc.close();
    }

    public static void calcularResistencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la fórmula para calcular la Resistencia (R):");
        System.out.println("1. R = V / I");
        System.out.println("2. R = (V^2) / P");
        System.out.println("3. R = P / (I^2)");

        int opcion = sc.nextInt();
        double resultado = 0.0;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del Voltaje (V):");
                double voltaje = sc.nextDouble();
                System.out.println("Ingrese el valor de la Corriente (I):");
                double corriente = sc.nextDouble();
                resultado = voltaje / corriente;
                break;
            case 2:
                System.out.println("Ingrese el valor del Voltaje (V):");
                voltaje = sc.nextDouble();
                System.out.println("Ingrese el valor de la Potencia (P):");
                double potencia = sc.nextDouble();
                resultado = (voltaje * voltaje) / potencia;
                break;
            case 3:
                System.out.println("Ingrese el valor de la Potencia (P):");
                potencia = sc.nextDouble();
                System.out.println("Ingrese el valor de la Corriente (I):");
                corriente = sc.nextDouble();
                resultado = potencia / (corriente * corriente);
                break;
            default:
                throw new IllegalArgumentException("Opción no válida. Por favor ingrese un número entre 1 y 3 incluyéndolos.");
        }

        System.out.println("La Resistencia (R) es: " + resultado + " Ohmios (Ω)");

        sc.close();
    }

    public static void calcularPotencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la fórmula para calcular la Potencia (P):");
        System.out.println("1. P = V * I");
        System.out.println("2. P = (V^2) / R");
        System.out.println("3. P = (I^2) * R");

        int opcion = sc.nextInt();
        double resultado = 0.0;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del Voltaje (V):");
                double voltaje = sc.nextDouble();
                System.out.println("Ingrese el valor de la Corriente (I):");
                double corriente = sc.nextDouble();
                resultado = voltaje * corriente;
                break;
            case 2:
                System.out.println("Ingrese el valor del Voltaje (V):");
                voltaje = sc.nextDouble();
                System.out.println("Ingrese el valor de la Resistencia (R):");
                double resistencia = sc.nextDouble();
                resultado = (voltaje * voltaje) / resistencia;
                break;
            case 3:
                System.out.println("Ingrese el valor de la Corriente (I):");
                corriente = sc.nextDouble();
                System.out.println("Ingrese el valor de la Resistencia (R):");
                resistencia = sc.nextDouble();
                resultado = (corriente * corriente) * resistencia;
                break;
            default:
                throw new IllegalArgumentException("Opción no válida. Por favor ingrese un número entre 1 y 3 incluyéndolos.");
        }

        System.out.println("La Potencia (P) es: " + resultado + " Vatios (W)");

        sc.close();
    }

    public static void calcularCorriente() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la fórmula para calcular la Corriente (I):");
        System.out.println("1. I = V / R");
        System.out.println("2. I = sqrt(P / R)");
        System.out.println("3. I = P / V");

        int opcion = sc.nextInt();
        double resultado = 0.0;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor del Voltaje (V):");
                double voltaje = sc.nextDouble();
                System.out.println("Ingrese el valor de la Resistencia (R):");
                double resistencia = sc.nextDouble();
                resultado = voltaje / resistencia;
                break;
            case 2:
                System.out.println("Ingrese el valor de la Potencia (P):");
                double potencia = sc.nextDouble();
                System.out.println("Ingrese el valor de la Resistencia (R):");
                resistencia = sc.nextDouble();
                resultado = Math.sqrt(potencia / resistencia);
                break;
            case 3:
                System.out.println("Ingrese el valor de la Potencia (P):");
                potencia = sc.nextDouble();
                System.out.println("Ingrese el valor del Voltaje (V):");
                voltaje = sc.nextDouble();
                resultado = potencia / voltaje;
                break;
            default:
                throw new IllegalArgumentException("Opción no válida. Por favor ingrese un número entre 1 y 3 incluyéndolos.");
        }

        System.out.println("La Corriente (I) es: " + resultado + " Amperios (A)");

        sc.close();
    }
}
