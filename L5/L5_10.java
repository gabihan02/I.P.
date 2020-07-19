 //matriz simetrica

class L5_10{
	public static void main(String[] args){	
		int[][] matriz = {{2,5,4},
						  {5,8,-5},
						  {4,-5,2}};
		 
		System.out.println("A matriz e simetrica? "+simetrica(matriz));
		
	}
	
	
	static boolean simetrica(int[][] num){
		
		
		for (int i=0; i<num.length; i++){ // linha
			for (int j=0; j<num.length; j++){ // coluna
				if (num[j][i] != num[i][j]) return false;
					
			}
		}
			
		
		return true; 

	}	
		
		
		
		
		
}
	