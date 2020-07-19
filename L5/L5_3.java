class L5_3{
	public static void main(String[] args){
		int[][] matriz = {{-1, 0, 2},
						  {0, 0, -1},
						  {0, 1, 0}};

		DiagonalPrin(matriz);
		CadaLinha(matriz);
		CadaColuna(matriz);
		System.out.print(Permutacao(matriz));
		
	}
	
	
		static int DiagonalPrin(int[][] num){
			int soma = 0;
			int j = 0;
			
			for (int i = 0; i < num.length; i++){
					soma += num[i][j];
					j++;
					
			}
			return (soma);
		}		
		
	
		static int ValoresLinha(int[][] num, int lin){
			int fim = 0;
				for (int i=0; i<num.length; i++){ // i = coluna e lin = linha é fixo
					fim += num[lin][i];
				}
			return (fim);
		}
		
		
		static int CadaLinha(int[][] num){
			int indice = 0;
			int soma = ValoresLinha(num, indice);
			
			for (int i=0; i<num.length; i++){
				int somaAtual = ValoresLinha(num, i);
				
				if (somaAtual == soma){
					soma = somaAtual;
					indice = i;
				}
				
				if(somaAtual != soma) return (-soma);
			}
			return (soma);
		}
				
		
		static int ValoresCol(int[][] num, int col){
		
			int fim = 0;
			for (int i=0; i<num.length; i++){ // i = linha e col = coluna que é fixo
				fim += num[i][col];
			}
			return (fim);
		}
	
	
		static int CadaColuna(int[][] num){
				
			int indice = 0;
			int soma = ValoresCol(num, indice);
			
			for (int i=0; i<num.length; i++){
				int somaAtual = ValoresCol(num, i);
				
				if (somaAtual == soma){
					soma = somaAtual;
					indice = i;
				}
				
				if(somaAtual != soma) return (-soma);
				
			}
			
			return (soma);
		}
			
		
		static boolean Permutacao(int[][] num){
		
		int soma = 0;
			for(int i = 0; i < num.length; i++){// linha
				for(int j = 0; j < num.length; j++){ // coluna
				if (num[i][j] != 0 && num[i][j] != 1) return (false);
				}
				
				if (DiagonalPrin(num) == 1 &&  CadaLinha(num) == 1 && CadaColuna(num) == 1) return (true);
				
			}
			 return (false);
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
