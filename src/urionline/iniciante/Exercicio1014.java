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
public class Exercicio1014 {
    public static void main(String[]args){
    
    int a;
    double b,consumo;
    
    Scanner entrada= new Scanner(System.in);
    DecimalFormat formatador= new DecimalFormat("0.000");
    
    a=entrada.nextInt();
    
    b= entrada.nextDouble();
    
    consumo=a/b;
    
        System.out.println(formatador.format(consumo)+" km/l");
    
    
    }
    
}
