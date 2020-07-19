class L3_26{
	public static void main(String[] args){
	
	trianguloFloyd(5);
	}
	
	static void trianguloFloyd(int n){
		
		int cont = 0;
		for (int i=1; i<=n; i++){
			for (int j=0; j<i; j++){
				cont = cont + 1;
				System.out.print(cont+" ");
			}
			System.out.println();
		}
		
	}
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}