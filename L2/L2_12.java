class L2_12{
	public static void main(String[] args){
		boolean valorf = num (5,3,4);//hipotenusa, cateto1, cateto2
		System.out.println("os numeros formam um triangulo retangulo? "+ valorf);
	}

	static boolean num(double valor1, double valor2, double valor3){
		
	double a = Math.pow(valor1,2);
	double b = Math.pow(valor2,2);
	double c = Math.pow(valor3,2);
	
	boolean continua = true && (a == b + c);
	if (continua)return (true);
	else return (false);
	}
}