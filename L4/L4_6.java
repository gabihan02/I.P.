class L4_6{
	
	public static void main(String[] args){
		double [] valores = {1,2,3};
		double [] pesos = {1,2,1};
		
		System.out.println("A nota do atleta e = "+mediaPonderada(valores, pesos));
		
	
	}
	
	static double mediaPonderada(double[] nvalores, double[] npesos){
		
		
		double numerador = 0;
		for(int i = 0; i<nvalores.length; i++){
			numerador += nvalores[i]*npesos[i];
		}
		
		
		double denominador = 0;
		for(double i : npesos){
			denominador += i;			
		}
		
		
		double media = (numerador)/(denominador);
		return media;
		
	}
	

}