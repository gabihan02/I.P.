class L2_5{
	public static void main(String[] args){
		double numero = valorf(1000,2);
		System.out.println("O valor final a ser pago e = "+numero);/*resposta*/
	
	}
	
	static double valorf(double vista, int opcao){
			
		
		if (opcao == 0) {//se for pagar a vista
			return (vista); 
		}
		if (opcao == 1) {//se for pagar em 2x
			return (1.1*vista);
		}
		if (opcao == 2){//se for pagar em 3x
			return (1.2*vista);
		}
		else{
			return (-1.0);
		}
		
	}
	
}




