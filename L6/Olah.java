class L6_2{
	int modo = 1;
	
	public void cumprimenta(){
		switch (modo){
			case 1: System.out.println("Oi");
			case 2: System.out.println("Ola");
			default: System.out.println("Epa");
		}
		modo++;
		if (modo>3) modo = 1;
	}
	
	public static void main(String[] args){
		L6_2 o = new L6_2();
			for (int i =0; i<5; i++) o.cumprimenta();
	}
}
