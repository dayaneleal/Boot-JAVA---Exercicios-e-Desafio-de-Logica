package logica_java_parte_I;

import java.math.BigDecimal;

public class ReajusteSalario {

	public static void reajustarSalario(Funcionario funcionario, double percentualReajuste) 
	{
		
		BigDecimal reajuste = new BigDecimal(1)
				.add(new BigDecimal(percentualReajuste)
				.divide(new BigDecimal(100)));
		
		BigDecimal novoSalario = funcionario.getSalario().multiply(reajuste);
		
		funcionario.reajustarSalario(novoSalario);
		
	}
}
