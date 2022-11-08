/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juros;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Juros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       float saldo;
        System.out.println("digite seu saldo");
        saldo = sc.nextFloat();
        
        float saldoJu = (float) (saldo * 0.004)+ saldo;
        
        System.out.println("saldo com juros é:" + saldoJu);
        
    }
    
}
