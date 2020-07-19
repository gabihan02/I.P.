class L4_2{ 

	public static void main(String[] args){
		int[] elementos = {1,7,14,76};
		
		maiorElemento(elementos);
	
	}
	
	
	
	static void maiorElemento(int[] array){
		
		int c = array[0];
		for(int i = 0; i < array.length; i++){
			
			c = array[i];
				if (c%7==0){
				System.out.println(c);
				}
		}
		
	} 
		
	
}
 


