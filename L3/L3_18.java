class L3_18{
	/*o truque é cirar a inv(x), e então verificar se x==inv(x). Para a inv(x). */
	
	public static void main(String[] args){
		System.out.println(palindromo(0));
		System.out.println(palindromo(12));
		System.out.println(palindromo(761420));
		System.out.println(palindromo(22633622));
		System.out.println(palindromo(226353622));
	}
	
	static int inv(int x){
		int resto = 0;
		int inv = 0;
		do{
			resto = x % 10;
			x = x/10;
			inv = 10*inv + resto;	
		} while (x>0);
		
		return(inv);	
	}
	
	static boolean palindromo(int x){
		return(x==inv(x));
	}
	
}

