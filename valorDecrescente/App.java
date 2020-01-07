package com.exercicioJava.valorDecrescente;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** VALORES EM ORDEM DECRESCENTE *****\n");
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println("Digite o primeiro número: ");
    	int numUm = entrada.nextInt();
    	
    	System.out.println("Digite o segundo número: ");
    	int numDois = entrada.nextInt();
    	
    	System.out.println("Digite o terceiro número: ");
    	int numTres = entrada.nextInt();
    	
    	ArrayList<Integer> numeros = new ArrayList<Integer>();
    	numeros.add(numUm);
    	numeros.add(numDois);
    	numeros.add(numTres);
    	
    	Comparator<Integer> comparator = Collections.reverseOrder();
    	
    	Collections.sort(numeros, comparator);
    	
    	System.out.println("Números em ordem decrescente: " + numeros);
    	
    	entrada.close();
    }
}
