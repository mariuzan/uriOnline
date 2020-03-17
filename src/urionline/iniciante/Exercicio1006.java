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
public class Exercicio1006 {
    public static void main(String[]args){
    
    double a,b,c,pesoa,pesob,pesoc,media;
    
    pesoa=2;
    pesob=3;
    pesoc=5;
    
    DecimalFormat formatador= new DecimalFormat("0.0");
    
    Scanner entrada= new Scanner(System.in);
    
    a= entrada.nextDouble();
    
    b = entrada.nextDouble();
    
    c = entrada.nextDouble();
    
    media=((a*pesoa)+(b*pesob)+(c*pesoc))
            /(pesoa+pesob+pesoc);
    
        System.out.println("MEDIA = "+formatador.format(media));
    
    
    }
}
