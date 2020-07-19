class L5_9{
	public static void main(String[] args){	
		int[][] matriz = {{2,5,4,10},
						  {-3,8,5,1},
						  {4,0,11,7},
						  {4,0,11,7}};
		int[][] fim = transposta(matriz);
		 
		System.out.println("A matriz transposta e = ");
		
		for(int i = 0; i <fim.length; i++) {
			for (int j=0; j<fim.length;j++)
				System.out.print(fim[i][j]+" ");
			System.out.println();
		}
		
	}
	
	
	static int[][] transposta(int[][] num){
		
		int[][] fim = new int[num.length][num.length];
		
		
		for (int i=0; i<num.length; i++){ // linha
			for (int j=0; j<num.length; j++) // coluna
				fim[j][i] = num[i][j];
		}
			
		
		return(fim); 

	}	
		
		
		
		
		
}
	
	
	
	
	
