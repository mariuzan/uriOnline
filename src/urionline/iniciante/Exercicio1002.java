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
public class Exercicio1002 {
       
    
    public static void main(String[] args) {
        
    Scanner entrada= new Scanner(System.in);
    double n,raio,area;
    DecimalFormat formatador= new DecimalFormat("0.0000");
    
    n = 3.14159;
    
    
    raio= entrada.nextDouble();
    
    area= n * Math.pow( raio, 2);
    
        System.out.println("A=" + formatador.format(area));
    }
}
