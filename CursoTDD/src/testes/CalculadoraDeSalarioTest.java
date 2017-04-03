package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import salario.CalculadoraDeSalario;
import salario.Cargo;
import salario.Funcionario;

public class CalculadoraDeSalarioTest {
	
	private CalculadoraDeSalario calculadora;
	
	@Before
	public void inicializa(){
		this.calculadora = new CalculadoraDeSalario();
	}
	
	@Test
	public void calculaSalarioDesenvolvedorAcimaLimite(){
		Funcionario funcionario = new Funcionario("Paulo", 1500.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(funcionario);
		assertEquals(funcionario.getSalario() * 0.9, salario, 0.00001);
	}
	
	@Test
	public void calculaSalarioDesenvolvedorAbaixoLimite(){
		Funcionario funcionario = new Funcionario("Paulo", 4000.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(funcionario);
		assertEquals(funcionario.getSalario() * 0.8, salario, 0.00001);
	}
	
	@Test
	public void calculaSalarioDBAAbaixoLimite(){
		Funcionario funcionario = new Funcionario("Joao", 1500.0, Cargo.DBA);
		double salario = calculadora.calculaSalario(funcionario);
		assertEquals(funcionario.getSalario() * 0.85, salario, 0.00001);
	}
	
	@Test
	public void calculaSalarioDBAAcimaLimite(){
		Funcionario funcionario = new Funcionario("Joao", 4500.0, Cargo.DBA);
		double salario = calculadora.calculaSalario(funcionario);
		assertEquals(funcionario.getSalario() * 0.75, salario, 0.0001);
	}
}