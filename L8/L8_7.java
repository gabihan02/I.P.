class L8_7{
	static int[] Ordena(int[] n1, int[] n2){
		int[] junto = new int[n1.length + n2.length];
		for(int i =0; i<n1.length; i++){
			junto[i] = n1[i];
		}
		
		int aux = 0;
		for(int i = 0; i<n2.length; i++){
			int cont = n1.length-1+i;
			
			while (n2[i]<junto[cont] && cont>=0){
				aux = junto[cont];
				junto[cont] = junto[cont-1];
				junto[cont+1] = aux;
				cont--;
			}
			junto[cont+1] = n2[i];
		}
		return junto;
	}
	
	
	public static void main(String[] args){
		int[] n1 = {1,3,6,7,9,10};
		int[] n2 = {2,4,5,6,8,14};
		int[] junto = Ordena(n1, n2);
		for (int c : junto) System.out.print(c+" ");
	}
}