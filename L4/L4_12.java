class L4_12{
	public static void main(String[] args){
		
		double valorX = 2;
		double[] coeficiente = {1,2,3};
		
		System.out.print("O resultado de p(x) e = ");
		System.out.println(polinomio(valorX,coeficiente));	
	}
	
	static double polinomio(double x, double[] a){
		
		double resultado = 0;
		
		
		for (int i = 0; i < a.length; i++){
			
			resultado += (a[i]*Math.pow(x,i));
			
		}
		
		return (resultado);	
	}

}