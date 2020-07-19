class L8_6{
	int[] array;
	
	void atribuiArray(int[] array){
		this.array = array;
	}
	
	
	int nRepeticoes(int x){
		int cont = 0;
		for(int i = 0; i<array.length; i++){
			if(array[i] == x) cont++;
		}
		
		return cont;
	}
	
	
	
	void atribuiArray2(int[] array){
		for(int ult = array.length-1; ult>0; ult--){
			for(int i = 0; i<ult; i++){
				if(array[i] > array[i+1]){
					int aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
				}
			}
		}
		this.array = array;
	}
	
	public static void main(String[] args){
		int[] array = {15,3,23,5,7,1};
	}
}