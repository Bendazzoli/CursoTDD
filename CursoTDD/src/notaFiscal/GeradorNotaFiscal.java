package notaFiscal;

import java.util.Calendar;
import java.util.List;

public class GeradorNotaFiscal {
	
	private List<AcaoAposGerarNota> acoes;
	
	public void GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes){
		this.acoes = acoes;
	}

	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(), pedido.getValorTotal() * 0.94, Calendar.getInstance());
		
		for(AcaoAposGerarNota acao : acoes){
			acao.executa(nf);
		}
		
		return nf;
	}
}