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
public class Exercicio1005 {
    public static void main(String[]args){
        
    double a,b,media,pesoa,pesob;
    pesoa=3.5;
    pesob=7.5;
    
    DecimalFormat formatador= new DecimalFormat("0.00000");
    
    Scanner entrada= new Scanner(System.in);
    
    a= entrada.nextDouble();
    
    
    b=entrada.nextDouble();
    
    media=((a*pesoa)+(b*pesob))/(pesoa+pesob);
    
        System.out.println("MEDIA = " +formatador.format(media));
    
    
    }
}
