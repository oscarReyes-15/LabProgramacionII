/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labprogramacion2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejercicio2_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diccionario de Variables 
        double n1, n2, n3, n4, min, max, prom;
        Scanner entrada = new Scanner(System.in);
        String promFormatted;
        
        //Entrada
        System.out.print("----Programa de notas---- \nIngrese 4 notas: \nNota 1:");
        n1 = entrada.nextDouble();
        while (n1 < 0 || n1 > 100){
            System.out.print("Ingrese una nota valida! \n");
            n1 = entrada.nextDouble();
        }
        System.out.print("Nota 2: ");
        n2 = entrada.nextDouble();
        while (n2 < 0 || n2 > 100){
            System.out.print("Ingrese una nota valida! \n");
            n2 = entrada.nextDouble();
        }
        System.out.print("Nota 3: ");
        n3 = entrada.nextDouble();
        while (n3 < 0 || n3 > 100){
            System.out.print("Ingrese una nota valida! \n");
            n3 = entrada.nextDouble();
        }
        System.out.print("Nota 4: ");
        n4 = entrada.nextDouble();
        while (n4 < 0 || n4 > 100){
            System.out.print("Ingrese una nota valida! \n");
            n4 = entrada.nextDouble();
        }        
        
        //Proceso
        max = Math.max(n1, Math.max(n2, Math.max(n3, n4))); //Calcula la nota maxima
        min = Math.min(n1, Math.min(n2, Math.min(n3, n4))); //Calcula la nota minima
        
        prom = (n1 + n2 + n3 + n4) / 4;
        promFormatted = String.format("%.2f", prom);
        
        //Salida
        System.out.print("\nSu promedio fue " + promFormatted + "% \nLa nota Maxima: " + max + "\nLa nota Minima: " + min);
        
    }
    
}
