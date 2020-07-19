class L4_3f{
// retornar modulo
 	
	public static void main(String[] args){
		double[] elementos1 = {1,2};
		double elemento3;
		double soma;
		
		elemento3 = modulo(elementos1);
		soma = modulo(elementos1);

		System.out.print("O modulo do numero complexo e: "+soma);
	
	}
	
	
	
	static double modulo(double[] num1){
		
		double[] elemento3 = new double[2];
		double soma;
		
		elemento3[0] = (Math.pow(num1[0],2));
		elemento3[1] = (Math.pow(num1[1],2));
		soma = elemento3[0] + elemento3[1];
		
		return (Math.sqrt(soma));
	}
		
	
		
		
}