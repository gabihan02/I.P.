//ex 18 e 19 da lista 4 são os mesmos
// retorne a posicao do maior elemento deste arranjo

class L4_18{
	public static void main(String[] args){
		int[] elementos = {1,76,4,76,76};
		
		System.out.print(maiorElemento(elementos));
	
	}
	
	static int maiorElemento(int[] array){
		
		int max = array[0];
		
		for(int i = 0; i < array.length; i++){
			if (array[max] < array[i])
			max = i;	
		} 
		
		return (max);
		
	} 	

}
 