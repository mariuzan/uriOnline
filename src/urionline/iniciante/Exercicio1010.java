/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionline.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author DEVELOPER
 */
public class Exercicio1010 {
    public static void main(String[]args){
    
        double codigo1,quantidade1,valorUnitario1,codigo2,quantidade2,valorUnitario2,valorTotal;
        
        Scanner entrada= new Scanner(System.in);
        DecimalFormat formatador= new DecimalFormat("0.00");
        
        codigo1= entrada.nextDouble();
        quantidade1= entrada.nextDouble();
        valorUnitario1= entrada.nextDouble();
        
        
        codigo2= entrada.nextDouble();
        quantidade2= entrada.nextDouble();
        valorUnitario2= entrada.nextDouble();
        
        valorTotal = (quantidade1*valorUnitario1)+(quantidade2*valorUnitario2);
        
        System.out.println("VALOR A PAGAR: R$ "+formatador.format(valorTotal));
    
    }
}
