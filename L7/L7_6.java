class L7_6{

	public static void main(String[] args){
		String teste = "ola tudo bem com vc?";
		System.out.println(novo(teste));
	}

	static String novo(String antigo){
		String novo = new String(antigo);
		return(novo);
	}
}
	/** 
	ou... pode ser feito assim:
	
	static string novo(String antigo){
		return(newString(antigo));
	}
	
	*/