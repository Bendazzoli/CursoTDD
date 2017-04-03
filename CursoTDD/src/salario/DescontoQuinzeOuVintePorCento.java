package salario;

public class DescontoQuinzeOuVintePorCento extends RegraDeCalculo{
	@Override
	protected int limite() {
		return 2500;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		return 0.75;
	}

	@Override
	protected double porcentagemBase() {
		return 0.85;
	}
}