class L3_20{
	public static void main(String[] args){
		
	System.out.println(num(-16));
	}
	
	
	static boolean num(int n){
		
		int soma = 0;
		for (int m = 1; m<=n; m = m+2){
			soma = soma + m;
			if (Math.sqrt(n) == Math.sqrt(soma)) 
				return (true);		
		}
	return (false);
	}
	
	
}

	