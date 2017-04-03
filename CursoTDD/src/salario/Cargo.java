package salario;

public enum Cargo {
	DESENVOLVEDOR(new DescontoDezOuVintePorCento()),
	DBA(new DescontoQuinzeOuVintePorCento()),
	TESTADOR(new DescontoQuinzeOuVintePorCento());
	
	private final RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra(){
		return regra;
	}
}