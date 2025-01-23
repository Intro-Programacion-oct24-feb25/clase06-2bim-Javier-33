/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author reroes
 */
public class Ejemplo12 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int [] resultados = new int[valor];
        int cont = 0;
        int limite = resultados.length;
        while (cont < limite) {
            try {
                        System.out.println("Ingrese el primer valor");
                        int valor1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo valor");
                        int valor2 = entrada.nextInt();
                        int resultado = valor1 / valor2;

                        
                        resultados[cont] = resultado;
                        cont = cont + 1;
                        
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
                entrada.nextLine();
            }
            /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/

        }
        System.out.println("El arreglo es:");
        for(int i = 0; i < valor; i++){
            System.out.printf("%s\n", resultados[i]);
        }
        
    }
}