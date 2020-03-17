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
public class Exercicio1013 {
    public static void main(String[]args){
    int a,b,c;
    
    Scanner entrada= new Scanner(System.in);
    
    a= entrada.nextInt();
    
    b= entrada.nextInt();
    
    c= entrada.nextInt();
 
    if(a>b && a>c){
        System.out.println(a+" eh o maior");
    }
    else if(b>c){
        System.out.println(b+" eh o maior");
    }
    else{
        System.out.println(c+" eh o maior");
    }
    
    }
}
