package com.exercicio07.relacionamentosPossiveis;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** COMISSÂO DE VENDA *****");
    	
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNum = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int segundoNum = entrada.nextInt();
        
        
        System.out.println("Igual = " + (primeiroNum == segundoNum) + "\n" +
        					"Nao Igual = " + (primeiroNum != segundoNum) + "\n" +
        					"Maior = " + (primeiroNum > segundoNum) + "\n" +
        					"Menor = " + (primeiroNum < segundoNum) + "\n" +
        					"Maior ou Igual = " + (primeiroNum >= segundoNum) + "\n" +
        					"Menor ou Igual = " + (primeiroNum <= segundoNum));
        
        entrada.close();
    }
}


