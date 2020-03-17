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
public class Exercicio1012 {
    public static void main(String[]args){
        
        
    double a,b,c,pi,calculo,triangulo,circulo,trapezio,quadrado,retangulo;
    pi=3.14159;
    
    Scanner entrada= new Scanner(System.in);
    
    DecimalFormat formatador= new DecimalFormat("0.000");
    
    a = entrada.nextDouble();
    b = entrada.nextDouble();
    c = entrada.nextDouble();
    
    calculo=(a*c)/2;
    triangulo=calculo;    
    
    calculo=pi*(Math.pow(c,2));
    circulo=calculo;
    
    calculo=((a+b)/2)*c;
    trapezio=calculo;
    
    calculo=Math.pow(b,2);
    quadrado=calculo;
    
    calculo=a*b;
    retangulo=calculo;
    
        System.out.println("TRIANGULO: "+formatador.format(triangulo));
        System.out.println("CIRCULO: "+formatador.format(circulo));
        System.out.println("TRAPEZIO: "+formatador.format(trapezio));
        System.out.println("QUADRADO: "+formatador.format(quadrado));
        System.out.println("RETANGULO: "+formatador.format(retangulo));
     
    
    
    
    
    
    }
    
}
