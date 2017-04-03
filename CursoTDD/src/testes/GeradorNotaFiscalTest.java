package testes;

import static org.junit.Assert.assertEquals;
import notaFiscal.GeradorNotaFiscal;
import notaFiscal.NotaFiscal;
import notaFiscal.Pedido;

import org.junit.Test;

public class GeradorNotaFiscalTest {
	
	@Test
	public void deveGerarNFComValorDeImpostoDescontado() {
		GeradorNotaFiscal geradorNF = new GeradorNotaFiscal();
		Pedido pedido = new Pedido("Paulo", 1000, 1);
		
		NotaFiscal notaFiscal = geradorNF.gera(pedido);
		
		assertEquals(1000 * 0.94, notaFiscal.getValor(), 0.0001);
	}
}