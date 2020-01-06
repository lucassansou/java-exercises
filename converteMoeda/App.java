package com.exercicio04.converteMoeda;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** CONVERSÃO PARA O DÓLAR *****");
    	
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar: ");
        float cotacaoDolar = entrada.nextFloat();
        
        System.out.print("Digite o valor em dólar: ");
        float valor = entrada.nextFloat();
        
        DecimalFormat df = new DecimalFormat("#.00");
        float conversao = valor * cotacaoDolar;
        
        System.out.println("O valor em reais é: R$ " + df.format(conversao));
        
        entrada.close();
    }
}
