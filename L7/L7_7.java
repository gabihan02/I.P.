class L7_7{
	public static void main(String[] args){
		String teste = "Minha string e assim e a sua?";
		
		retornaLetraEspaco(teste);
	}
	
	static void retornaLetraEspaco(String x){
		String[] separados = x.split(" ");
		
		for (int i = 0; i < separados.length; i++)
			System.out.println(separados[i]);
		
	}
	

}

