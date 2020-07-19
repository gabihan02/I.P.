class L3_27c{
	public static void main(String[] args){
	
	System.out.print(resto(7,2));
	
	}
	
	static int quociente(int a, int b){ //o quociente da divisão de a por b
		
		
		int cont = 0;
		while (b <= a){
			a -= b;
			cont += 1;
		}	
		 return(cont);
	}
	
	static int produto(int a, int b){ //o produto a*b
	
		int soma = 0;
		int cont = 1;
		while (cont <= a){
			soma = soma + b;
			cont += 1;
		}	
		 return(soma);
	}
	
	static int resto(int a, int b){
		
		int resto = a - produto(quociente(a, b),b);
		return (resto);
		
		
	}
	
	
		
		
		
		
	
	
}