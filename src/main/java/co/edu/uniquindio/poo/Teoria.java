/**
 * Clase que contiene el menú del apartado de Teoría
 * @author Área de programación UQ Diego Flores - Maya Sanchez - Daniel Narváez
 * @since 17/09/2023
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */

package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Teoria {

    public static void mensajeAsignacion(){
         System.out.println(
            "\nBienvenido al apartado de teoría del curso en cuestión, en este lugar podrás interactuar\n"
            +"con los siguientes 3 tópicos mencionados en la bienvenida del curso, podrás ingresar a estos teniendo en cuenta lo siguiente:\n"
            +"- HISTORIA DE LA COMPUTACIÓN: Ingrese 1\n"
            +"- TIPOS DE ENERGIA: Ingrese 2\n"
            +"- MATERIALES CONDUCTORES Y AISLANTES: Ingrese 3\n");
    }

    
    /**
     * Método que representa al menú del apartado de teoría y contiene el acceso a 3 temáticas
     * Muestra los diferentes temáticas de teoría ofertadas dependiendo de las eleciones del usuario
     */
    public static void mostrarMenuTeoria(){
        mensajeAsignacion();
        
        Scanner sc = new Scanner(System.in);
        
        int opcionElegida = sc.nextInt();
        
        switch (opcionElegida){

            case 1:{
                System.out.println(
                "\nLos inicios de la computación se remontan a la antigüedad, cuando las\n"
                +"civilizaciones desarrollaban métodos primitivos para realizar cálculos matemáticos.\n" +
                "Aquí hay un vistazo a algunos de los hitos clave en los primeros días de la computación:\n\n" +
                "Máquinas analíticas de Babbage (siglo XIX): Charles Babbage diseñó varias máquinas analíticas\n" +
                "mecánicas en la década de 1820 que pueden considerarse como los precursores de las computadoras modernas.\n"+
                "Estas máquinas eran programables y podían realizar cálculos complejos, aunque nunca se construyeron completamente durante su vida.\n\n"+
                "Máquina de tarjetas perforadas de Hollerith (1890): Herman Hollerith diseñó una máquina que utilizaba tarjetas perforadas para procesar datos de manera eficiente.\n"+ 
                "Su invención se usó para el censo de 1890 en los Estados Unidos y más tarde se convirtió en la base de las primeras computadoras electromecánicas.\n\n"+
                "Colossus y ENIAC: Estas primeras computadoras electrónicas utilizaban representación binaria en su núcleo. Los datos y las instrucciones se codificaban mediante interruptores,\n"+
                "relés y tubos de vacío en un sistema binario de 0 y 1. Esto marcó un paso importante hacia la adopción generalizada de la representación binaria en la computación moderna.\n\n"
                );
                break;
            }
            case 2:{
                System.out.println(
                "\nExisten diversos tipos de energía que impulsan nuestras vidas y dan vida a nuestro mundo\n"+
                "moderno. La energía térmica, por ejemplo, se deriva del calor y se utiliza para generar\n"+
                "electricidad en plantas de energía geotérmica y solar, así como para calentar nuestros\n"+
                "hogares. La energía cinética, en cambio, está asociada al movimiento y se aprovecha en\n"+
                "aplicaciones como el transporte, donde los automóviles y trenes convierten la energía\n"+
                "cinética en movimiento. La energía potencial, almacenada en objetos en reposo, se libera\n"+
                "cuando estos caen o se desplazan, como en una central hidroeléctrica. La energía química\n"+
                "se encuentra en los enlaces moleculares y se libera en procesos como la combustión de\n"+
                "combustibles fósiles. Además, la energía nuclear se genera mediante reacciones nucleares\n"+
                "controladas en centrales nucleares. Por último, la energía eléctrica es esencial en nuestra\n"+
                "vida diaria, ya que alimenta dispositivos electrónicos, ilumina nuestras casas y es la forma\n"+
                "en que se transporta la mayoría de las demás formas de energía a través de líneas de\n"+
                "transmisión y distribución. Estos diversos tipos de energía desempeñan un papel crucial en\n"+
                "nuestra sociedad y son fundamentales para satisfacer nuestras necesidades diarias y avanzar hacia un futuro sostenible.");
                break;
            }
            case 3:{
                System.out.println(
                "\nLos materiales conductores y aislantes desempeñan roles fundamentales en la electrónica.\n"+
                "Los materiales conductores permiten que las corrientes eléctricas fluyan libremente debido a la abundancia de electrones libres en su\n"+
                "estructura atómica. Esto los hace ideales para la fabricación de cables y componentes\n"+
                "eléctricos. Por otro lado, los materiales aislantes, como el vidrio y el plástico, tienen una\n"+
                "estructura que limita el movimiento de electrones, lo que los convierte en excelentes \n"+
                "opciones para proteger contra descargas eléctricas y aislamiento térmico. La capacidad de\n"+
                "elegir entre materiales conductores y aislantes según la aplicación es esencial en la\n"+
                "construcción de dispositivos electrónicos y sistemas eléctricos, permitiendo un flujo\n"+
                "controlado de electricidad y garantizando la seguridad y el rendimiento óptimo.");
                break;
            }
            default:
                throw new IllegalArgumentException("Opción no válida. Por favor ingrese un número entre 1 y 3 incluyéndolos");
        }
    sc.close();
    }



 }
    

