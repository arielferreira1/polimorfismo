/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int matriz3x3 [][]= new int[3][3];
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("informe o valor para a matriz: ["+linha+"]["+coluna+"]");
                matriz3x3[linha][coluna]=leia.nextInt();
               
            }
            System.out.println("informe um valor para multiplicar");
            int valor = leia.nextInt();
        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println(matriz3x3[linha][coluna]+"\t");
            }
             System.out.println("");
        }
        }
        
        
    }
    

