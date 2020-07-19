class L3_27a{
	public static void main(String[] args){
	
	produto (7,9);
	
	}

	static void produto(int a, int b){ //o produto a*b
	
		int soma = 0;
		int cont = 1;
		while (cont <= a){
			soma = soma + b;
			cont += 1;
		}	
		 System.out.println(soma);
	}
}