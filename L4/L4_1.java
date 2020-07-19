class L4_1{
	
	public static void main(String[] args){
		float[] elementos = {1,2,4,76};
		
		System.out.print(maiorElemento(elementos));
	
	}
	
	public static float maiorElemento(float[] array){
		
		float max = array[0];
		for(int i = 0; i < array.length; i++){
			if (max < array[i])
			max = array[i];
			
		} 
		
		return (max);
	} 
	
}
 
 
 