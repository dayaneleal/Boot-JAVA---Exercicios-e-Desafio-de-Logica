package tiacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoAprovacaoAluno {

	public static void main(String[] args) {
		
		String disciplina;
		double qtdAulasDadas;
		double faltasDoAluno;
		double media;
		double soma = 0;
		double presenca;
		List<Double>notas = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da disciplina:");
		disciplina = sc.nextLine();
		System.out.println("Digite o número total de aulas dadas:");
		qtdAulasDadas = sc.nextDouble();
		
		for(int i = 0; i < 4; i++ ) {
			System.out.println("Digite as notas do aluno no "+ (i+1) +"º bimestre:");
			notas.add(sc.nextDouble());	
		}
		
		for(Double nota: notas) {
			soma += nota;
		}
		
		media = soma/ notas.size();
		
		System.out.println("Digite o total de faltas do aluno:");
		faltasDoAluno = sc.nextDouble();
		
		presenca = 100 - ( (faltasDoAluno / qtdAulasDadas) * 100 );
		
		System.out.printf("A presença do aluno foi de: %.2f%% e a média de %.2f.\n", presenca, media);
		
		if(media >= 6.0 && presenca > 75) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();
		
		
	}
}
