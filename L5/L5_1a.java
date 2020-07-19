class L5_1a{
	public static void main(String[] args) {
		int[][] matriz ={{0,0,2,2},
						{5,5,1,5},
						{2,4,8,6},
						{0,0,0,5}};

		System.out.print(maior(matriz));
		}
	
	
	static int maior(int[][] num){
		
		int fim = num[0][0];
		
		for (int i=0; i<num.length; i++){ // linha
			for (int j=0; j<num.length; j++) // coluna
				if (fim < num[i][j]) fim = num[i][j];
		}
			
		
		return(fim); 

	}	
	
	
}