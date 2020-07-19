class L4_7{
	/*o truque é cirar a inv(x), e então verificar se x==inv(x). Para a inv(x). */
	
	public static void main(String[] args){
		int[] teste = {3,3,2};
		
		System.out.println(palindromo(teste));
		
		
	}
	
	static boolean palindromo(int[] x){
		
		for(int i = 0; i < x.length; i+=1){				
				
			if(x[i] != x[x.length-i-1]){
			 return (false);
			}
			
		}
		return (true);
	}
}
