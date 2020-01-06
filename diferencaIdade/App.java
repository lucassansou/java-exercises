package com.exercicio01.diferencaIdade;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Digite sua idade: ");
    	int idadeUm = scanner.nextInt();
    	
    	System.out.print("Digite a idade da sua mãe: ");
    	int idadeDois = scanner.nextInt();
    	
    	int diferenca = idadeDois - idadeUm; 
    	
    	System.out.println("Minha mãe é " + diferenca + " mais velha do que eu!");
    	
    	scanner.close();
    	    
    }
}
