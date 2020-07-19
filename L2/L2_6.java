class L2_6{
	public static void main(String[] args){
		int numero = big (6,2,3); //escolher o maior numero entre os tres
		System.out.println("O maior numero entre os tres e = "+numero);
	
	}
	
	static int big(int a, int b, int c){
		
		if ((a != b && a != c) && (a>b && a>c)) return (a);/*numeros precisam ser todos 
		diferentes entre si e a precisa ser o maior de todos para ser trasncrito*/
		if ((b != a && b != c) && (b>a && b>c)) return (b);/*numeros precisam ser todos 
		diferentes entre si e b precisa ser o maior de todos para ser trasncrito*/
		else return (c);//ultima opcao se nenhuma das anteriores for é c
		
	}


}	