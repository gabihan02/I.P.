class L2_9{
	public static void main(String[] args){
		double valorf = medida (3,1); 
		/*escrever: opcao 0 = pe; 1 = jarda; 2 = milha, a medida*/ 
		System.out.println("Esse valor e igual a = "+valorf+"km");
	}
	
	static double 
	(int opcao, double valor){
		
		double resultado = (valor*25.3995*Math.pow(10,-6));//polegada -> km
		double resultado1 = (valor*12*25.3995*Math.pow(10,-6));//pe -> km
		double resultado2 = (valor*3*12*25.3995*Math.pow(10,-6));//jarda -> km
		double resultado3 = (valor*1760*3*12*25.3995*Math.pow(10,-6));//milha -> km
		
		if (opcao == 0){
			// calculo da conversao polegada -> km
			return (resultado);			
		}
		
		if (opcao == 1){
			// calculo da conversao pe -> km
			return (resultado1);			
		}
		
		if (opcao == 2){
			// calculo da conversao jarda -> km
			return (resultado2);			
		}
		
		if (opcao == 3){
			// calculo da conversao milha -> km
			return (resultado3);			
		}
			
		else return (-1.0); // = erro
	}


}


