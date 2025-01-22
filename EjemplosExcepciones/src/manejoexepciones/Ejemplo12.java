/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo12 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        for (int i = 0; i < valor ; i++ ) {
            System.out.println("Ingrese el primer valor");
            double valor1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo valor");
            double valor2 = entrada.nextDouble();
            double resultado = valor1/valor2;
            
            double[] resultados = new double[valor];
            resultados[valor] = resultado;
            System.out.println(resultados);
        }
        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
        
         
    }
}
