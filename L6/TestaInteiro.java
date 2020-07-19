
//done

class TestaInteiro{
	public static void main(String[] args){
		
		Inteiro i1 = new Inteiro();
		
		i1.valor = 9;
		i1.carregaValor(14);
		System.out.println(i1.devolveValor());
		System.out.println(i1.devolveValorAbsoluto());
		i1.imprime();
		System.out.println(i1.soma(2));
		System.out.println(i1.subtrai(5));
		System.out.println(i1.multiplicaPor(2));
		System.out.println(i1.dividePor(2));
		
		System.out.println();
		
		i1.valor = 1;
		i1.carregaValor(22);
		System.out.println(i1.devolveValor());
		System.out.println(i1.devolveValorAbsoluto());
		i1.imprime();
		System.out.println(i1.soma(2));
		System.out.println(i1.subtrai(5));
		System.out.println(i1.multiplicaPor(2));
		System.out.println(i1.dividePor(2));
	}
		
	
	
	
	
	
	

	
}