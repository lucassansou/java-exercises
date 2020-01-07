package com.exercicioJava.escolha;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** POSITIVO OU NEGATIVO? *****\n");
    	
    	int num, num2, opcao;
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	do {
    		System.out.print("Digite o primeiro número: ");
        	num = entrada.nextInt();
        	
        	System.out.print("Digite o segundo número: ");
        	num2 = entrada.nextInt();
        	
    		System.out.println("\n1 – Verificar se um dos números lidos é ou não múltiplo do outro. \n" +
								"2 – Verificar se os dois números lidos são pares. \n" +
								"3 – Verificar se a média dos dois números é maior ou igual a 7.\n" +
								"4 - Sair. \n");

			opcao = entrada.nextInt();			 
			
			if (opcao == 1) {
				if (num%num2 == 0) {
					System.out.println("O número " + num + " é múltiplo de " + num2 + "! \n");
				} else {
					System.out.println("O número " + num + " não é múltiplo de " + num2 + "! \n");
				}	
			} else if (opcao == 2) {
				if (num%2 == 0 && num2%2 == 0) {
					System.out.println("Os números " + num + " e " + num2 + " são pares!\n");
				} else {
					System.out.println("Pelo menos um dos números é ímpar! \n");
				}
			} else if (opcao == 3) {
				if ((num + num2) / 2 >= 7) {
					System.out.println("A média dos números " + num + " e " + num2 + " é maior ou igual a 7! \n");
				} else {
					System.out.println("A média dos números " + num + " e " + num2 + " é menor que 7! \n");
				}
			} else if (opcao == 4) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Não é uma opção válida \n");
			}
				
		} while(opcao != 4);
    	
    	entrada.close();
    }
}
