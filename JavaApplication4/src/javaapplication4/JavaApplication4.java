/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javax.swing.JOptionPane;

/**
 *
 * @author Suporte
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String nomeAluno = JOptionPane.showInputDialog(null,"Digite seu nome: ");
       JOptionPane.showMessageDialog(null, nomeAluno+"seja bem vindo ao SENAC ");
       double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
       
    }
    
}
