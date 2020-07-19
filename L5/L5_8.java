class L5_8{
	public static void main(String[] args){
		
		int[][] matriz = {{2,50,4,10},
						  {0,0,11,7}};
		
		System.out.println(Indice(matriz));
	}
	
	static int ValoresCol(int[][] num, int col){
		
		int fim = 0;
		for (int i=0; i<num.length; i++){ // i = linha e col = coluna que é fixo
			if (fim < num[i][col]) fim += num[i][col];
		}
		return (fim);
	}
	
	
	static int Indice(int[][] num){		
		int indiceMax = 0;
		int somaMaior = ValoresCol(num, indiceMax);
		
		for (int i=0; i<num.length; i++){
			int somaAtual = ValoresCol(num, i);
			
			if (somaAtual == somaMaior){
				somaMaior = somaAtual;
				indiceMax = i;
			}
		}
		
					return(somaMaior);
		
	}
}