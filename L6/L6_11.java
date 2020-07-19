class CalculadoraDeImposto{
	
	Rendimentos rendimentos;
	TabelaDeAliquotas tabela;
	
	CalculadoraDeImposto(Rendimentos rendimentos, TabelaDeAliquotas tabela){
		this.rendimentos = rendimentos;
		this.tabela = tabela;
		
	}
	
}

class L6_11{
	public static void main(String[] args){
		
		Rendimentos r1 = new Rendimentos();
		r1.rendimentosDePessoaFisica(45012.60);
		r1.rendimentosDePessoaJuridica(2);
		r1.rendimentosDeAplicacoesFinanceiras(9);
		r1.rendimentosDeNaoTribuitaveis(6);
		System.out.println(r1.totalDeRendimentosTributaveis());
		
		TabelaDeAliquotas tab1 = new TabelaDeAliquotas();
		System.out.println(tab1.aliquota(r1.totalDeRendimentosTributaveis()));
		System.out.println(tab1.valorADeduzir(r1.totalDeRendimentosTributaveis()));
		
	}
}































