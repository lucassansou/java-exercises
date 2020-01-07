package com.exercicioJava.positivoOuNegativo2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** POSITIVO OU NEGATIVO? *****\n");
    	
    	int num;
    	
    	Scanner entrada = new Scanner(System.in);
    	
	    	System.out.print("Digite um número: ");
	    	
	    	num = entrada.nextInt();
	    	
	    	if (num > 0) {
	    		int a = num;
	    		System.out.println("A = " + a);
	    	}
	    	
	    	if (num < 0) {
	    		int b = num;
	    		System.out.println("B = " + b);
	    	}
    	
    	entrada.close();
    }
}
