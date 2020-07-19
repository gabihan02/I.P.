class L5_2{
	public static void main(String[] args){
		int[][] matriz = {{2, 5, 10, 4},
						  {-3, 8, 1, 5},
						  {4, 0, 7, 11},
						  {3, -4, 1, 2}};
						  
		System.out.print(Diagonal2(matriz));
		
	}
	
	static int Diagonal2(int[][] num){
	
		int soma = 0;
		int j = num.length-1;
		
		for (int i = 0; i < num.length; i++){
				soma += num[i][j];
				j--;
				
		}
		return (soma);
		
	}
	
}