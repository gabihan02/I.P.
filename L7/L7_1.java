class L7_1{
	public static void main(String[] args){
		String s = "Ola";
		String s1 = "Tchau";
		String s2 = "Ola";
		
		System.out.println("String s e igual a s1? "+s.equals(s1));
		System.out.println("String s e igual a s2? "+s.equals(s2));
		System.out.println("String s1 e igual a s2? "+s1.equals(s2));
		
		s1 = s2;
		
		System.out.println();
		System.out.println("String s1 e igual a s2? "+s1.equals(s2));
		System.out.println("String s1 = "+s1);
		
		System.out.println();
		System.out.println("O tamanho da String e = "+s.length());
	}
}