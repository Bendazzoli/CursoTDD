package processadorDeBoletos;

import java.util.List;

public class Fatura {

	private Object pagamentos;
	private double valor;
	private boolean pago;

	public Fatura(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public List<Boleto> getPagamentos() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPago() {
		// TODO Auto-generated method stub
		return false;
	}

	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPago(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	public void adicionaPagamento(Pagamento pagamento){
		this.pagamentos.add(pagamento);
		
		double valorTotal = 0;
		for(Pagamento p : pagamentos) {
			valorTotal += p.getValor();
		}
		
		if(valorTotal >= this.valor) {
			this.pago = true;
		}
	}

}
