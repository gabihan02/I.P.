class L3_16{
	
	
		
	public static void main(String[] args){
		double a = 3;//investimento incial
		int n = 1;//meses
		double r = 2;//juros

		System.out.println("Numero de Meses\t\t\t Investimento acummulado");
		
		valor (a,n,r);
		
		
		
	}	
		
	static void valor(double a, int n, double r){
		
		int A = 1;
		double N = n;
		double R = r;
		
		
		while (A<=a){
			 System.out.println(A+" \t\t\t\t\t"+(A*Math.pow((1+R),(N-1)))*(1+R)+" = "+A*Math.pow((1+R),N));
			
			A = A+1;			
		}
			
		
		
		
	}	
	
	
	
}



