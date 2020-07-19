class L2_11{
	public static void main(String[] args){
		boolean valorf = valor (6,4); 
		System.out.println("O segundo e dividor do primeiro? "+valorf);
	}
	
	static boolean valor (int dado1, int dado2){
		
		boolean continua = true;
		if ((dado1%dado2) == 0.0) return (true);
		else return (false);
	}




}