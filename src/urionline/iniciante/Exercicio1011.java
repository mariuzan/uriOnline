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
public class Exercicio1011 {
    public static void main(String[]args){
    
        double raio,calculo,pi;
        
        pi=3.14159;
        
        Scanner entrada= new Scanner(System.in);
        DecimalFormat formatador= new DecimalFormat("0.000");
        
        raio= entrada.nextDouble();
        calculo= (4/3.0)*pi*(Math.pow(raio,3));
        
        System.out.println("VOLUME = "+formatador.format(calculo));
        
    
    }
}
