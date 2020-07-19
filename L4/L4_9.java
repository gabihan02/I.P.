class L4_9{
	public static void main(String[] args){
		
		int[] valores = {1,4,5,8};
		int[] p = posicao(valores);
		
		System.out.print("As posicoes dos numeros pares sao ");
		for(int i = 0; i < p.length; i++){
			System.out.print(p[i]+" ");
		}
		System.out.println( );	
	}
	


	static int[] posicao(int[] a){
		int pos = 0;
		
		
		int impar = 0;
		for (int i = 0; i <a.length;i++){
			if (a[i]%2 != 0){
				impar += 1;
			}
		}
		
		
		int[] p = new int[a.length - impar];
		
		
		for(int i = 0; i < a.length; i++){
			if (a[i]%2 == 0){
				p[pos] = i;
				pos += 1;
			}
		}
		return (p);	
	}


}