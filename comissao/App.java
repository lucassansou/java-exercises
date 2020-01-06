package com.exercicio05.comissao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** COMISSÂO DE VENDA *****");
    	
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a identificacao do vendedor: ");
        double idVendedor = entrada.nextDouble();
        
        System.out.print("Digite o ID da Peca: ");
        double idPeca = entrada.nextDouble();
        
        System.out.print("Digite o preço unitario da peca: ");
        double precoPeca = entrada.nextDouble();
        
        System.out.print("Digite a quantidade de peças vendidas: ");
        double quantidadeVendida = entrada.nextDouble();
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        double porcentagemComissao = 0.05;
        
        double comissao = (quantidadeVendida * precoPeca) *porcentagemComissao;
        
        System.out.println("O valor da comissao é de: R$ " + df.format(comissao));
        
        entrada.close();
    }
}
