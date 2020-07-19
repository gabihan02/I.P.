class L4_4{
	
	public static void main(String[] args){
		int[] elementos = {0,2,4,76,18,143,145};
		
		System.out.println("A posicao do valor max e = "+valormaximo(elementos));
		System.out.println("A posicao do valor min e = "+valorminimo(elementos));
	
	}
	
	static int valormaximo(int[] array){
		
		int posMax = array[0];
		for(int i = 0; i < array.length; i++){
			if (array[posMax] <= array[i])
			posMax = i;
			
			
		} 
		return (posMax);	
	}

	static int valorminimo(int[] array){
		
		int posMin = array[0];
		for(int i = 0; i < array.length; i++){
			if (array[posMin] >= array[i])
			posMin = i;
			
		} 
			
		return (posMin);
		
	} 	

}
 