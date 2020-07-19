class L7_5{
	public static void main(String[] args){
		String teste = "ovu";
		String invertido = inverte(teste);
		
		System.out.println("O string "+teste+" invertido e = "+inverte(teste));
	}
	
	static String inverte(String x){
		
		char[] array = x.toCharArray();
		
		for (int i = 0; i < x.length(); i++){
			array[i] = x.charAt(x.length()-1-i);
		}
		
		String nova = String.valueOf(array);
		return (nova);
	
		
	}
}