class Rendimentos{
	
	double valor;
	double valor1;
	double valor2;
	double valor3;
	
	void rendimentosDePessoaFisica(double valor){
		this.valor = valor;
	}
	
	void rendimentosDePessoaJuridica(double valor1){
		this.valor1 = valor1;
	}
	
	void rendimentosDeAplicacoesFinanceiras(double valor2){
		this.valor2 = valor2;
	}
	
	void rendimentosDeNaoTribuitaveis(double valor3){
		this.valor3 = valor3;
	}
	
	double totalDeRendimentosTributaveis(){
		double total = (valor+valor2);
		return (total);
	}

}

class TabelaDeAliquotas{

	double aliquota(double totalDeRendimentosTributaveis){
		
		if(totalDeRendimentosTributaveis <= 22847.76) return 0;
		if(totalDeRendimentosTributaveis >= 22847.77 && totalDeRendimentosTributaveis <= 33919.80) return 0.075;
		if(totalDeRendimentosTributaveis >= 33919.81 && totalDeRendimentosTributaveis <= 45012.60) return 0.15;
		if(totalDeRendimentosTributaveis >= 45012.61 && totalDeRendimentosTributaveis <= 55976.16) return 0.225;
		if(totalDeRendimentosTributaveis > 55976.16) return 0.275;
		
		return 0;
	}
	
	double valorADeduzir(double totalDeRendimentosTributaveis){
		if(totalDeRendimentosTributaveis <= 22847.76) return 0;
		if(totalDeRendimentosTributaveis >= 22847.77 && totalDeRendimentosTributaveis <= 33919.80) return 1713.58;
		if(totalDeRendimentosTributaveis >= 33919.81 && totalDeRendimentosTributaveis <= 45012.60) return 4257.57;
		if(totalDeRendimentosTributaveis >= 45012.61 && totalDeRendimentosTributaveis <= 55976.16) return 7633.51;
		if(totalDeRendimentosTributaveis > 55976.16) return 10432.32;
	return 0;
	}
	
}

class CalculadoraDeImposto{
	
	double recebe(double totalDeRendimentosTributaveis){
		double total = totalDeRendimentosTributaveis;
		double apagar = total*0.15;
		return (apagar);
		 
	}
}

class L6_10{
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
		
		
		CalculadoraDeImposto calc1 = new CalculadoraDeImposto();
		System.out.println(calc1.recebe(r1.totalDeRendimentosTributaveis()));
		
		
		
		
		
		
		
	}
}



















