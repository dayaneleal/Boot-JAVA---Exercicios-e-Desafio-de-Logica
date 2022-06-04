package logica_java_parte_I;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoINSS {

	public static void descontarINSS(Funcionario funcionario) {
		BigDecimal descontoINSS = new BigDecimal(0.11);
		
		BigDecimal salarioLiquido = funcionario.getSalario()
				.multiply(new BigDecimal(1).subtract(descontoINSS))
				.setScale(1, RoundingMode.HALF_DOWN); 
		
		funcionario.calcularSalarioLiquido(salarioLiquido);
	}
}
