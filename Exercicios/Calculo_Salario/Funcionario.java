package logica_java_parte_I;

import java.math.BigDecimal;

public class Funcionario {

	private String nome;
	private BigDecimal salario;
	
	public void reajustarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario; 
	}
	
	public void calcularSalarioLiquido(BigDecimal salarioLiquido) {
		this.salario = salarioLiquido;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	
	
	
}
