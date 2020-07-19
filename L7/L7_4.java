class L7_4{
	public static void main(String[] args){
		String teste = "arara";
		
		System.out.println("O string "+teste+" e palindromo? "+palindromo(teste));
	}
	
	static boolean palindromo(String x){
		int cont = 1;
		
		for (int i = 0; i < x.length(); i++){
			if (x.charAt(i) != x.charAt(x.length()-cont)) return false;	
			cont++;	
		}
		return true;
	}
}