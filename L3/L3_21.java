class L3_21{
	public static void main(String[] args){
		
		int n = 10;//linha
		valor (n);
		
		
	}	
		
	static void valor(int n){
		
		
		for (int N = 0; N < n; N = N+1){
			if (N*n == Math.pow(N,2))
				System.out.print(":");
				else System.out.print("*");
				
			for (int M = 1; M < n; M = M+1){
				if (M*N == Math.pow(M,2))
					System.out.print(":");
					else System.out.print("*");
				
			}
			System.out.println();
		}
	
		
	}
	
}
	