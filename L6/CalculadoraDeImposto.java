class CalculadoraDeImposto{
	
	Rendimentos rendimentos;
	TabelaDeAliquotas tabelaaliquotas;
	
	
	CalculadoraDeImposto(Rendimentos rendimentos, TabelaDeAliquotas tabelaaliquotas){
		this.rendimentos = rendimentos;
		this.tabelaaliquotas = tabelaaliquotas;
		
	}
	
}

class L6_11{
	public static void main(String[] args){
		
		Rendimentos r1 = new Rendimentos(12,17,20,40);
		CalculadoraDeImposto calc1 = new CalculadoraDeImposto();
		
		System.out.println(r1.rendimentos);
		
	}
}































