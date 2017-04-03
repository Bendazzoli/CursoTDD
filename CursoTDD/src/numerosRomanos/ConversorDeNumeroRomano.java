package numerosRomanos;

import java.util.HashMap;

public class ConversorDeNumeroRomano {

	private static HashMap<String, Integer> tbl_numeros_romanos = new HashMap<String, Integer>(){
 
		private static final long serialVersionUID = 1L;

		{
			put("I", 1);
			put("V", 5);
			put("X", 10);
			put("L", 50);
			put("C", 100);
			put("D", 500);
			put("M", 1000);
		}
	};
	
	public int converte(String numeroRomano) {
		int acumulador = 0;
		int ultimoVizinhoDaDireita = 0;
		int valor=0;
		
		for(int i = numeroRomano.length() - 1; i >= 0; i--) {
			int atual = tbl_numeros_romanos.get(numeroRomano.substring(i, i+1));
			
			int multiplicador = 1;
			
			if(atual < ultimoVizinhoDaDireita) multiplicador = -1;
			valor = tbl_numeros_romanos.get(numeroRomano.substring(i, i+1)) * multiplicador;
			
			acumulador = acumulador + valor;
			
			ultimoVizinhoDaDireita = atual;
		}
		return acumulador;
	}
}