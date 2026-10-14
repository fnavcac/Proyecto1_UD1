package Nave;

import java.util.Scanner;

/**
 * ================================================================================
 *      PROYECTO GRUPAL UD1: SIMULADOR DE ASTRONAVE "ASTRA-9"
 * ================================================================================
 * 
 * Contexto:
 * La agencia de exploración espacial necesita un programa en Java que genere la 
 * ficha oficial de estado de la nave "Astra-9" y de su piloto antes del despegue.
 * 
 * TRABAJO EN PAREJAS Y ROLES:
 * Trabajareis en parejas sobre un unico ordenador. Os repartireis las siguientes
 * resposabilidades, aunque AMBOS debeis revisar y comprender todo el codigo:
 * 
 * • ALUMNO/A A (Oficial de Vuelo - Datos y Cálculos):
 *   Se encarga de declarar las variables, constantes y escribir las fórmulas 
 *   matemáticas del programa. 
 *
 * • ALUMNO/A B (Oficial de Telecomunicaciones - Formato y Calidad):
 *   Se encarga de diseñar la salida por consola (marcos, texto), aplicar el 
 *   casting explícito y redactar los comentarios Javadoc.
 * 
 * @author Francisco Navarro, Alvaro Naranjo
 * @version 1.0
 */

public class FichaNave {
    
    /*
    Esta clase nos va mostrar la ficha informativa de una nave.
    Lo realizamos en el metodo main directamente pidiendo los datos por pantalla
    al usuario.
    */
    
    public static void main(String[] args) {
        
        // Declaracion e Inicializacion de Constantes (No cambian durante la ejecución)
        
        final double CAPACIDAD_MAXIMA_LITROS = 2000.0;
        
        final double CONSUMO_POR_ANIO_LUZ = 180.5;
        
        
        // Declaracion de Variables
        
        String nombrePiloto;
        
        char rangoPiloto;
        
        int nivelExperiencia;
        
        double combustibleActual;
        
        boolean estaListo;
        
        // Declaramos las Variables que vamos a obtener de los calculos
        double aniosLuz, porcentaje;
              
        
        // Pedir los datos al usuario
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del piloto:");
        nombrePiloto = entrada.nextLine(); 
        // Usamos el metodo nextLine() para obtener un String
        
        System.out.println("Introduce el rango del piloto:");
        rangoPiloto = entrada.nextLine().charAt(0);
        // Usamos el metodo charAt(indice) para obtener el valor del caracter, en este caso el indice 0
        
        System.out.println("Introduce el nivel de experiencia del piloto:");
        nivelExperiencia = entrada.nextInt();
        // Usamos el metodo nextInt() para obtener el valor entero
        
        System.out.println("Introduce el combustible actual:");
        combustibleActual = entrada.nextDouble();
        // Usamos el metodo nextDouble() para obtener el valor decimal
        
        System.out.println("Introduce si el sistema esta listo (true/false):");
        estaListo = entrada.nextBoolean();
        // Usamos el metodo nextBoolean() para obtener el valor booleano
        
        System.out.println("\n¡Todo preparado!\n\n");
        
        
        // Calculos
        
        nivelExperiencia++; // Incrementamos el nivel de experiencia en 1
        
        aniosLuz = combustibleActual / CONSUMO_POR_ANIO_LUZ; // Obtenemos los años luz
        
        porcentaje = (combustibleActual / CAPACIDAD_MAXIMA_LITROS) * 100; // Obtenemos el porcentaje
        
        
        // Casting explicito
        
        int aniosLuzTruncado = (int) aniosLuz; // Hay perdida de informacion
        
        
        // Reto extra
        
        double litrosSobrantes = combustibleActual % CONSUMO_POR_ANIO_LUZ;
        
        
        // Mostrar los resultados por pantalla
        
        System.out.println("\n\n===============================");
        System.out.println("Nombre del piloto: " + nombrePiloto);
        System.out.println("Rango del piloto " + rangoPiloto);
        System.out.println("Experiencia del piloto: " + nivelExperiencia);
        System.out.println("===============================");
        System.out.println("Combustible actual: " + combustibleActual + " litros");
        System.out.println("¿Está listo el sistema?: " + estaListo);
        System.out.println("===============================");
        System.out.println("Años luz de distancia: " + aniosLuz);
        System.out.println("Porcentaje de tanque lleno: " + porcentaje + " %");
        System.out.println("Años truncados (Casting): " + aniosLuzTruncado);
        System.out.println("===============================");
        System.out.println("Litros sobrantes tras el viaje: " + litrosSobrantes + " litros");
    }
    
}
