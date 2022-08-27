/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;



/**
 *
 * @author Suporte
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    String capital;
        System.out.println("informe qual capital deseja saber = a regiao: \n"
                + "" );
        capital = entrada.next();
         switch (capital){ 
             case "Rio Branco":
             case "Macapá":
             case "Manaus":
             case "Belém":
             case "Porto Velho":
             case "Boa Vista":
             case "Palmas":
                     
                     System.out.println("fica no norte");
             case "Maceió":
             case "Recife":
             case "Aracaju":
             case "Salvador":
             case "Sao Luis":
             case "Teresina":
             case "Fortaleza":
             case "Natal":
             case "Joao Pessoa": 
             
                 System.out.println("fica no nordeste");
                 break;
                 
             case "Goiânia":
             case "Cuiába":
             case "Campo Grande":
             case "Brasília":
              
                 System.out.println("fica no centro oeste");
                 break;
                 
             case "Vitória":
             case "Belo Horizonte":
             case "Rio de Janeiro":
             case "Sao Paulo":
                 
                 System.out.println("fica no suldeste");
                 
             case "Florianíopolis":
             case "Curitiba":
             case "Porto Alegre":
             
                 System.out.println("fica no sul");
                         
         }
        
        
        
    
        }
       
        
        }
               
                    
        
        
        
     
    
    

