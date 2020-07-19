class L3_8{
	public static void main(String[] args) {
		horiz();
		for (int vert = 1; vert <= 1; vert++) lado();
		
	}
	
	static void horiz() {
		for (int comp = 1; comp < 4; comp++) System.out.print("1" + "\t");		
		System.out.println();
	}
	
	static void lado() {
		int numero;
		
		for(numero = 2; numero<=15; numero++)
			System.out.println(numero + "\t" + (numero*numero) + "\t" + (numero*numero)*numero);

	}
	
}