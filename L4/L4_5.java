class L4_5{
	
	public static void main(String[] args){
		double [] notas = {0,2,4,7,8,6};
		
		System.out.println("A nota do atleta e = "+media(notas));
		
	
	}
	 
	static double media(double[] array){
		
		double maior = array[0];
		for(double valor : array){
			if(valor>maior) maior = valor;
		}
		
		
		double menor = array[0];
		for(double valor : array){
			if(valor<menor) menor = valor;			
		}
		
		double media = 0;
		for(double valor : array){
			media += valor;
		}
		media = (media-maior-menor)/(array.length-2);
		return media;
		
	}
	

}
 