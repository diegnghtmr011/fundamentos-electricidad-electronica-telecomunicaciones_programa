/**
 * Clase que contiene el menú principal 
 * @author Área de programación UQ Diego Flores - Maya Sanchez - Daniel Narváez
 * @since 17/09/2023
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

import java.time.LocalDate;

import java.util.Scanner;

public class Curso {

    private String nombre;
    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }
     public static void mensajeBienvenida() {
        System.out.println(
                "Bienvenido a el curso de Fundamentos de electricidad, electrónica y telecomunicaciones \n"
                + "donde podrás conocer y/o usar, tres tópicos asociados a la materia aquí nombrada, \n"
                + "estos, estarán relacionados a un número para que usted realice sus elecciones de manera más cómoda así:\n"
                + "1 - Teoría, acerca de la historia de la computación, tipos de energías y la conductividad de los materiales\n" 
                + "2 - Ley de ohm y ley de watt con la posibilidad de usar 3 formulas distintas para hallar potencia,resistencia,corriente y volaje\n"
                + "3 - Resistencias, su valor en ohmnios y tolerancia dependiendo de los colores que tenga\n"
                + "Digite 1, 2 o 3 dependiendo de la temática a la que desee ingresar"  );
    }

    /**
     * Método que representa al menú del curso en cuestión y contiene el acceso a los menús de los apartados del curso
     * Muestra los menús dependiendo de las eleciones del usuario
     */

    public static void  mostrarMenuCurso(){
        mensajeBienvenida();
        Scanner sc = new Scanner(System.in);
        int opcionElegida = sc.nextInt();

        switch (opcionElegida){
            case 1:{
                Teoria.mostrarMenuTeoria();
                break;
            }
            case 2:{
                LeyOhmWatt.menuLeyOmhWatt();
                break;
            }
            case 3:{
                Resistencia.solicitarValores();
                break;
            }
        }
        sc.close();
    }

}
