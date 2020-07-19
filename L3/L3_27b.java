class L3_27b{
	public static void main(String[] args){
	
	quociente (2,7);
	
	}

	static void quociente(int a, int b){ //o quociente da divisão de a por b
		
		
		int cont = 0;
		while (b <= a){
			a -= b;
			cont += 1;
		}	
		 System.out.println(cont);
	}
}