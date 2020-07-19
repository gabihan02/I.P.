class L5_6{
	public static void  main(String[] args){
		int[][] matriz1 ={{-1,3},
						  {4,2}};
		
		int[][] matriz2 ={{1,2},
						  {3,4}};
		
		int[][] resultado = multiplica(matriz1, matriz2);
		int[][] parcial = multiplica(matriz1, matriz2);
		
		for (int i=0; i<resultado.length; i++) {
			for (int j=0; j<resultado.length;j++)
				System.out.print(resultado[i][j]+"\t");
			System.out.println();
		}

	}
	
	static int[][] multiplica(int[][] num1, int[][] num2){
		 
		int[][] resultado = new int[num1.length][num2.length];
	
		
		for (int m=0; m<num1.length; m++){ // m = linha num1
			for (int n=0; n<num2.length; n++){ // n = coluna num2
				for (int p=0; p<num1.length; p++){ // p = coluna num1 e linha num2 
				resultado[m][n] += num1[m][p]*num2[p][n];
				
				}
			}
		}
		
		return (resultado);
		
	}
	
	
	
}