package com.exercicio03.estoque;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** ESTOQUE *****");
    	
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade mínima: ");
        float quantidadeMinima = entrada.nextFloat();
        
        System.out.print("Digite a quantidade máxima: ");
        float quantidadeMaxima = entrada.nextFloat();
        
        float mediaEstoque = (quantidadeMinima + quantidadeMaxima) / 2;
        
        System.out.println("Estoque médio: " + mediaEstoque);
        
        entrada.close();
    }
}
