/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejercicio1_Caracteres {
    /*
    viernes, 24/10
    
    holah
    maximo
    char inicial 
    c1- h o l a h h a 
    c2-   o     
    
    */
    
    public static void main(String[] args) {
        //Diccionario de Variables
        int i = 0, j = 0, max = 0, count = 0;
        String text; //char CharId;
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de texto
        System.out.print("ingrese una palabra: ");
        text = entrada.next();
 
        //Proceso - Ciclo
        while (text.length() > i){ 
            
            while (text.length() > j){
                    
                if(text.charAt(i) == text.charAt(j)){ //Si son iguales suma a l a cuenta
                    count++;
                    
                    } 
                j++;
            } 
            max = Math.max(count, max); //Compara y guarda el numero repeticiones mas alta
            System.out.print(max);
            i++;
            
            }
            
            System.out.print("En la palabra " + text + " el caracter " + " se repite: " + max + " veces");
        }
        
        
    
        
    }


