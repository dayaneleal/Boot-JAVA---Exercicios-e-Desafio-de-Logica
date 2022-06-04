package logica_java_parte_I;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		
		funcionario.setSalario(new BigDecimal(2500));
		System.out.println(funcionario.getSalario());
		
		System.out.println("=====================");

		ReajusteSalario.reajustarSalario(funcionario, 10);
		System.out.println(funcionario.getSalario());
		
		DescontoINSS.descontarINSS(funcionario);
		System.out.println(funcionario.getSalario());
		
	
	}

}
