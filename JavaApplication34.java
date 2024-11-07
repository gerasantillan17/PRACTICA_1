/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.print("Introduce el número de veces que quieres repetir la cadena: ");
        int numero = scanner.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
    }
}
