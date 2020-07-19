class L3_24{
	public static void main(String[] args){
		
	System.out.println(num(1024));
	}
	
	
	static int num(int n){
		
		for (int m = 1; m<=n; m++){
			
			double x = 0;
			if (x<=n)
				x = x+Math.pow(2,m);
			
			if (x == n)
				return m;		
		}
		
	return (-1);
	}
	
	
}

	