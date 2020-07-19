class L7_3{
	public static void main(String[] args){
		String teste = "Minha string e assim e a sua?";
		
		retornaLetraEspaco(teste);
	}
	
	static void retornaLetraEspaco(String x){
		
		for (int i = 0; i < x.length(); i++)
			if (x.charAt(i) == ' ') System.out.print(x.charAt(i+1));
		
	}
}