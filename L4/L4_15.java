class L4_15{
	public static void main(String[] args){
		int[] num1 = {1,2,3};
		int[] num2 = {1,2,1};
		int[] resultado = soma(num1, num2);
		
		System.out.print("O resultado de p(x) e = ");
		for(int i = 0; i < resultado.length; i++){
			System.out.print(resultado[i] + " ");
		}
		System.out.println();		
	}

	static int[] soma(int[] seq1, int[] seq2){
		int[] resultado = new int [seq1.length];
		int cont = 0;
		
		
		if(seq1.length >= seq2.length){
			for (int i = seq1.length-1; i >= 0; --i){
			resultado[i] += (seq1[i]+seq2[i]+cont);
			
			cont = 0;
			
				if (seq1[i] + seq2 [i] > 9){
					cont = (seq1[i]+seq2[i])/10;
				}
			}	
		}
		
		
		if(seq1.length < seq2.length){
			for (int i = seq2.length-1; i >= 0; --i){
			resultado[i] += (seq1[i]+seq2[i]+cont);
			
			cont = 0;
			
				if (seq1[i] + seq2 [i] > 9){
					cont = (seq1[i]+seq2[i])/10;
				}
			}
		}
		
		return (resultado);	
	}

}