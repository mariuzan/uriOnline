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
public class Exercicio1009 {
    public static void main(String[]args){
        
        
        String nome;
        double salarioFixo,totalVendas,calculoComissao;
        
       Scanner entrada= new Scanner (System.in);
       DecimalFormat formatador= new DecimalFormat("0.00");
       
       nome = entrada.next();
       
       salarioFixo = entrada.nextDouble();
       
       totalVendas = entrada.nextDouble();
       
       calculoComissao=((totalVendas*15)/100)+salarioFixo;
       
        System.out.println("TOTAL = R$ "+formatador.format(calculoComissao));
        
       
    
    }
}
