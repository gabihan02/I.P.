class L4_10{
	public static void main(String[] args){
		
		int[] teste = {1,2,1,2};
		
		boolean test = verificar(teste);
		
		if(test == true) System.out.println("decrescente");
		else System.out.println("Crescente");
		
	}
	
	static boolean verificar(int[] num){
		
		boolean decreasing = true;
		
		
		for (int i = 0; i<num.length-1; i++){
			if (num[i] < num[i+1]) decreasing = false;
			
			int test = num[i];
		
		}
		
		return decreasing;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}