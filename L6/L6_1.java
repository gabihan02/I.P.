//done

class A { 
	static double a(int meses, double taxa) { 
		return Math.pow((taxa + 100) / 100, meses) -1; 
		} 
}

class B { 
	final double TAXA = 1.2;

	void b(double valorEmprestado, int meses) { 
		A a = new A(); 
		double valorDaDivida = valorEmprestado + (a.a(meses, TAXA) * valorEmprestado); 
		
		System.out.println("Divida de "+valorDaDivida+" real(is)," + "calculada com taxa de "+TAXA+"% ao mes."); 
	}
}

class L6_1{
	public static void main(String[] args){	
		
		int months = 2;
		double tax = 1;
		double valueLent = 100;
		
		A a1 = new A();
		B b1 = new B();
		
		System.out.println(a1.a(months, tax));
		
		b1.b(valueLent, months);
		
	
	}
}

















