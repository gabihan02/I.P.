class L3_23{
	public static void main(String[] args){
		
		System.out.println(cos(3));
		
		
	}
		
	static int fatorial(int x) {
		if (x<2) return(x);
		int fatorial = 1;
	
		for (int i=2; i<=x; i++)
			fatorial *= i;
		return(fatorial);
	}

	static double cos(double x) {
		double total = 1;
		int multiplicador = -1;
		for (int i=1; i<=9; i++) {
			total += multiplicador * Math.pow(x,2*i)/fatorial(2*i);
			multiplicador = -multiplicador;
		}
		return(total);
	}


}
	


	

		
		