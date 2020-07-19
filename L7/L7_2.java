class L7_2{
	public static void main(String[] args){
		String teste = "20, 2, 7, 10, 8";
		char car = '2';
		
		System.out.println(retornaPosicao(teste, car));
	}
	
	static int retornaPosicao(String x, char car){
		
		
		for (int i = 0; i < x.length(); i++)
			if (x.charAt(i) == car) return (i);
		
		
		return -1;
		
		
	}
}