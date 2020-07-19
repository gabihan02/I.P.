// done

class Inteiro{
	
	int valor;
	
	
	void carregaValor(int v){
		valor = v;
		System.out.println(valor);
	}


	int devolveValor(){
		return valor;
	}
	
	
	int devolveValorAbsoluto(){
		
		int cont = 1;
		int abs = valor;
		if (abs >= 10){
			abs = abs/10;
			cont *=10;
		}
		return (abs*cont);
	}
	
	
	void imprime(){
		System.out.println(valor);
	}


	int soma(int v){
		int sum = valor + v;
		return sum;
	}
	
	
	int subtrai(int v){
		int menos = valor - v;
		return menos;
	}
	
	
	int multiplicaPor(int v){
		int multi = valor*v;
		return multi;
	}
	
	
	int dividePor(int divisor){
		
		if (divisor != 0){
			int div = valor/divisor;
			return (div);
		}
		
		return (valor);
	}
	

}

















