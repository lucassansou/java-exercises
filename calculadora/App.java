package com.exercicioJava.calculadora;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** CALCULADORA ***** \n");

    	int opcao;
    	float num, num2;
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.print("Digite o primeiro número: ");
    	num = entrada.nextFloat();
    	
    	System.out.print("Digite o segundo número: ");
    	num2 = entrada.nextFloat();
	    	
    	System.out.println("\n1: Soma \n" +
							"2: Subtração \n" +
							"3: Multiplicação \n" +
							"4: Divisão \n");
    	
    	opcao = entrada.nextInt();			 
 
    	if (opcao == 1) {
       		System.out.println("Soma: " + num + " + " + num2 + " = " + (num+num2));
    	} else if (opcao == 2) {
       		System.out.println("Subtração: " + num + " - " + num2 + " = " + (num-num2));
    	} else if (opcao == 3) {
       		System.out.println("Multiplicação: " + num + " * " + num2 + " = " + (num*num2));
    	} else if (opcao == 4) {
       		System.out.println("Divisão: " + num + " / " + num2 + " = " + (num/num2));
    	} else {
    		System.out.println("Não é uma opção válida");
    	}
    	
    	entrada.close();
    }
}
