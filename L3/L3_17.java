class L3_17{
	public static void main(String[] args){
		
	System.out.println(primo(10));
	}
	
	
	static boolean primo(int n){
		for (int i = n-1; i>1; i--){
			if (n % i == 0) return (false);
		}
	return (true);
	}
	
	
}
