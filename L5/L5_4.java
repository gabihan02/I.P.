class L5_4{
	public static void main(String[] args){
		double[][] matriz ={{1,2,3,2},
						    {5,5,1,5},
							{2,4,8,6},
							{0,0,0,5}};
		altera(matriz);
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length;j++)
				System.out.print(matriz[i][j]+" ");
			System.out.println();
		}
	}

	static double maiorElemento(double[][] num, int col){
		double fim = num[0][0];
		for (int i=0; i<num.length; i++){ // i = linha e col = coluna que é fixo
			if (fim < num[i][col]) fim = num[i][col];
		}
		return(fim);
	}


	static void altera(double[][] num){
	
	// passar por todas as linhas da primeira coluna depois 
	// passar por todas as linhas da segunda coluna... 
	// assim por diante
		
		for (int i=0; i<num.length; i++){ // coluna
			double maior = maiorElemento(num,i);
			for (int col=0; col<num.length; col++){ // linha
				if (maior < num[col][i]) maior = num[col][i];
				num[col][i] = num[col][i]/maior;
			}
		}
	}

	
}











