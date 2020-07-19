class L8_10{
	public static int[] buscaBinariaBidimencional(int[][] n1, int x){
		int[] posicao = {-1,-1};
		int ini = 0;
		int fim = n1.length-1;
		
		if(x < n1[0][0]) return posicao;
		
		while(ini <= fim){
			if(ini == fim){
				if(x >= n1[ini][0]){
					posicao[0] = ini;
					break;
				}
				
				else{
					posicao[0] = ini - 1;
					break;
				}
			}
			
			int meio = (int)((ini+fim)/2);
			if(x>n1[meio][0]){
				posicao[0] = ini;
				ini = meio + 1;
			}
			
			else{
				if(x<n1[meio][0]){
					posicao[0] = ini - 1;
					fim = meio - 1;
				}
				
				else{
					posicao[0] = meio;
					posicao[1] = 0;
					return posicao;
				}
			}		
		}
		
		ini = 0;
		fim = n1[0].length-1;
		
		while(ini<=fim){
			if(ini == fim && ini == n1.length-1){
				if(n1[posicao[0]][ini] == x){
					posicao[1] = ini;
				}
				else break;
			}
			int meio = (int)((ini+fim)/2);
			if(x>n1[posicao[0]][meio]){
				posicao[1] = meio;
				ini = meio + 1;
			}
			
			else{
				if(x<n1[posicao[0]][meio]){
					posicao[1] = meio;
					fim = meio -1;
				}
				else{
					posicao[1] = meio;
					return posicao;
				}
			}
		}
		
		posicao[0] = -1;
		posicao[1] = -1;
		return posicao;
	}
	
	public static void main(String[] args){
		int[][] n1 = {{-55,-50,-42,-33,-30},
					  {-30,-21, -4,  0,  0},
					  {  3,  5, 18, 33, 34},
					  { 39,  5, 59, 87,122}};
		
		int[] resposta = buscaBinariaBidimencional(n1, 0);
		for(int c : resposta) System.out.print(c+" ");
	}
		
		
		
}
	
	
	
	
	
	
