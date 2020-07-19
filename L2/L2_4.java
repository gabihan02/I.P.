class L2_4 {		 
	public static void main(String[] args){
		double numero = valor (5,2,50);
		System.out.println("O valor a ser pago pelo aluno e "+numero);
	}
	
 
	static double valor(int opcao, int horas, double valorhora){
	
		double resposta;		
		
		if (opcao==0){ // opcao 0 = pagar o valor normal 
			return (valorhora*horas);
		}
		
		if (opcao==1){			
			resposta = (valorhora*horas * 0.93);// opcao 1 = pagamento com desconto 
			return resposta;
		}
		else{
			return -1.0;
		}
	
		
	}
	
	
	
}