class L5_11{
	public static void main(String[] args){
		
		int[][] matriz = {{8, 0, 7},
						  {4, 5, 6},
						  {3, 10, 2}};
		DiagonalPrin(matriz);
		DiagonalSec(matriz);
		CadaLinha(matriz);
		CadaColuna(matriz);
			
		System.out.print(Verifica(matriz));
		
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
		
		
		static int DiagonalSec(int[][] num){
			int soma = 0;
			int j = num.length-1;
			
			for (int i = 0; i < num.length; i++){
					soma += num[i][j];
					j--;
					
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
			
		
		static boolean Verifica(int[][] num){
			
			if (DiagonalPrin(num) == DiagonalSec(num) && CadaLinha(num) == CadaColuna(num) && DiagonalPrin(num) == CadaLinha(num)) return (true);
			else return (false);
		}
}


