class L2_7{
	public static void main(String[] args){
		double num = temp(1, 32, 23); /*opção (celsius ou fahrenheit), 
		a medida da temperatura*/
		System.out.println("A temperatura e = "+num);	
	}


	static double temp(int opcao, double Fahrenheit, double Celsius){
		
		
		if (opcao == 0) return((5.0/9.0)*(Fahrenheit-32));
		if (opcao == 1) return((9.0/5.0)*Celsius + 32);
		else return (000000.0);
		
		
	}

}