class L5_5{
	public static void  main(String[] args){
		int[][] matriz1 ={{0,0,2,2},
						  {5,5,1,5},
						  {2,4,8,6},
						  {0,0,0,5}};
		
		int[][] matriz2 ={{0,0,2,2},
						  {5,5,1,5},
						  {2,4,8,6},
						  {0,0,0,5}};
		
		int[][] resultado = soma(matriz1, matriz2);
		
		for (int i=0; i<resultado.length; i++) {
			for (int j=0; j<resultado.length;j++)
				System.out.print(resultado[i][j]+"\t");
			System.out.println();
		}

	}
	
	
	static int[][] soma(int[][] num1, int[][] num2){
		
		int[][] resultado = new int[num1.length][num2.length];
		
		for (int i=0; i<num1.length; i++){ // linha
			for (int j=0; j<num1.length; j++){ // coluna
			resultado[i][j] = num1[i][j] + num2[i][j];
			}
		}
		
		return (resultado);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}