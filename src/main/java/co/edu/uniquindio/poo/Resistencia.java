/**
 * Clase que contiene el menú del apartado de cálculo del valor de resistencias
 * @author Área de programación UQ Diego Flores - Maya Sanchez - Daniel Narváez
 * @since 17/09/2023
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Resistencia {

    public String mostrarMenuResistencia() {
        String menu = ("\nPROGRAMA PARA CALCULAR EL VALOR DE UNA RESISTENCIA\n"
                + "***********************Menu***********************\n"
                + "**************************************************\n" + "***Resistencia***\n" + "Negro (0)\n"
                + "Cafe (1)\n"
                + "Rojo (2)\n" + "Naranja (3)\n" + "Amarillo (4)\n" + "Verde (5)\n" + "Azul (6)\n"
                + "Violeta (7)\n" + "Gris (8)\n" + "Blanco (9)\n" + "***Tolerancia\n***" + "Dorado (5%)\n"
                + "Plateado (10%)\n" +
                "**************************************************\n");
        return (menu);
    }

    public static long calcularValorResistencia(long colorBanda1, long colorBanda2, long colorBanda3) {
        // Verificar que los colores estén en el rango correcto
        long[] coloresBanda = { colorBanda1, colorBanda2, colorBanda3 };

        for (long color : coloresBanda) {
            if (color < 0 || color > 9) {
                throw new IllegalArgumentException("Los colores de banda deben estar entre 0 y 9");
            }
        }

        // Calculamos el valor de la resistencia
        long valor = (colorBanda1 * 10 + colorBanda2) * (long) Math.pow(10, colorBanda3);

        return valor;
    }

    public static int calcularValorTolerancia(int tipoTolerancia) {
        int tolerancia;
        switch (tipoTolerancia) {
            case 1: // 5% de tolerancia (dorado)
                tolerancia = 5;
                break;
            case 2: // 10% de tolerancia (plateado)
                tolerancia = 10;
                break;
            default:
                throw new IllegalArgumentException("El tipo de tolerancia debe ser 1 o 2");
        }

        return tolerancia;

    }

    /**
     * Método que representa al menú del apartado de valor de resistencias y contiene el acceso a
     * 9 colores y dos tolerancias que pueden elegirse mediante numeros
     * Muestra el valor de la resistencia y la tolerancia que se digita por el usuario
     */

    public static void solicitarValores() {
        Scanner sc = new Scanner(System.in);
        Resistencia instancia = new Resistencia();
        System.out.println(instancia.mostrarMenuResistencia());

        // Solicitamos los valores de las bandas de la resistencia
        System.out.println("Ingrese el color de la banda 1 (0-9): ");
        int colorBanda1 = sc.nextInt();
        System.out.println("Ingrese el color de la banda 2 (0-9): ");
        int colorBanda2 = sc.nextInt();
        System.out.println("Ingrese el color de la banda 3 (0-9): ");
        int colorBanda3 = sc.nextInt();
        System.out.println("Ingrese 1 si la tolerancia es dorada o 2 si la tolerancia es plateada: ");
        int tipoTolerancia = sc.nextInt();

        // Calculamos el valor de la resistencia
        long valorResistencia = calcularValorResistencia(colorBanda1, colorBanda2, colorBanda3);

        int valorTolerancia = calcularValorTolerancia(tipoTolerancia);

        // Mostramos el valor de la resistencia
        System.out.println("El valor de la resistencia es: " + valorResistencia);
        // Mostramos el porcentaje de tolerancia
        System.out.println("Tolerancia: " + valorTolerancia + "%");
        sc.close();
    }

}
