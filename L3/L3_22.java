class L3_22{
	public static void main(String[] args){
		
		System.out.println(fatorial(8));
		
	}
		
	static int fatorial (int n){
		
		int multi = 1;
		
		for (int N = 1; N<=n; N++){		
		multi = multi*N;
		
		}
		return (multi);
	}	
		
}