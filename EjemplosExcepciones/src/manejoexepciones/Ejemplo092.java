/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        while (bandera) {

            try {
                System.out.println("Ingrese un pais");
                String pais = entrada.nextLine();
                pais.toLowerCase();
                char vocal = pais.charAt(0);

                if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o'
                        || vocal == 'u') {
                    bandera = true;
                    throw new Exception("Debe ingresar un pais que inicie con"
                            + "consonante\n");
                    
  
                }else{
                    cadena = pais;
                    bandera = false;
                    
                    
                }

            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
                
            }
            System.out.printf("%s\n", cadena);
        }
    }
}
