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
public class Exercicio1008 {
    public static void main(String[]args){
    
       int idFunc,valorHora;
       double hora, calculo;
       
       Scanner entrada= new Scanner(System.in);
       DecimalFormat formatador= new DecimalFormat("0.00");
       
       idFunc=entrada.nextInt();
       
       valorHora= entrada.nextInt();
       
       hora= entrada.nextDouble();
       
       calculo=valorHora*hora;
       
        System.out.println("NUMBER = "+idFunc);
        
        System.out.println("SALARY = U$ "+formatador.format(calculo));
       
    }
}
