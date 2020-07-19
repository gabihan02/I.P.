class L3_14{
	public static void main(String[] args){
		
		int n = 2;//linha
		int m = 7;//coluna
		comprimento (m,n);
		
		
	}	
		
	static void comprimento(int m, int n){
		
		int N;
		int M;
		
		for (N = 0; N < n; N++ ){
			System.out.print("* ");
			for (M = 1; M < m; M++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}


	