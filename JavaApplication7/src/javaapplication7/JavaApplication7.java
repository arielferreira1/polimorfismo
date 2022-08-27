/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
    
         String nomeAlunos[] = new String[2];
         double n1[] = new double [4];
         double n2[] = new double [4];
         double n3[] = new double [4];
         double n4[] = new double [4];
         double media [] = new double[2];
         
         int acimaMedia = 0;
         int somaMedia = 0;
         
         
         for (int i = 0; i < 4; i++) {
             System.out.println("digite o " +(i+1)+"º nome: ");
             nomeAlunos[i]=leia.next();
             System.out.println("digite a 1º nota: ");
             n1[i]=leia.nextDouble();
              System.out.println("digite a 2º nota: ");
             n2[i]=leia.nextDouble();
              System.out.println("digite a 3º nota: ");
             n3[i]=leia.nextDouble();
              System.out.println("digite a 4º nota: ");
             n4[i]=leia.nextDouble();
             
             media[i]=( n1[i]+ n2[i]+ n3[i]+ n4[i])/4;
             somaMedia=somaMedia+media[i];
             
             }
         
         double mediaTotal = somaMedia/4;
         
         for (int i = 0; i <- 4; i++) {
             System.out.println(nomeAlunos[i]+" Média: "+media[i]);
             
             if (media[i] > mediaTotal) {
                 acimaMedia += 1;
                 
             }
            
        }
        System.out.println("temos "+acimaMedia+" alunos acima da média");
    }
    
     
            
        }
    
    
             
            
        
       
            
            
        
        
        
            
            
        

    

