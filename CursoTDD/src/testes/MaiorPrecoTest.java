package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import carrinhoCompras.CarrinhoDeCompras;
import carrinhoCompras.Item;

public class MaiorPrecoTest {
	
	private CarrinhoDeCompras carrinho;
	
	@Before
	private void inicializa(){
		this.carrinho = new CarrinhoDeCompras();
	}
	
	@Test
	public void retornaZeroParaCarrinhoVazio(){
		assertEquals(0.0, carrinho.encontraMaiorValor(), 0.00001);
	}
	
	@Test
	public void retornaValorDoItemComApenasUmItemNoCarrinho(){
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		
		assertEquals(900.0, carrinho.encontraMaiorValor(), 0.00001);
	}
	
	@Test
	public void retornaItemDeMaiorValorDoCarrinho(){
		carrinho.adiciona(new Item("Geladeira", 2, 900.0));
		carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
		
		assertEquals(1800.0, carrinho.encontraMaiorValor(), 0.00001);
	}
}