class L4_11{
	public static void main(String[] args){
		
		int[] teste = {1,1,3};
		
		int[] contador = dado(teste);
		
		for(int i = 0; i < contador.length; i++){
			System.out.println(contador[i]);
		}
		System.out.println();
	
	}
	
	static int[] dado(int[] num){
		
		int[] contador = new int[6];
		
		for (int i = 0; i <num.length; i++){
			
			if (num[i] == 1){
				contador[0] +=1;				
			}
			
			if (num[i] == 2){
				contador[1] +=1;
			}
			
			if (num[i] == 3){
				contador[2] +=1;
			}
			
			if (num[i] == 4){
				contador[3] +=1;
			}
			
			if (num[i] == 5){
				contador[4] +=1;
			}
			
			if (num[i] == 6){
				contador[5] +=1;
			}
			
			
			
		}
		
		return(contador);
		
		
	}
		
		





}