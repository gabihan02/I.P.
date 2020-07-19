class L8_8{
	static boolean verifica(int[] a1, int x){
		
		int ini = 0;
		int fim = a1.length-1;
		
		while(ini <= fim){
			int meio = (ini+fim)/2;
			if(a1[meio]>x) fim = meio-1;
			
			else{
				if(a1[meio]<x) ini = meio+1;
				else return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] a1 = {1,2,5,7,8,80};
		System.out.println(verifica(a1,0));
	
	
	}



}