package com.exercicioJava.positivoOuNegativo;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** POSITIVO OU NEGATIVO? *****\n");
    	
    	int num;
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	do {	
	    	System.out.println("0: SAIR \n");
	    	System.out.print("Digite um número: ");
	    	
	    	num = entrada.nextInt();
	    	
	    	if (num < 0) {
	    		System.out.println("Número negativo! \n");
	    	}
	    	
	    	if (num > 0) {
	    		System.out.println("Número positivo! \n");
	    	} 
	    	
    	} while(num != 0);
    	
    	entrada.close();
    	
    }
}
 