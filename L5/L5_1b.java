class L5_1b{
	public static void main(String[] args) {
		int[][] matriz ={{0,0,2,2},
						{5,5,1,5},
						{2,4,8,6},
						{0,0,0,5}};
		int[] posicao = maior(matriz);

		System.out.print("A posicao do maior numero se encontra em = ");
		for(int i = 0; i <posicao.length; i++){
			System.out.print(posicao[i] + " ");
		}
		System.out.println();	
		}
	
	
	static int[] maior(int[][] num){
		int[] posicao = new int[2];
	
		for (int i=0; i<num.length; i++){ // linha
			for (int j=0; j<num.length; j++) // coluna
				if (num[posicao[0]][posicao[1]] < num[i][j]){
				posicao[0] = i;
				posicao[1] = j;
				}

				
		}
			
		
		return(posicao); 

	}	
	
	
}