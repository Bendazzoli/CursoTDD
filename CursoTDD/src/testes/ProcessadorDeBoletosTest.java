package testes;

import java.util.Arrays;

import org.junit.Test;

public class ProcessadorDeBoletosTest {
	
	@Test
	public void deveProcessarPagamentoViaBoletoUnico(){
		ProcessadorDeBoletos processar = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto boleto1 = new Boleto(150.0);
		List<Boleto> boletos = Arrays.asList(boleto1);
		
		processador.processa(boletos, fatura);
		
		assertEquals(1, fatura.getPagamentos().size());
		assertEquals(150.0, fatura.getPagamentos().get(0).getValor(), 0.00001);
	}
}