class L3_28{
	public static void main(String[] args){
		
	System.out.println(soma(8));
	}
		
	static int cubo(int M){
		
		if (M>=1) return(M*(M-1)+1);
		else return -1;
	
	}
	
	static int soma(int M){
		

		int cub = cubo(M);
		int fim = cub + (2*(M-1));
		int soma = 0;
		while (cub<=fim){
			soma += cub;
			cub = cub + 2;
		}
		return (soma);
	}
		
		
		
}
