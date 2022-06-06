package tiacademy;

import java.util.Scanner;

public class MediaSentinela {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		int contador = 0;
		
		System.out.println("Digite uma nota ou -1 para sair:");
		double nota = sc.nextDouble();
		while(nota != -1) {
			total +=nota;
			contador++;
			
			System.out.println("Digite uma nota ou -1 para sair:");
			nota =sc.nextDouble();
		}
		
		if(contador != 0) {
			double media = total / contador;
			
			System.out.printf("\nO Total de todas as notas é %.1f", total);
			System.out.printf("\nO Total de alunos %d", contador);
			System.out.printf("\nA Média da classe é de %.1f", media);
		} else {
			System.out.println("\nSem notas cadastradas.");
		}
		
		sc.close();
	}
}
