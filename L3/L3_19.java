class L3_19{
	public static void main(String[] args){
		
		int n = 3;//linha
		int m = 3;//coluna
		num (m,n);
		
		
	}	
		
	static void num (int m, int n){
		int N = 1;
		while (N <= n){
			int M = 1;
			while (M <= m){
				System.out.print(M*N + "\t");
			M = M + 1;		
			}
			System.out.println();		
			
			N = N + 1;
		}
		
		
		
	}	
		
}
	

		

		