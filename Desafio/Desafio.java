package tiacademy;

import java.util.Scanner;

public class Desafio {

	// C?LCULO DE IMPOSTO:
	// Cama, mesa e banho = 37,41%
	// Eletrodomo?stico = 43,14%
	// Vestu?rio = 38,42%

	// MARGEM DE LUCRO SOBRE O (PRE?O - IMPOSTO)
	// Cama, mesa e banho = 30%
	// Eletrodomo?stico = 35%
	// Vestu?rio = 50%


	public static void main(String[] args) {
		
		int qtdProdutos = 0;
		int qtdC = 0;
		int qtdE = 0;
		int qtdV = 0;
		
		double preco = 0;
		double imposto = 0;
		double lucro = 0;
		
		double precoTotalC = 0; 
		double precoTotalE = 0; 
		double precoTotalV = 0; 
		
		System.out.println("Digite a categoria do produto que quer cadastrar");
	
		System.out.println("[C] - Cama, mesa e banho");
		System.out.println("[E] - Eletrodom?sticos");
		System.out.println("[V] - Vestu?rio");
		
		Scanner sc = new Scanner(System.in);
		
		while(qtdProdutos <= 14)
		{	
			System.out.printf("\nProduto %d: ", qtdProdutos + 1);
			char opcao = sc.next().charAt(0);
			opcao = Character.toUpperCase(opcao);
			
			switch(opcao) 
			{
			
				case 'C':
					System.out.println("Digite o pre?o do produto:");
					preco = sc.nextDouble();
					
					imposto = preco * (37.41 / 100);
					lucro =  (preco - imposto) * 0.3;
					
					System.out.printf("O valor de imposto do produto ? de %.1f", imposto);
					System.out.printf("\nA margem de lucro do produto ? de  %.1f\n", lucro);
					
					precoTotalC += (preco + lucro + imposto);
					qtdProdutos++;
					qtdC++;
					break;
					
				case 'E':
					System.out.println("Digite o pre?o do produto:");
					preco = sc.nextDouble();
					
					imposto = preco * (43.14 / 100);
					lucro = (preco - imposto) * 0.35;
					
					System.out.printf("O valor de imposto do produto ? de %.1f", imposto);
					System.out.printf("\nA margem de lucro do produto ? de %.1f\n", lucro);
					
					precoTotalE += (preco + lucro + imposto);
					qtdProdutos++; 
					qtdE++;
					break;
					
				case 'V' :
					System.out.println("Digite o pre?o do produto:");
					preco = sc.nextDouble();
					
					imposto = preco * (38.14 / 100);
					lucro = (preco - imposto) * 0.5;
					
					System.out.printf("O valor de imposto do produto ? de %.1f", imposto);
					System.out.printf("\nA margem de lucro do produto ? de %.1f\n", lucro);
					
					precoTotalV += (preco + lucro + imposto);
					qtdProdutos++;
					qtdV++;
					break;
					
				default: 
					System.out.println("Digite uma categoria v?lida");
			
			}
		}
		
		System.out.printf("\n - N? de produtos Cama, mesa e banho: %d | Valor Total: %.1f",qtdC, precoTotalC);
		System.out.printf("\n - N? de produtos Eletrodom?sticos: %d | Valor Total: %.1f",qtdE, precoTotalE);
		System.out.printf("\n - N? de produtos de Vestu?rio: %d | Valor Total: %.1f",qtdV , precoTotalV);

		sc.close();
		
		
	}

}
