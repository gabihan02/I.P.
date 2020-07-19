class L2_C {
	public static void main(String[] args){
		int a = 5;
		int b = 3;
		int c = 9;
		int aux;
		
		if (a>b) {
			aux = a;
			a = b;
			b = aux;		
		}
		
		if (b>c) {
			aux = b;
			b = c;
			c = aux;		
		}
		
		if (a>b) {
			aux = a;
			a = b;
			b = aux;
		}
		
		System.out.println(c+" "+b+" "+a);

	}
}