/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urionline.iniciante;

import java.util.Scanner;

/**
 *
 * @author DEVELOPER
 */
public class Exercicio1007 {
    public static void main(String[]args){
    int a,b,c,d,diferenca;
    
    
    Scanner entrada= new Scanner(System.in);
    
    a=entrada.nextInt();
    
    b= entrada.nextInt();
    
    c=entrada.nextInt();
    
    d= entrada.nextInt();
    
    diferenca= ((a*b)-(c*d));
    
        System.out.println("DIFERENCA = "+diferenca);
    
    }
}
