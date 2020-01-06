package com.exercicio02.login;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** Faça Login *****");
    	
        Scanner login = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        String usuario = login.nextLine();
        
        System.out.print("Digite sua senha: ");
        String senha = login.nextLine();

        
        if (usuario.equals("lucas") && senha.equals("12345")) {
        	System.out.println("***** Logado com sucesso :) *****");
        } else {
        	System.out.println("***** Usuáriou ou senha incorretos :( *****");
        }
        
        login.close();
    }
}
