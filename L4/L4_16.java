class L4_16{
	public static void main(String[] args){
		
	int A = 1;
	int B = 7;
	int C = 3;
	int[] conjunto = maior(A, B, C);
	
	System.out.println("O maior e o menor elemento sao = "+conjunto[0]+" "+conjunto[1]);
		
	}

	static int[] maior(int a, int b, int c){
		
		int[] conjunto = new int[3];
		
		if (a > b && a > c) conjunto[0] = a;
		if (b > a && b > c) conjunto[0] = b;
		if (c > a && c > b) conjunto[0] = c;

		if (a < b && a < c) conjunto[1] = a;
		if (b < a && b < c) conjunto[1] = b;
		if (c < a && c < b) conjunto[1] = c;
		
		return (conjunto);
	}




}