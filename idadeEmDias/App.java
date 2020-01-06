package com.exercicio06.idadeEmDias;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
System.out.println("***** COMISSÂO DE VENDA *****");
    	
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite os anos: ");
        int anos = entrada.nextInt();
        
        System.out.print("Digite os meses: ");
        int meses = entrada.nextInt();
        
        System.out.print("Digite os dias: ");
        int dias = entrada.nextInt();
                    
        int conversao = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("Sua idade em dias é: " + conversao + " dias");
        
        entrada.close();
    }
}
