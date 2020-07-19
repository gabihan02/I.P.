class L4_17{
	public static void main(String[] args){
		int[] teste = {1,2,3,4,5};
		int[] array = inverte(teste);
		
		System.out.print("O arranjo invertido e = ");
		for(int i = 0; i <array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();	
	}
	
	static int[] inverte(int[] n){
		
		int[] array = new int[n.length];
		
		for(int i = 0; i < n.length; i++){				
			array[i] = n[n.length-i-1];
		}
			
		
		return (array);
	}
}